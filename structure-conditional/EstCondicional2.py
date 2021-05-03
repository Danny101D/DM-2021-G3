def estCondicional02():
 #Definir variables y otros
 print("Ejemplo estructura Condicional en Python 02")
 montoP=0
 #Datos de entrada
 cantidadX=int(input("Ingrese la cantidad de personas:"))
 #Proceso
 if cantidadX<=200:
 montoP=cantidadX*95
 elif cantidadX>200 and cantidadX<=300:
 montoP=cantidadX*85
 else:
 montoP=cantidadX*75
 #Datos de salida
 print("El monto a pagar es:", montoP)
def estCondicional02():
  #Definir variables y otros
  print("Ejercicio 02 Est. Condicional")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad personas invitadas:"))
  #Proceso
  if cantidadX<200:
    montoP=cantidadX*95
  elif cantidadX>200 and cantidadX<=300:
    montoP=cantidadX*85
  else:
    montoP=cantidadX*75
  #Datos de salida
  print("La cantidad a pagar es:", montoP)

  estCondicional02() 