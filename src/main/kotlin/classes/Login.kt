package classes

<<<<<<< HEAD
class
Login(user: String, password : String) {
=======
import javax.xml.bind.JAXBElement

class Login{
>>>>>>> main

    var loginMessage = "Sin registro"
    var isLogin = false

<<<<<<< HEAD
    var userAndPasswordList = mutableMapOf( "root" to "12345",
                                     "admin" to "23456",
                                     "secretary" to "5432",
                                     "bedu" to "bedu")
=======
    var userAndPasswordList: MutableMap<String, String> = mutableMapOf(
        "Jim" to "Loza",
        "bedu" to "bedu")

    //init {
      // validatePassword(user, password)
    //}
>>>>>>> main

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

<<<<<<< HEAD
    fun singUp(userName: String, password: String ) {
        userAndPasswordList[userName] = password
        loginMessage = "Registro exitoso"
        isLogin = true
=======
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
>>>>>>> main
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

}