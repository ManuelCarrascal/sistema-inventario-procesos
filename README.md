# API sistema de inventario procesos

Este proyecto es una API desarrollada en Java con Gradle que proporciona operaciones CRUD para los recursos de "item" y "category". La API está conectada a una base de datos MySQL y utiliza el framework Spring Boot para la implementación de los endpoints. Los usuarios pueden realizar operaciones de creación, lectura, actualización y eliminación de los recursos a través de la API.

## Requisitos previos
- Java 8 o superior
- Gradle 6.0 o superior

## Instalación

1. Clona el repositorio en tu máquina local.
2. Abre una terminal y navega hasta el directorio del proyecto.

## Uso

Para Correr la api debes ir al archivo inventarioApplication darle a run y ya deberia empezara correr la API.


# EndPoints

## Category
### POST CATEGOTY
<code>http://localhost:8082/category</code>
### GET CATEGORY
<code>http://localhost:8082/category/{category_id}</code>
### GET CATEGORIES
<code>http://localhost:8082/category</code>
### PUT CATEGORIES
<code>http://localhost:8082/category/{category_id}</code>
### DELETE CATEGORIES
<code>http://localhost:8082/category/{category_id}</code>
## item
### POST ITEM
<code>http://localhost:8082/items</code>
### GET ITEM
<code>http://localhost:8082/items/{item_id}</code>
### GET ITEMS
<code>http://localhost:8082/items</code>
### PUT ITEM
<code>http://localhost:8082/items/{item_id}</code>
### DELETE ITEM
<code>http://localhost:8082/items/{item_id}</code>

## ENLACE DE POSTMAN
<code>https://app.getpostman.com/join-team?invite_code=cb618aaf275a04338effa2c6c229b918&target_code=6b4e402874cb5be108b7f9fcadac03ec</code>



