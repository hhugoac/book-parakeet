package project

import classes.Popular

fun popularBooks(lista: MutableList<Popular>){
    showBooks(lista)
    println("Seleccione alguna de las siguientes opciones:")
    print("(1) Agregar una calificación\n" +
            "(0) Regresar al menu anterior\n" +
            "Opción:")
    val opcion= readLine()!!.toInt()
    when (opcion){
        1 -> {
            showBooks(lista)
            print("Número del libro al que desea calificar:")
            val num= readLine()!!.toInt()
            scoreBook(num,lista)
        }
        0 -> println("Regresando...")
    }
}
fun showBooks(lista: MutableList<Popular>){
    var i=1
    println("Libros mas populares:")
    for (book in lista){
        if (book.calif < 4.0){
            println("$i ${book.title} tiene una calificacion de ${book.calif}")
            i++
        }
    }
}
fun scoreBook(num:Int,lista: MutableList<Popular>){
    var i=1
    for(book in lista){
        if(i == num){
           print("Calificación:")
           val calif= readLine()!!.toDouble()
            book.addCalif(calif)
        }
        i++
    }
}