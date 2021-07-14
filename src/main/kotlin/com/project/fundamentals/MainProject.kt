package com.project.fundamentals

import classes.Book
import classes.Login
<<<<<<< HEAD
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
=======
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
>>>>>>> main
)

suspend fun main () {

<<<<<<< HEAD
    //This code uses coroutines to print a splash screen
    val splash = Constants.SPLASH_TEXT.split("\n")
    splash.forEach {
        println(it)
        delay(100)

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
=======
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
>>>>>>> main
                user = readLine()!!.toString()
                print("\nIngrese su nombre de password: ")
                password = readLine()!!.toString()
<<<<<<< HEAD
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
=======
                login.signIn(user, password)
>>>>>>> main
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
<<<<<<< HEAD
    //This block if code shows the main menu options
    do {
        print(Constants.MENU_MAIN)
=======

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
>>>>>>> main
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
<<<<<<< HEAD
                println("LISTA DE LIBROS")
                println("ID   TITULO")
                listOfBooks.forEach { println("${it.id} ${it.title}") }
                println("Ingrese el ID para ver detalles")
                try {
                    var iBook = readLine()!!.toInt()
                    if (iBook > listOfBooks.size) {
                        println("El libro no existe")
                    } else {
                        println(listOfBooks.get(iBook-1).getBookDetails())
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
=======
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
>>>>>>> main
                    readLine()
                } catch (e: Exception) {
                    println("Hubo un error, ingrese una opcion valida $e")
                }
<<<<<<< HEAD
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
                readLine()
            }
            5 -> {
                val book1 = addBook(listOfBooks.size+1)
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
=======

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
>>>>>>> main
            }
            0 -> break
            else -> {
                println("Opcion no valida. Intenta de nuevo")
            }
        }
    } while (option != 0)
}




