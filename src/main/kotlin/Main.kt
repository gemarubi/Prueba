fun main(args: Array<String>) {

    var alfonso=Jefe()
    var yusulf=Jefe()
    var fuerzaCristiano=0
    var fuerzaMoro=0
    yusulf.aniadirSoldados(3)
    alfonso.aniadirSoldados(3)
    var soldadoCrisitiano=alfonso.elegirSoldado()
    var soldadoMoro=yusulf.elegirSoldado()
    soldadoMoro=soldadoCrisitiano.ataca(soldadoMoro)






}