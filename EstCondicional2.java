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

  public  static  void  main ( String [] arg ) {
   // ejercicio01 ();
   ejercicio02 ();
  }
}