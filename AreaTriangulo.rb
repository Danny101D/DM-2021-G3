#Declarar Variables y otros
imprimir  "Ejercicios 01: Area de un Triangulo"
#Datos de entrada
pone "Ingrese Base:"
b = obtiene . chomp . to_i
pone "Ingrese Altura:"
h = obtiene . chomp . to_i
#Proceso
área = ( b * h ) / 2
#Datos de Salida
pone  "El area del Triangulo es:" ,  area