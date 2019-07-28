package ejecucion
import net.liftweb.json._
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.collection.mutable.Map

object Json extends App{
  val ruta = "C:\\Users\\marco\\git\\Simulacion\\Simulacion\\src\\"
  val archivo = "parametros.json"
  implicit val formats = DefaultFormats
  cargarDatos(ruta+archivo)
  
  
  def cargarDatos(archivo:String){
    val cadena = Source.fromFile(archivo).getLines().mkString
    val json = parse(cadena)
    print(json)
  }
}