def  estCondicional01 ():
  #Definir variables y otros
  print ( "Ejemplo estructura Condicional en Python" )
  montoP = 0
  #Datos de entrada
  cantidadX = int ( input ( "Ingrese la cantidad de lapices:" ))
  #Proceso
  si  cantidadX > = 1000 :        
    montoP = cantidadX * 0.80
  otra cosa :
    montoP = cantidadX * 0.90  
  #Datos de salida
  print ( "El monto a pagar es:" , montoP )
def  estCondicional02 ():
  #Definir variables y otros
  print ( "Ejercicio 02 Est. Condicional" )
  montoP = 0
  #Datos de entrada
  cantidadX = int ( input ( "Ingrese la cantidad de personas invitadas:" ))
  #Proceso
  si  cantidadX < 200 :
    montoP = cantidadX * 95
  elif  cantidadX > 200  y  cantidadX <= 300 :
    montoP = cantidadX * 85
  otra cosa :
    montoP = cantidadX * 75
  #Datos de salida
  print ( "La cantidad a pagar es:" , montoP )
def  votoElecciones ():
  print ( "Como saber si puedes votar por tu edad" )
  mensaje = ""
  edadP = int ( input ( "ingrese la edad que tiene:" ))
  si  edadP > = 18 :
    mensaje = "Usted tiene la edad necesaria para votar"
  otra cosa :
    mensaje = "Usted no cumple con la edad mínima para votar"
  imprimir ( mensaje )

def  pagoSemanaBase40horas ():
  print ( "Pago semanal del trabajador" )
  sueldoPagarSem = 0.0
  #Datos de entrada
  horasTra = int ( input ( "Ingrese horas trabajadas a la semana:" ))
  horasPago = int ( input ( "Ingrese el pago por hora:" ))
  #Proceso 
  si  horasTra > 40 :
    sueldoPagarSem = 40 * horasPago + ( horasTra - 40 ) * 2 * horasPago
  otra cosa :
    sueldoPagarSem = horasTra * horasPago
  #Datos de salida
  print ( "El sueldo a pagar al trabajador es:" , sueldoPagarSem )

def  notaPostulanteEstMultiple ():
  #Definir Variables
  notaFinal = 0
  #Datos de entrada  
  areaCarrera = input ( "Introduce el area a la que corresponde tu carrera: \ n B = Biomedicas \ n I = Ingenieria \ n S = Sociales" )  
  notaEP = float ( input ( "Ingrese la nota de EP:" ))
  notaRM = float ( input ( "Ingrese la nota de RM:" ))
  notaRV = float ( input ( "Ingrese la nota de RV:" ))
  notaAB = float ( input ( "Ingrese la nota de AB:" ))
  #Proceso
  si  areaCarrera == "B" :    
    notaFinal = ( notaEP * 0.40 ) + ( notaRM * 0.10 ) + ( notaRV * 0.20 ) + ( notaAB * 0.30 )
    areaCarrera = "Biomedicas"
  elif  areaCarrera == "I" :
    notaFinal = ( notaEP * 0.40 ) + ( notaRM * 0.30 ) + ( notaRV * 0.15 ) + ( notaAB * 0.15 )
    areaCarrera = "Ingenierias"
  elif  areaCarrera == "S" :
    notaFinal = ( notaEP * 0.40 ) + ( notaRM * 0.10 ) + ( notaRV * 0.30 ) + ( notaAB * 0.20 )
    areaCarrera = "Sociales"
  otra cosa :
    print ( "La opcion que ingreso no es valida ... intente nuevamente !." )
  print ( "El postulante obtuvo una nota de:" , notaFinal , " \ n Y su carrera corresponde al area de:" , areaCarrera )         



# estCondicional01 ()
# estCondicional02 ()
#votoElecciones ()
# pagoSemanaBase40horas ()
notaPostulanteEstMultiple ()