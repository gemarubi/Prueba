open class Jefe:Soldado{
    var ejercito:ArrayList<Soldado> =ArrayList()
    var mensaje=""

    constructor()
    constructor(nombre: String,mensaje:String):super(nombre){
        this.mensaje=mensaje
    }
    constructor(nombre:String,mensaje:String,ejercito:ArrayList<Soldado>):super(nombre){
        this.mensaje=mensaje
        this.ejercito=ejercito
    }
    fun aniadirSoldados(cantidad:Int){
        var i=0
        while (i<cantidad) {
            ejercito.add(Soldado("Soldado $i"))
        i++
        }
    }
    fun comprobarVida(soldado: Soldado):Boolean{
        var estaVivo=true
        if (soldado.vida<=0) estaVivo=false
        return estaVivo
    }
    fun elegirSoldado():Soldado{
        var soldadoElegido=Soldado()
        do {
            soldadoElegido=ejercito.random()
        }while (!comprobarVida(soldadoElegido))


        return soldadoElegido
    }

}