package com.project.fundamentals

import classes.Book
import classes.Login
import functions.*

val listOfBooks = mutableListOf(Book(1,"El principito",
    "Antoine de Saint-Exupéry",
    "Literatura infantil", 96, "La obra comienza presentando al protagonista de la historia, un aviador que siente que ha perdido la visión de niño que le acompañaba cuando era pequeño. Su avión sufre una avería en pleno desierto y tiene los recursos mínimos para sobrevivir apenas unos días, por lo que debe buscar alguna solución. Se encuentra con un niño, el Principito, muy misterioso, que le pide cosas muy extrañas. Él mismo siente la necesidad de explicar la naturaleza de este pequeño ser.",
            true),
    Book(2,"Una Tienda en París",
        "Martinez roca",
        "Literatura romantica", 352, "Novela romántica desarrollada en el París de los años veintes.", true),
    Book(3, "Procedimiento correcto en la caída libre", "Adan M.", "Tomo V", 78, "", false),
    Book(4,"Física", "Resnick, Robert", "Texto", 650, "", true)
)

suspend fun main () {

    //This code uses coroutines to print a splash screen
    val splash = Constants.SPLASH_TEXT.split("\n")
    splash.forEach {
        println(it)
    //    delay(100)

    }
    loading("Cargando")
    readLine()

    //This block of code do the login or sigup
    var option = -1
    var login : Login
    var user : String
    var password : String


    do{
        print(Constants.MENU_LOGIN)
        val line = readLine()
        option = tryCatchBlock(line)

        when(option) {
            1-> {
                println("Ingrese su nombre de usuario: ")
                user = readLine()!!.toString()
                println("Ingrese su nombre de password: ")
                password = readLine()!!.toString()
                login = Login(user, password)
                loading("Autenticando")
                println(login.loginMessage)
                option = if (login.isLogin) 0 else 1
            }
            2-> {
                println("REGISTRO")
                println("Ingrese un nombre de usuario: ")
                user = readLine()!!.toString()
                println("Ingrese su nombre de password: ")
                password = readLine()!!.toString()
                login = Login("", "")
                login.singUp(user, password)
                loading("Registrando")
                println(login.loginMessage)
                option = if (login.isLogin) 0 else 1
            }
            0 -> break
        }
    }while (option !=0 )

    option = -1
    //This block if code shows the main menu options
    do {
        print(Constants.MENU_MAIN)
        try {
            option = readLine()!!.toInt()
            if (option >= 7 || option < 0) {
                println("Ingresa una opcion valida")
            }
        } catch (e: Exception) {
            println("Hubo un error: $e")
            println("Ingrese una opcion valida")
        }
        when (option) {
            1 -> {
                println("LISTA DE LIBROS")
                println("ID   TITULO")
                listOfBooks.forEach { println("${it.id} ${it.title}") }
                println("Ingrese el ID para ver detalles")
                try {
                    var iBook = readLine()!!.toInt()
                    if (iBook > listOfBooks.size) {
                        println("El libro no existe")
                    } else {
                        println(listOfBooks.get(iBook).getBookDetails())
                    }
                    readLine()
                } catch (e: Exception) {
                    println("Hubo un error, ingrese una opcion valida $e")
                }
            }
            2 -> {
                println("LIBROS DISPONIBLES")
                println("ID-BOOK   TITLE")
                listOfBooks.forEach { if (!it.isBorrowed) println("(${it.id}) ${it.title}") }
                println("Ingrese el id del libro que desea solicitar:")

                try {
                    val id = readLine()!!.toInt()
                    //Validar
                    listOfBooks.forEach { if (it.id == id) it.isBorrowed = true }
                    loading("Solicitando")
                    println("Libro prestado")
                    readLine()
                } catch (e: Exception) {
                    println("Hubo un error, ingrese una opcion valida $e")
                }
            }
            3 -> {
                println("LIBROS PRESTADOS")
                println("ID-BOOK   TITLE")
                listOfBooks.forEach { if (it.isBorrowed) println("(${it.id}) ${it.title}") }
                println("Ingrese el id del libro que va a regresar:")
                try {
                    val id = readLine()!!.toInt()
                    listOfBooks.forEach { if (it.id == id) it.isBorrowed = false }
                    loading("Regresando libro")
                    println("Libro devuelto")
                    readLine()
                } catch (e: Exception) {
                    println("Hubo un error, ingrese una opcion valida $e")
                }
            }
            4 -> {
                listOfBooks.get(0).raiting = 4.6
                listOfBooks.get(1).raiting = 3.0
                listOfBooks.get(2).raiting = 4.0
                listOfBooks.get(3).raiting = 2.0

                listOfBooks.sortByDescending { it.raiting }
                println("LIBROS MÁS POPULARES")
                println("Calificación   Título")
                listOfBooks.forEach { println("${it.raiting} ${it.title}") }
                println("Libros más populares: $")
                readLine()
            }
            5 -> {
                val book1 = addBook(listOfBooks.size)
                if(book1.id != -1 ) {
                    listOfBooks.add(book1)
                    loading("Agregando")
                } else {
                    println("Ocurrio un error no se pudo agregar el libro")
                }
                readLine()
            }
            6 -> {
                println("LIBROS PRESTADOS")
                println("ID TITULO")
                listOfBooks.forEach { if (it.isBorrowed) println("${it.id} ${it.title}") }
                readLine()
            }
            7 -> {
                println("EVALUAR LIBRO")
                println("ID   TITULO")
                listOfBooks.forEach { println("${it.id} ${it.title}") }
                println("Ingrese el ID para evaluar libro")
                try {
                    val id = readLine()!!.toInt()
                    println("Ingrese la calificacion para evaluar libro")
                    val raiting = readLine()!!.toDouble()
                    listOfBooks.forEach { if (it.id == id) it.raiting = raiting }
                    loading("Evaluando")
                    println("Libro calificado")
                }catch (e: Exception) {
                    println("Ocurrio un error")
                }
            }
            0 -> break
            else -> {
                println("Opcion no valida. Intenta de nuevo")
            }
        }
    } while (option != 0)
}




