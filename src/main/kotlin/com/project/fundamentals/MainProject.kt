package com.project.fundamentals

import classes.Book
import classes.Borrow
import classes.Login
import classes.Popular
import project.popularBooks
import project.validateMenu

import java.text.SimpleDateFormat
import java.time.LocalDate
import sun.rmi.runtime.Log


const val SPLASH_TEXT =
    "                                                               ,&                                   \n" +
            "                                        #&.                        /%                               \n" +
            "                   %@*        *@*    @                                 &,                           \n" +
            "             ,@                    @                                       @                        \n" +
            "         /%                          .@                                       ,&                    \n" +
            "     ,@                                 %&                                        %(                \n" +
            "  #(@                                      @                                          @             \n" +
            " .@   @                                      ,@                                          *%         \n" +
            ".@@     %                                       @/                                           @%     \n" +
            "  @@@    &                                         @                #@@@&*.                   @     \n" +
            "    @@.    @                                         /@        %@/                            &@@@  \n" +
            "     &@@    (,                                          @#  &@                                 @@@@@\n" +
            "       @@,    @                            ,@@%,         .@@          #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "        %@@    ,/                    /@(                @@@@@@@* ,@@@@@@@@@@@@@&/.                  \n" +
            "          @@(    @              #@.                    &@@@@@@@@@*                                  \n" +
            "           /@@     &       ,@(              #@@@@@@@@@@@@@@@&.                                      \n" +
            "             @@@    /*,@%            %@@@@@@@@%                                                     \n" +
            "              .@@.   @          #@@@@@@@*                                                           \n" +
            "                @@@  @      @@@@@&.                                                                 \n" +
            "                 *@@&% (@@@@                                                                        \n" +
            "                   @@@#                                                                             "

var listOfBooks = mutableListOf(
    Book(
        1, "El principito",
        "Antoine de Saint-Exupéry",
        "Literatura infantil",
        96,
        "La obra comienza presentando al protagonista de la historia, un aviador que siente que ha perdido la visión de niño que le acompañaba cuando era pequeño. Su avión sufre una avería en pleno desierto y tiene los recursos mínimos para sobrevivir apenas unos días, por lo que debe buscar alguna solución. Se encuentra con un niño, el Principito, muy misterioso, que le pide cosas muy extrañas. Él mismo siente la necesidad de explicar la naturaleza de este pequeño ser.",
        true
    ),
    Book(
        2,
        "Una Tienda en París",
        "Martinez roca",
        "Literatura romantica",
        352,
        "Novela romántica desarrollada en el París de los años veintes.",
        true
    ),
    Book(
        3,
        "Procedimiento correcto en la caída libre",
        "Adan M.",
        "Tomo V",
        78,
        "",
        false
    ),
    Book(
        4,
        "Física",
        "Resnick, Robert",
        "Texto",
        650,
        "",
        true
    )
)


var listOfBorrowBooks = mutableListOf(
    Borrow(
        "El principito",
        "bedu",
        LocalDate.parse("2021-07-18")
    ),
    Borrow(
        "Una Tienda en París",
        "bedu",
        LocalDate.parse("2021-07-19")
    ),
    Borrow(
        "Procedimiento correcto en la caída libre",
        "hugo",
        LocalDate.parse("2021-07-20")
    )
)


var listOfPopularBooks = mutableListOf(
    Popular("El principito",
        "Antonie de Saint-Exupéry",
        5.0),
    Popular("La Torre Oscura",
        "Stephen King",
        4.8),
    Popular("Harry Potter",
        "J.K Rowling",
        4.6),
    Popular("La Isla de los conejos",
        "Elvira Navarro",
        5.0)
)


fun main() {
    println(SPLASH_TEXT)
    print("Presione una tecla para comenzar...")
    readLine()
    var option = -1
    var login= Login()
    var user = ""
    var password: String

    do {
        println(
            "Bienvenido: \n" +
                    "(1) Login \n" +
                    "(2) SignUp \n" +
                    "(0) Exit\n" +
                    "Opcion: "
        )
        option = validateMenu()
        when (option) {
            1 -> {
                print("Ingrese su nombre de usuario: ")
                user = readLine()!!.toString()
                print("\nIngrese su nombre de password: ")
                password = readLine()!!.toString()
                login.signIn(user, password)
                println(login.loginMessage)
                option = if (login.isLogin) 0 else 1
            }
            2 -> {
                print("Ingrese su nombre de usuario con el que se registrara:")
                user = readLine()!!.toString()
                print("\nIngrese la contraseña con la que se registrara:")
                password = readLine()!!.toString()
                login.singUp(user, password)
            }
            0 -> break
            else->{
                println("Opcion no valida")
            }
        }
    } while (option != 0)

    option = -1

    do {
        println(
            "Presione: \n" +
                    "(1) Mostrar todos los libros \n" +
                    "(2) Solicitar un libro \n" +
                    "(3) Regresar libro \n" +
                    "(4) Mostrar todos los libros \n" +
                    "(5) Mostrar los libros mas populares \n" +
                    "(6) Agregar nuevo libro \n" +
                    "(7) Ver mis libros prestados \n" +
                    "(0) Exit\n" +
                    "Ingresa una opción:"
        )
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
                popularBooks(listOfPopularBooks)
            }
            6 -> {
                addBook(listOfBooks)
            }
            7 -> {
                for (book in listOfBorrowBooks) {
                    if (user == book.userName) {
                        book.checkStatusBorrow()
                    }
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



