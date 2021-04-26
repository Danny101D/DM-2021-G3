  
importar  'dart: io' ;
void  main () {
// Definir Variables y otros
print ( 'Ejercicio 01: Area Triangulo' );
// Datos de Entrada
print ( "Ingrese Base:" );
var b = int . analizar (stdin. readLineSync ());
print ( "Ingrese Altura:" );
var h = int . analizar (stdin. readLineSync ());
// Proceso
var área = (b * h) / 2 ;
// Datos de Salida
print ( "El Area de Triangulo es: $ area " );
}