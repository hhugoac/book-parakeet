package classes


import java.text.SimpleDateFormat
import java.time.LocalDate

class Borrow (var bookBorrow: String,
              var userName: String,
             var dateReturn: LocalDate)     {

    var isReturned = false

    fun returnBook() {
        if (!isReturned) {
            isReturned = true
        }
    }

    fun checkStatusBorrow() {
        //Todo change datereturn type for a date type here is only with educational porpouse
        var now= LocalDate.now()
        now = LocalDate.parse(now.toString())
        var fechaDev=dateReturn
        var plusdays = now.plusDays(10)
        if (plusdays.isEqual(fechaDev) == true ) {
            println("Debes devolver el libro $bookBorrow")
        }  else {
            println("Aun tienes tiempo para leer el libro $bookBorrow")
        }
    }

    fun getBorrowedBooks(){
        var now = LocalDate.now()
        now = LocalDate.parse(now.toString())
        var fechaDev= dateReturn
        var plusdays= now.plusDays(10)
        if(plusdays.isEqual(fechaDev) == false){
            println("$bookBorrow aun le quedan ${dateReturn.minus()}")
        }
    }


}