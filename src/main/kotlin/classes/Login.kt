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
class Login{

    var loginMessage = "Sin registro"
    var isLogin = false

    var userAndPasswordList: MutableMap<String, String> = mutableMapOf("Jim" to "Loza")

    fun singUp(userName: String, password: String): MutableMap<String, String> {
        userAndPasswordList.set(userName, password)
        println("Trayendo datos ${userAndPasswordList.get(userName)}")
//        signIn(userName, password)
        return userAndPasswordList
    }

//    init {
//        validatePassword(user, password)
//    }


    private fun validatePassword(user: String, password: String) {

        println("Lista en funcion validate $userAndPasswordList")
        val isUserRegistered = user in userAndPasswordList
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

    fun signIn(user: String, password: String){
        validatePassword(user, password)
    }

/*
    fun accesoContraseña() = if (password.isEmpty()) true else false
    fun accesoCorreo() = if (correo.isEmpty()) true else false
<<<<<<< HEAD

=======
    fun accesoUsuario() = if (usuario.isEmpty()) true else false

 */

}