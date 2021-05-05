import  java.util.Scanner ;
class  EstCondicional {
   escáner estático teclado = nuevo  escáner ( System . in);
  static  void  ejercicio01 () {
    // Definir variables y otros
    Sistema . fuera . println ( " Ejemplo estructura Condicional en Java " );
    int cantidadX = 0 ;
    doble montoP = 0 ;
    prueba {
    // Datos de Entrada
    Sistema . fuera . println ( " Ingrese la cantidad de lapices: " );
    cantidadX = teclado . nextInt ();
    // Proceso
    si (cantidadX > = 1000 ) {
    montoP = cantidadX * 0.80 ;
    } más {
    montoP = cantidadX * 0.90 ;
    }
    // Datos de salida
    Sistema . fuera . println ( " El monto a pagar es: " + montoP);
    } captura ( Excepción e) {
      Sistema . fuera . println ( " Error en ingreso de datos! volver ejecutar " );
    }
  }

  static  void  ejercicio02 () {
    // declarar variables
    int cantidadX;
    montoP doble ;
    // Datos de Entrada
    Sistema . fuera . println ( " Ingrese la cantidad de personas invitadas: " );
    cantidadX = teclado . nextInt ();
    // Proceso
    si (cantidadX <= 200 ) {
      montoP = cantidadX * 95 ;
    } else  if (cantidadX > 200  && cantidadX <= 300 ) {
      montoP = cantidadX * 85 ;
    } más {
      montoP = cantidadX * 75 ;
    }
    // Datos de salida
    Sistema . fuera . println ( " El monto a pagar es: " + montoP);
  }

  static  void  bonoTrabajadorDMP () {
    // Definir variables
    int anhoAnt;
    sueldo doble , bonoAnt = 0 , bonoSueld = 0 , bonoReal = 0 ;
    // Datos de Entrada
    Sistema . fuera . print ( " Ingrese anhos de antiguedad: " );
    anhoAnt = teclado . nextInt ();
    Sistema . fuera . print ( " Ingrese el sueldo del trabajador: " );
    sueldo = teclado . nextDouble ();
    // Proceso
    if (anhoAnt > 2  && anhoAnt < 5 ) {
      bonoAnt = sueldo * 0.20 ;
    } más  si (anhoAnt > = 5 ) {
      bonoAnt = sueldo * 0.30 ;
    }

    si (sueldo < 1000 ) {
      bonoSueld = sueldo * 0.25 ;
    } más  si (sueldo > = 1000  && sueldo <= 3500 ) {
    bonoSueld = sueldo * 0.15 ;
    } más {
    bonoSueld = sueldo * 0.10 ;
    }
    if (bonoAnt > = bonoSueld) {
      bonoReal = bonoAnt;
    } más {
      bonoReal = bonoSueld;
    }
    // Datos de salida
    Sistema . fuera . println ( " El trabajador tendra un bono de: " + bonoReal +  " \ n Sin embargo su bono por antiguedad es:   " + bonoAnt + " y el bono por sueldo es: " + bonoSueld);
  }

  static  void  notaPostulanteEstMultiple () {
    // Definir variables
    String areaCarrera;
    doble notaEP, notaRM, notaRV, notaAB, notaFinal = 0 ;
    // Datos Entrada
    Sistema . fuera . println ( " Introduce el área a la que corresponde tu carrera: \ n B = Biomedicas \ n I = Ingenieria \ n S = Sociales " );
    areaCarrera = teclado . Siguiente();
    Sistema . fuera . println ( " Ingrese la nota de EP: " );
    notaEP = teclado . nextDouble ();
    Sistema . fuera . println ( " Ingrese la nota de RM: " );
    notaRM = teclado . nextDouble ();
    Sistema . fuera . println ( " Ingrese la nota de RV: " );
    notaRV = teclado . nextDouble ();
    Sistema . fuera . println ( " Ingrese la nota de AB: " );
    notaAB = teclado . nextDouble ();   
    // Proceso
    switch (areaCarrera) {
      caso  " B " : {
        notaFinal = (notaEP * 0.40 ) + (notaRM * 0.10 ) + (notaRV * 0.20 ) + (notaAB * 0.30 );
        areaCarrera = " Biomedicas " ;
        } romper ;
      caso  " I " : {
        notaFinal = (notaEP * 0.40 ) + (notaRM * 0.30 ) + (notaRV * 0.15 ) + (notaAB * 0.15 );
        areaCarrera = " Ingenierias " ;        
      } romper ;
      caso  " S " : {
        notaFinal = (notaEP * 0.40 ) + (notaRM * 0.10 ) + (notaRV * 0.30 ) + (notaAB * 0.20 );
        areaCarrera = " Sociales " ;        
      } romper ;
      predeterminado : { System . fuera . println ( " La opcion que ingreso no es valida ... intente nuevamente !. " ); } romper ;
    }
    // Datos de salida
    Sistema . fuera . println ( " El postulante obtuvo una nota de: " + notaFinal + " \ n Y su carrera correspondiente al area de: " + areaCarrera);

  }


  public  static  void  main ( String [] arg ) {
   // ejercicio01 ();
   // ejercicio02 ();
  // bonoTrabajadorDMP ();
  notaPostulanteEstMultiple ();
  }
}