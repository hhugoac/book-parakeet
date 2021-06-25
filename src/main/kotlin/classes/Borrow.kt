package classes

class Borrow (var bookBorrow: String,
              var userName: String,
             var dateReturn: Int)     {

    var isReturned = false

    fun returnBook() {
        if (!isReturned) {
            isReturned = true
        }
    }

    fun checkStatusBorrow() {
        //Todo change datereturn type for a date type here is only with educational porpouse
        if (dateReturn > 10) {
            print("Debes devolver el libro")
        }  else {
            print("Aun tienes tiempo para leer el libro")
        }
    }
}