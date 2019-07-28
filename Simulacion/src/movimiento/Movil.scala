package movimiento
import plano.Punto
abstract class Movil(posicion:Punto, velocidad:Velocidad) {
  
  def devolverAngulo = velocidad.direccion.grados
  
  def aumentarPosicion(dt:Double)
}