package classes

class Login {

    val usuario = ""
    val correo = ""
    val contrasena = ""

    fun accesoContraseña() = if (contrasena.isEmpty()) true else false
    fun accesoCorreo() = if (correo.isEmpty()) true else false
    fun accesoUsuario() = if (usuario.isEmpty()) true else false
}