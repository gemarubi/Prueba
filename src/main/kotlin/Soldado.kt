open class Soldado {
    var nombre=""
    var vida=100
    var fuerza:ArrayList<Int> =ArrayList()
    var fuerzaEmpleada=0
    constructor(nombre:String){
    this.nombre=nombre
    }
    constructor()

    fun ataca(soldado: Soldado):Soldado{
    generarFuerza()
    println("$nombre ataca con .. : $fuerzaEmpleada")
    println("$nombre $vida - ${soldado.fuerzaEmpleada} = $vida")
        print("${soldado.nombre} ${soldado.vida} - $fuerzaEmpleada = ")
        soldado.vida=soldado.vida-fuerzaEmpleada
        println(soldado.vida)
        return soldado
    }

    fun generarFuerza(){
        fuerzaEmpleada=(0..70).random()

    }
}