# Enlace al video

video: https://drive.google.com/drive/folders/15nF4-5I_dK_vb78CGNBbKgJ15deoxJDy?usp=sharing

------------------------------------------------------------------------

# Sistema Escolar -- Desafío Spring Boot

Este proyecto es una evolución del sistema de gestión escolar, 
transformándolo de una aplicación de consola/persistencia básica 
a un **Servicio Web RESTful** , utilizando **Spring Boot**, **MySQL** y documentación automática con **Swagger/OpenAPI**.

------------------------------------------------------------------------

## Tecnologías Utilizadas

* **Java 17**
* **Spring Boot 3.2.4**
* **Spring Data JPA**: Para el manejo de la persistencia de datos.
* **MySQL**: Base de Datos relacional para el almacenamiento persistente.
* **Hibernate**: Motor de mapeo objeto-relacional (ORM).
* **Lombok**: Para la reducción de código repetitivo (Boilerplate).
* **Springdoc OpenAPI (Swagger)**: Para la generación de documentación interactiva de la API.
* **Maven**: Gestor de dependencias y construcción del proyecto.


##  Estructura del Proyecto

El proyecto sigue una arquitectura multicapa para asegurar la escalabilidad y el mantenimiento:

src/main/java/sv/edu/udb/
├── controller/          # Controladores REST (Endpoints de la API)
├── service/             # Interfaces de la lógica de negocio
│   └── impl/            # Implementaciones de los servicios
├── repository/          # Interfaces de acceso a datos (Spring Data JPA)
├── domain/              # Entidades del modelo de datos (JPA Entities)
└── SpringApiRestApplication.java


## Autor

Giovanni Alberto Ruano Martinez\
Desarrollo de Aplicaciones con Web Frameworks\
Universidad Don Bosco
