package functions

import classes.Book

fun addBook(id: Int): Book {
    try {
        print("Nombre del libro:")
        val title= readLine()!!.toString()
        print("\nNombre del autor:")
        val author= readLine()!!.toString()
        print("\nGénero:")
        val gender = readLine()!!.toString()
        print("\nNúmero de páginas del libro:")
        val pages= readLine()!!.toInt()
        print("\nResumen:")
        val sum= readLine()!!.toString()

        return Book(id, title, author, gender, pages, sum, false)
    } catch (e: Exception) {
        return Book(-1,"","","",-1,"", false)
    }
}