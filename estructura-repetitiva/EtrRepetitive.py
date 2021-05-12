def  suma10NumerosMientras ():
  contador = 1
  sumaNumeros = 0.0
  mientras  contador <= 10 :
    numeros = float ( input ( f "Ingrese el valor en la posición { contador } :" ))
    sumaNumeros = sumaNumeros + numeros
    contador = contador + 1
  print ( f "La suma de los 10 numeros es: { sumaNumeros } " )

# suma10NumerosMientras ()

def  suma10NumerosPara ():  
  sumaNumeros = 0.0
  para  contador  en  rango ( 1 , 11 ):
    numeros = float ( input ( f "Ingrese el valor en la posición { contador } :" ))
    sumaNumeros = sumaNumeros + numeros
  print ( f "La suma de los 10 numeros es: { sumaNumeros } " )
suma10NumerosPara ()