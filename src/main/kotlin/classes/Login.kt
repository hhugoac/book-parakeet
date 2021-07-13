package classes

import javax.xml.bind.JAXBElement

class Login{

    var loginMessage = "Sin registro"
    var isLogin = false

    var userAndPasswordList: MutableMap<String, String> = mutableMapOf(
        "Jim" to "Loza",
        "bedu" to "bedu")

    //init {
      // validatePassword(user, password)
    //}

    fun singUp(userName: String, password: String): MutableMap<String, String> {
        val flag= checkRegistered(userName,password)
        if(flag == false){
            userAndPasswordList.set(userName, password)
            println("Usuario registrado con exito")
            //println("Trayendo datos ${userAndPasswordList.get(userName)}")
//        signIn(userName, password)
            return userAndPasswordList
        }else{
            println("Usuario ya registrado. Inicia sesion")
        }
        return userAndPasswordList
    }

    private fun checkRegistered(userName:String,password: String):Boolean{
        val filtered = userAndPasswordList.filterKeys { it==userName }
        if(filtered.isEmpty()){
            return false
        }else{
            if(filtered.containsValue(password)){
                return true
            }
            else{
                return false
            }
        }
    }

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