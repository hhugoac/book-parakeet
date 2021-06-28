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

        fun validateFields() : Boolean {
            if(title.length > 40){
                println("El campo titulo no puede tener mas de 40 caracteres")
                return false
            }
            else if (author.length > 30){
                println("El campo autor no puede tener mas de 30 caracteres")
                return false
            }
            else if(gender.length > 15){
                println("El campo genero no puede tener mas de 15 caracteres")
                return false
            }
            else if(pages is Int){
                println("El campo pages debe ser del tipo Int")
            }
            else if(summary.length > 100){
                println("El campo resumen no puede contener mas de 100 caracteres")
            }
            else if(title is String || author is String || gender is String || summary is String){
                println("El campo titulo, autor, genero o resumen debe ser del tipo String")
            }
            return true
        }



    }