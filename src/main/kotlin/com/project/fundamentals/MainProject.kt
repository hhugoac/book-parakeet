package com.project.fundamentals

import classes.Book
import classes.Login

const val SPLASH_TEXT = "                                                               ,&                                   \n" +
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

val listOfBooks = listOf(Book("El principito",
    "Antoine de Saint-Exupéry",
    "Literatura infantil", 96, "La obra comienza presentando al protagonista de la historia, un aviador que siente que ha perdido la visión de niño que le acompañaba cuando era pequeño. Su avión sufre una avería en pleno desierto y tiene los recursos mínimos para sobrevivir apenas unos días, por lo que debe buscar alguna solución. Se encuentra con un niño, el Principito, muy misterioso, que le pide cosas muy extrañas. Él mismo siente la necesidad de explicar la naturaleza de este pequeño ser."),
    Book("Una Tienda en París",
        "Martinez roca",
        "Literatura romantica", 352, "Novela romántica desarrollada en el París de los años veintes."))
fun main () {
    println(SPLASH_TEXT)
    println("Presione una tecla para comenzar")
    readLine()

    var option = 1
    var login : Login
    var user : String
    var password : String

    do{
        println("Presione: \n" +
                "(1) Login \n" +
                "(0) Exit")
        option = readLine()!!.toInt()
        when(option) {
            1-> {
                println("Ingrese su nombre de usuario: ")
                user = readLine()!!.toString()
                println("Ingrese su nombre de passwor: ")
                password = readLine()!!.toString()
                login = Login(user, password)
                println(login.loginMessage)
                option = if (login.isLogin) 0 else 1
            }
            0 -> break
        }
    }while (option !=0 )

    do{
        println("Presione: \n" +
                "(1) Mostrar todos los libros \n" +
                "(2) Solicitar un libro \n" +
                "(3) Regresar libro \n" +
                "(4) Mostrar todos los libros \n" +
                "(5) Mostrar los libros mas populares \n" +
                "(6) Agregar nuevo libro \n" +
                "(0) Exit")
        option = readLine()!!.toInt()
        when(option) {
            1-> {
                for

            }
            2-> {

            }
            3-> {

            }
            4-> {

            }
            5-> {

            }
            6-> {

            }
            0 -> break
        }
    }while (option !=0 )

    TODO("Book details")

    TODO("Add book")
}


