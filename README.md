# 🛒 Tienda Básica Full-Stack

Este proyecto es una aplicación web full-stack para una tienda básica. Tiene como objetivo principal aprender a construir una página web completa con frontend, backend y conexión a una base de datos en la nube, aplicando buenas prácticas de desarrollo.

---

## 📌 Objetivos del Proyecto

- Aprender desarrollo web full-stack usando **HTML, CSS, Java 17 y Spring Boot**.
- Estructurar correctamente un backend con capas: **modelo, repositorio, servicio y controlador**.
- Conectar el frontend con el backend mediante peticiones HTTP (REST).
- Usar una **base de datos en la nube gratuita** (ej. PostgreSQL en Render).
- Mantener todo el proyecto organizado en un mismo repositorio, separado por carpetas (`backend-api` y `frontend`).
- Subir el código a **GitHub**.

---

## ✅ Requerimientos Funcionales

### 1. Gestión de Productos
- [ ] Ver lista de productos
- [ ] Ver detalle de un producto
- [ ] Crear producto
- [ ] Editar producto
- [ ] Eliminar producto

### 2. Gestión de Usuarios
- [ ] Registrar usuario
- [ ] Iniciar sesión
- [ ] Cerrar sesión

### 3. Carrito de Compras
- [ ] Agregar productos al carrito
- [ ] Ver productos en el carrito
- [ ] Quitar productos del carrito

### 4. Órdenes (futuro)
- [ ] Finalizar compra
- [ ] Ver historial de pedidos

---

## 🗂️ Estructura del Proyecto

tienda-basica/
├── backend-api/ # Proyecto Spring Boot con Java 17
│ ├── controller/
│ ├── model/
│ ├── repository/
│ ├── service/
│ └── application.properties
├── frontend/ # HTML, CSS y JS
│ ├── index.html
│ ├── css/
│ └── js/
├── .gitignore
└── README.md


---

## 🔧 Tecnologías Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- HTML5 y CSS3
- Git & GitHub
- PostgreSQL en la nube (Render o Supabase)

---

## 🚀 ¿Cómo ejecutar el proyecto?

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/tienda-basica.git
