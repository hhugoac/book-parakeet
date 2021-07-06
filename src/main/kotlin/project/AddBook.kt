package com.project.fundamentals

import classes.Book
import com.sun.corba.se.spi.presentation.rmi.PresentationManager
import org.omg.CORBA.Object

fun addBook(lista: MutableList<Book>) {
    print("Nombre del libro:")
    val book= readLine()!!.toString()
    print("\nNombre del autor:")
    val author= readLine()!!.toString()
    print("\nGénero:")
    val gender = readLine()!!.toString()
    print("\nNúmero de páginas del libro:")
    val pages= readLine()!!.toInt()
    print("\nResumen:")
    val sum= readLine()!!.toString()

    var newBook = Book("$book","$author","$gender", pages ,"$sum",true)
    val flag = newBook.validateFields()
    if (flag == true){
        lista.add(newBook)
        println("Libro agregado con exito")
    }else{
        println("No se puso agregar el libro")
    }
}