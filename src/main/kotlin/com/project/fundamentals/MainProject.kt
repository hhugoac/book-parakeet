package com.project.fundamentals

import classes.Book
import classes.Borrow
import classes.Login
import functions.*
import kotlinx.coroutines.delay

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


var listOfBorrowBooks = listOf(
    Borrow(listOfBooks.get(0).title,"bedu",210629),
    Borrow(listOfBooks.get(1).title,"bedu",210629),
    Borrow(listOfBooks.get(3).title,"hugo",210629)
)

suspend fun main () {
    //This code uses coroutines to print a splash screen

    val splash = Constants.SPLASH_TEXT.split("\n")
    splash.forEach {
        println(it)
        delay(100)

    }
    loading()
    readLine()

    var option = 1
    var login : Login
    var user : String
    var password : String

    do{
        printMenu(Constants.MENU_LOGIN, 3)
        val line = readLine()?.toString()
        option = TryCatchBlock(line)
        //option = readLine()!!.toInt()
        when(option) {
            1-> {
                println("Ingrese su nombre de usuario: ")
                user = readLine()!!.toString()
                println("Ingrese su nombre de password: ")
                password = readLine()!!.toString()
                login = Login(user, password)
                loading()
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
                loading()
                println(login.loginMessage)
                option = if (login.isLogin) 0 else 1
            }
            0 -> break
        }
    }while (option !=0 )

    option = -1

    do {
        printMenu(Constants.MENU_MAIN, 7)
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
                var i = 1
                println("Catalogo de libros presione un numero para ver los detalles:")
                for (book in listOfBooks) {
                    println("$i ${book.title}")
                    i++
                }
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
                println("Lista de libros disponibles:")
                //for( book in listOfBooks) {
                listOfBooks.forEach { if (!it.isBorrowed) println("${it.title}") }
                readLine()
            }
            3 -> {

            }
            4 -> {

            }
            5 -> {
                //popularBooks(listOfPopularBooks)
            }
            6 -> {
                val book1 = addBook(listOfBooks.size)
                listOfBooks.add(book1)
            }
            7 -> {
                for (book in listOfBorrowBooks) {
                    /*if (user == book.userName) {
                        book.checkStatusBorrow()
                    }*/
                }
                //Ver mis libros prestados
            }
            0 -> break
            else -> {
                println("Opcion no valida. Intenta de nuevo")
            }
        }
    } while (option != 0)
}



