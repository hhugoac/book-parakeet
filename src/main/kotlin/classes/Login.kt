package classes

/*<<<<<<< HEAD
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
=======

 */
class Login(user: String, password : String) {

    var loginMessage = "Sin registro"
    var isLogin = false


    var userAndPasswordList = mapOf( "root" to "12345",
                                     "admin" to "23456",
                                     "secretary" to "5432",
                                     "bedu" to "bedu")

    init {
        validatePassword(user, password)
    }

    fun singUp(userName: String, password: String ) {
        TODO("Add a user in the map userAndPasswordList")
    }

    private fun validatePassword(user: String, password: String){
        val isUserRegistered = user in userAndPasswordList.keys
        if (!isUserRegistered) {
            loginMessage = "Sin registro o usuario invalido"
            isLogin = false
        } else if (password == userAndPasswordList[user]) {
            loginMessage = "Inicio de sesión exitoso"
            isLogin = true
        } else {
            loginMessage = "Contraseña incorrecta"
            isLogin = false
        }
    }

/*
    fun accesoContraseña() = if (password.isEmpty()) true else false
    fun accesoCorreo() = if (correo.isEmpty()) true else false
<<<<<<< HEAD

=======
    fun accesoUsuario() = if (usuario.isEmpty()) true else false

 */

}