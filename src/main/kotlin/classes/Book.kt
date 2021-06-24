package classes

import java.util.*

class Libro {
        var title:String
        var author:String

        get() {
            println("Llamada al get para el title del libro")
            return field
        }

        set(newTitle){
            field =newTitle
        }

        constructor(title:String, autor:String){
            this.title=title
            this.author=autor
        }
    }