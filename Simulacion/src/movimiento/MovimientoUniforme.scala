package movimiento
trait MovimientoUniforme extends Movil {
  var velc:Double =_
  var pos:Double =_
  //dt en segundos, posicion en metros, y velc en m/s
  def aumentarPosicion(dt:Double) = {
    pos = pos + velc * dt
  }  
}