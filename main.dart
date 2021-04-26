import 'dart:io';
void main() {
//Definir Variables y otros
print('Ejercicio 01: Area Triangulo');
//Datos de Entrada
print("Ingrese Base: ");
var b=int.parse(stdin.readLineSync());
print("Ingrese Altura: ");
var h=int.parse(stdin.readLineSync());
//Proceso
var area=(b*h)/2;
//Datos de Salida
print("El Area de Triangulo es: $area");
}
