import scala.io.StdIn.readLine
object Area TSCX
def main(args: Array[String]) = {
  //Declaracion de Variables y otros
  println("Ejercicio 01: Area Triangulo")
//Datos de Entrada
println ("Ingrese Base")
val b = readLine().toInt
println("Ingrese Altura:")
val h = readLine().toInt
//Proceso
val area=(b*h)/2
//Datos de Salida
println("El area del triangulo es:"+area)
}
}