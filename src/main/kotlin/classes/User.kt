package classes

import java.util.*

class User {
        var name:String
        var lastName:String
        var birthday:Date
        var email:String
        var phone: String
        var password: String

        constructor(name:String, lastName:String, birthday:Date,email:String,phone:String,password:String){
            this.name=name
            this.lastName=lastName
            this.birthday=birthday
            this.email=email
            this.phone=phone
            this.password=password
        }

        fun getUserDetails(){
            println("Usuario $name $lastName." +
                    "Cumpleaños $birthday")
        }


    }