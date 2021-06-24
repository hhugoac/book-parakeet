package classes

import java.util.*

class Book {
        var title:String
        var author:String
        var gender:String
        var pages:Int
        var summary:String

        constructor(title:String, author:String, gender:String, pages:Int,summary:String){
            this.title=title
            this.author=author
            this.gender=gender
            this.pages=pages
            this.summary=summary
        }

        fun getBookDetails(){
            println("El libro se llama $title de $author." +
                    "Contiene $pages y es del genero $gender. Se trata de $summary")
        }
    }