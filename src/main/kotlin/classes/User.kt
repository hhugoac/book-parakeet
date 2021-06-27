package classes

import java.util.*

class User {
        var name:String
        var lastName:String
        var city:String
        var birthday:Date
        var email:String
        var password: String

        constructor(name:String, lastName:String, city:String, birthday:Date,email:String,password:String){
            this.name=name
            this.lastName=lastName
            this.birthday=birthday
            this.email=email
            this.password=password
        }

        fun getUserDetails(){
            println("Usuario $name $lastName." +
                    "Cumpleaños $birthday")
        }


    }