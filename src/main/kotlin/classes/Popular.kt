package classes


class Popular(var title:String, var author:String, var calif:Double){
    fun addCalif(newCal: Double){
        val new= (calif+newCal)/2
        println("Se ha agregado la calificación")
        this.calif = new
    }
}