package classes

class Book(var id: Int,
           var title: String,
           var author: String,
           var gender: String,
           var pages: Int,
           var summary: String,
           var isBorrowed: Boolean) {

    var raiting: Double = 5.0

    fun getBookDetails(): String {
        return "El libro se llama $title de $author." +
                "Contiene $pages y es del genero $gender. Se trata de $summary"
    }
}