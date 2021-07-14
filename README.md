# Tinder de libros

## Tabla de contenido

* [Integrantes](#integrantes)
* [Nombre del proyecto](#nombre-del-proyecto)  
* [Descripción](#Descripción)
* [Función](#Función)
* [Historias de usuario](#historias-de-usuario)  
* [Requerimientos](#requerimientos)

## Integrantes
- Andrea Gutierrez Hernandez
- Hector Hugo Alonzo
- Jim Loza
- Regina Lopez Luna

## Descripción
Tinder de Libros es una aplicación que funciona para buscar y prestar libros que estén cercanos
a tu localidad. Por medio de un registro en la aplicación, se pueden agregar libros, y ver las
solicitudes que se hacen al libro. Los prestamos tienen un periodo vigente suficiente para que
el solicitante pueda leer el libro y tener comunicación con el prestador todo el tiempo.

## Función
Para ejecutar este programa, es necesario hacer "Run" en el archivo **MainProject.kt** ubicado en el package *com.project.fundamentals*

## Historias de usuario
Hemos definido las siguientes historias de usuario:
* Como usuario, quiero inciar sesión.
* Como usuario quiero revisar los libros que he registrado en la plataforma.
* Como usuario, quiero ver los libros que tengo en prestamo
* Como usuario, quiero solicitar un libro 
* Como usuario, quiero ver los libros mas populares
* Como usuario, quiero calificar un libro
* Como usuario, quiero devolver un libro
* Como usuario, quiero agregar un libro

Como siguiente paso, quisieramos implementar las siguientes historias:
* Como usuario, quiero editar los datos del libro
* Como usuario, quiero eliminar un libro de mi cuenta
* Como usuario, quiero editar los datos de mi cuenta o cancelarla
* Como usuario, quiero interactuar con los usuarios a los que presto mis libros
* Como administrador, quiero editar o eliminar un usuario y sus datos

## Requerimientos

### Flujo de trabajo
Primero se debe registrar un nuevo usuario o hacer login
Por ahora, en la pantalla principal se muestran las opciones a los libros, como mostrar un libro, solicitar un libro, regresar un libro, mostrar los libros mas populares y calificar un libro.

La siguiente imagen muestra nuestro diagrama de flujo simplificado
![Diagrama de flujo](https://github.com/hhugoac/book-parakeet/blob/main/Diagrama-Flujo.png)

### Qué espero que haga el proyecto
Por ahora, como la interacción con el usuario es por medio de la consola, se pretende simular el funcionamiento de la aplicación

### Qué tipo de usuario tendra nuestro proyecto
- Tenemos el usuario de la aplicación

### Qué acciones puede realizar cada usuario
- El usuario de la aplicación puede agregar, editar datos de los libros dependiendo si se agrega una clasificación, si se devuelve un libro o si se da de alta un libro

### Qué clases hemos definido al momento
- Las clases que tenemos definidas son Login y Book.

### Siguientes pasos de trabajao
Como "next steps" del trabajo, hay que mejorar las implementaciones de las funciones actuales para hacer aun más real agregar, editar y eliminar la información. De igual manera hay que agregar más validaciones y buscar la forma de implementar las siguientes historias de usuario de la lista

