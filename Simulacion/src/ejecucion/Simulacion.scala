package ejecucion
import mapa.Via
//Singleton Object para que solo haya una instancia
import movimiento.Vehiculo
import scala.util
object Simulacion extends Runnable{
  
  val aleatorio = scala.util.Random
  var dt:Double =_
  var tRefresh:Double = _
  var minVehiculos:Int = _
  var maxVehiculos:Int = _
  var minVelocidad:Int =_
  var maxVelocidad:Int =_
  var t: Int =0
  val sizeListaVehiculos = minVehiculos + aleatorio.nextInt(maxVehiculos-minVehiculos)
  val listaVehiculos:Array[Vehiculo] =  new Array[Vehiculo](sizeListaVehiculos)
  val listaVias:Array[Via] = new Array[Via](0)
  
 def run() {
 /*while (true) {
 listadevehiculosOSimilar.foreach(_.mover(dt))
 t += dt
 Grafico.graficarVehiculos(listadevehiculosOSimilar)
 Thread.sleep(tRefresh)
 }*/
}
}