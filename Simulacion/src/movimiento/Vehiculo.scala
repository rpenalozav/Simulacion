package movimiento
import plano.Punto
abstract case class Vehiculo(val placa:String)(val posi:Punto,val vel:Velocidad)
extends Movil(posi,vel) with MovimientoUniforme {
  //velc = vel.magnitud/3.6 conversion de km/h a m/s
  //pos = posi.x o posi.y dependiendo de la dirección del movimiento
}