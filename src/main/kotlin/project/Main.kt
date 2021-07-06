package project
import classes.Login
import kotlin.math.log


fun main() {
    Menu()
    var option=validarOption(readLine()?.toInt())
    when(option){
        1 -> {
            print("Ingresa correo:")
            val email= readLine()?.toString()
            print("Ingresa contraseña:")
            val password = readLine()?.toString()
            var login = Login("$email","$password")
//            login.validateLogin()
        }
    }
}

fun Menu(){
    println("##########TINDER DE LIBROS#########")
    println("Presione una tecla para comenzar")
    println("1. Iniciar sesión")
    println("2. Registrarse")
    println("3. Salir")
    print("Seleccione una opcion:")
}

fun validarOption(option: Int?): Int{
    when(option){
        1 -> return 1
        2 -> return 2
        3 -> return 3
        else -> {
            println("Opcion no valida")
            Menu()
            validarOption(readLine()?.toInt())
            return -1
        }
    }
}


