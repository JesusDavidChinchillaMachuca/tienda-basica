package com.tienda.service;

import com.tienda.model.Producto;
import com.tienda.repository.ProductoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Método para obtener todos los productos
    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    // Método para obtener un producto por su ID
    public Optional<Producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }

    // Método para crear un nuevo producto
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Método para actualizar un producto existente
    public Producto actualizarProducto(Long id, Producto productoActualizado) {
        return productoRepository.findById(id).map(producto -> {
            producto.setNombre(productoActualizado.getNombre());
            producto.setDescripcion(productoActualizado.getDescripcion());
            producto.setPrecio(productoActualizado.getPrecio());
            producto.setStock(productoActualizado.getStock());
            return productoRepository.save(producto);
        }).orElse(null);
    }

    // Método para eliminar un producto por ID
    public boolean eliminarProducto(Long id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // Método que se ejecuta automáticamente al iniciar la aplicación
    // Inserta productos de ejemplo solo si la base está vacía
    @PostConstruct
    public void cargarDatosDeEjemplo() {
        if (productoRepository.count() == 0) {
            productoRepository.saveAll(List.of(
                    new Producto("Laptop", "Laptop Dell Inspiron", 3500000, 10,
                            "https://m.media-amazon.com/images/I/71s1LRpaprL._AC_SL1500_.jpg"),
                    new Producto("Pc", "Computador de escritorio de alto rendimiento", 15000000, 5,
                            "https://clonesyperifericos.com/wp-content/uploads/2025/02/Pc-gamer-legendario-2025.webp"),
                    new Producto("Teclado", "Teclado mecánico RGB", 120000, 15,
                            "https://pcgamermedellin.com/wp-content/uploads/2024/09/teclado-gamer-redragon-kumara-k552-rgb-1.jpg")
//                    new Producto("Pc", "", 1500000, 15,
//                            "https://clonesyperifericos.com/wp-content/uploads/2025/02/Pc-gamer-legendario-2025.webp")
            ));
            System.out.println("✔ Productos de ejemplo insertados.");
        }
    }
}