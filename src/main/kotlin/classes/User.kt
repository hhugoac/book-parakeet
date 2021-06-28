package classes

import java.util.*

class User (name:String, lastName:String, email:String,phone:String,password:String){
        var name:String=""
        var lastName:String=""
        var email:String=""
        var phone: String=""
        var password: String=""

        init{
            validateData(name,"name")
            validateData(lastName,"lastName")
            validateData(email,"email")
            validateData(phone,"phone")
            validateData(password,"password")
        }
        private validateData(valor:String,campo:String){
            when(campo){
                "name" -> {
                    if(valor.length > 15){
                        println("El contenido no puede tener mas de 15 caracteres")}
                    else{
                        this.name=valor}
                }
                "lastName" ->{
                    if(valor.length > 20){
                        println("El contenido no puede tener mas de 20 caracteres")}
                    else{
                        this.lastName=valor}
                }
                "email"->{
                    if(!valor.contains("@")){
                        println("El contenido del elemento debe contener un @")}
                    else{this.email=valor}
                }
                "phone"->{
                    if(valor.length >10 || valor.length <9){
                        println("El numero debe ser a 10 digitos")}
                    else{this.phone=valor}
                }
                "password"->{
                    if(valor.length >8){
                        println("La contraseña no puede ser de mas de 10 digitos")}
                    else{this.password=valor}}
            }
        }

        fun getUserDetails(){
            println("Usuario $name $lastName." +
                    "Cumpleaños $birthday")
        }

        fun changeEmail(new: String):Boolean{
            if(new.contains("@")){
                this.email=new
                println("Correo cambiado con exito")
                return true
            }else{
                println("El dato ingrsado debe contener @")
                return false
            }
       }

        fun changePassword(new : String):Boolean{
            if(new.length > 8){
                println("La contraseña no puede ser de mas de 8 caracteres")
                return false
            }else{
                this.password= password
                println("La contraseña ha sido cambiada con exito")
                return false
            }
        }
    }