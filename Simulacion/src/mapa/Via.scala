package mapa
import plano.Recta
class Via (iorigen:Interseccion,ifinal:Interseccion,velmax:Int,
    nombreVia:String,tipoVia:TipoVia,sentido:Sentido)extends Recta {
  type T = Interseccion
  val origen = iorigen
  val fin = ifinal
}