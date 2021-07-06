package classes

fun main(){
val mLibro =Book("Las aventuras de Mickey","Walt Dinesy", "Aventuras", 84, "Las mejores aventuras de Mickey", false)
    println(mLibro.title)
    mLibro.title="Las aventuras de Mickey y de Donald"
    mLibro.getBookDetails()

}
