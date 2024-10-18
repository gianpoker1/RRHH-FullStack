# Proyecto Full Stack de Gestión de Empleados

Este proyecto es una aplicación full stack para la gestión de empleados. Utiliza Java con Spring Boot en el backend y JavaScript con React en el frontend.

## Características

- **Backend**
    - Desarrollado en Java con Spring Boot.
    - Base de datos MySQL.
    - CRUD completo para la gestión de Empleados.
    - Manejo de excepciones personalizadas.
 
- **Frontend**
    - Desarrollado en JavaScript con React.
    - Interfaz de usuario amigable para la gestión de Empleados.
    - Uso de Bootstrap para el diseño de la interfaz.

## Tecnologías Utilizadas

**Backend:**
  - Java
  - Spring Boot
  - Spring Data JPA
  - Hibernate
  - MySQL

**Frontend:**
  - JavaScript
  - React
  - Axios
  - SweetAlert2
  - React Router


## Instalación

### Backend
1. Clona el repositorio:
```
  git clone https://github.com/gianpoker1/RRHH-FullStack
  cd RRHH-FullStack/backend
```

2. Configura la base de datos:
  Asegúrate de tener una base de datos MySQL configurada.
  Actualiza las configuraciones de la base de datos en `src/main/resources/application.properties.`

3. Ejecuta el backend

### Frontend

1. Navega al directorio del frontend:
   
   `cd RRHH-FullStack/backend`

2. Instala las dependencias:

   `npm install`

3. Ejecuta el frontend::

   `npm start`


## Estructura del Proyecto

### Backend:

  - **src/main/java/gian/rrhh/controllers**: Controladores REST.
  - **src/main/java/gian/rrhh/model**: Modelos de datos.
  - **src/main/java/gian/rrhh/service**: Servicios de negocio.
  - **src/main/java/gian/rrhh/repositories**: Repositorios de acceso a datos.

### Frontend:

  - **src/empleados**: Gestion (Listado, agregar, editar) empleados.
  - **src/platilla**: Barra de navegacion. 
