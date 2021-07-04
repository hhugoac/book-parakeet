package classes

class Login (email: String,password: String){
    var correo=email
    var contrasena=password

    fun validateLogin():Boolean{
        if(correo == "admin" && contrasena == "123"){
            println("Inicio de sesión exitoso! Bienvenido")
            return true
        }else if (correo.isEmpty() || correo != "admin" || contrasena.isEmpty() || contrasena != "123"){
            println("Correo o contraseña erroneo, favor de verificar")
            return false
        }
        return false
    }

    fun accesoContraseña() = if (contrasena.isEmpty()) true else false
    fun accesoCorreo() = if (correo.isEmpty()) true else false

}