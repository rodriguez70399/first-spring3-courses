# Proyecto Spring Boot de Gestión de Cursos

Este repositorio contiene un proyecto Spring Boot que implementa una API para la gestión de cursos. El proyecto utiliza Maven como sistema de gestión de dependencias y construcción. En este README, aprenderás cómo poner en marcha el proyecto y cómo utilizarlo.

## Prerrequisitos

Antes de comenzar, asegúrate de tener instalado lo siguiente en tu entorno de desarrollo:

- **Java**: Asegúrate de tener Java JDK 8 o una versión posterior instalada en tu sistema.
- **Maven**: Debes tener Maven instalado para compilar y construir el proyecto.
- **Git**: Si no tienes Git instalado, puedes descargarlo [aquí](https://git-scm.com/downloads).

## Clonar el Repositorio

Primero, clona este repositorio en tu máquina local usando el siguiente comando de Git:

```bash
git clone https://github.com/TuUsuario/tu-proyecto.git
```

Reemplaza TuUsuario y tu-proyecto con tu nombre de usuario y el nombre del repositorio, respectivamente.

## Configuración del Proyecto

Abre una terminal y navega hasta la raíz del proyecto clonado:

```bash
cd tu-proyecto
```

Asegúrate de que tengas Maven instalado y ejecuta el siguiente comando para compilar y construir el proyecto:

```bash
mvn clean install
```

Esto descargará las dependencias necesarias y generará el archivo JAR ejecutable del proyecto.

## Ejecutar la Aplicación

Para ejecutar la aplicación Spring Boot, utiliza el siguiente comando:

```bash
mvn spring-boot:run
```

La aplicación se ejecutará en el puerto predeterminado 8080.


# Uso de la API

Puedes utilizar la herramienta Postman para interactuar fácilmente con la API de gestión de cursos. A continuación, se detallan los pasos para realizar diferentes operaciones utilizando Postman.

## Configurar el Entorno de Postman

Descarga e instala [Postman](https://www.postman.com/downloads/), si aún no lo tienes instalado.

Abre Postman y crea un nuevo entorno llamado "API de Cursos". Esto te permitirá configurar y guardar las variables de entorno para las solicitudes.

Configura la variable de entorno "base_url" con el valor `http://localhost:8080`. Esto facilitará la configuración de las rutas en tus solicitudes.

## Alta de un Curso

Para crear un curso, realiza una solicitud POST a la siguiente URL:

- POST http://localhost:8080/course

Asegúrate de incluir un objeto JSON con los detalles del curso en el cuerpo de la solicitud. Por ejemplo:

```json
{
    "id": 5,
    "name": "Nuevo Curso",
    "duration": 15,
    "price" : 10
}
```

## Búsqueda de un Curso

Para buscar un curso por su ID, realiza una solicitud GET a la siguiente URL, proporcionando el ID del curso que deseas buscar:

- GET http://localhost:8080/course/1

## Actualización de la duración de un curso

Para actualizar la duración de un curso, realiza una solicitud PUT a la siguiente URL, proporcionando el ID del curso y la nueva duración como parámetros:
  
- PUT http://localhost:8080/course/1?duration=10
  
## Eliminación de un Curso

Para eliminar un curso, realiza una solicitud DELETE a la siguiente URL, proporcionando el ID del curso que deseas eliminar:

- DELETE http://localhost:8080/course/1