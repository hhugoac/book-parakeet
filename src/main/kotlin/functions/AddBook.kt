package functions

import classes.Book

fun addBook(id: Int): Book {
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
    //var id= 1

    return Book(id+1, title, author, gender, pages, sum, false)
    //id=id+1

    //var newBook = Book(book,author,gender ,pages,sum,true)
    //val flag = newBook.validateFields()
    //if (flag == true){
        //lista.add(newBook)
        println("Libro agregado con exito")
    //}else{
      //  println("No se puso agregar el libro")
    //}
}