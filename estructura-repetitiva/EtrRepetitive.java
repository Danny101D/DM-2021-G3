import  java.util.Scanner ;
/ **
 * EtrRepetitive
 * /
public  class  EtrRepetitive {

     escáner estático teclado = nuevo  escáner ( System . in);

    public  static  void  suma10NumerosMientras () {
        // Variables de Daclarar
        int contador = 1 ;
        numeros dobles , sumaNumeros = 0 ;
        // Datos de entrada y Proceso
        while (contador <= 10 ) {
            Sistema . fuera . println ( " Ingrese el valor en la posición " + contador + " : " );
            numeros = teclado . nextDouble ();
            sumaNumeros = sumaNumeros + numeros;
            contador ++ ;
        }
        Sistema . fuera . println ( " La suma de los 10 números es: " + sumaNumeros);
    }

    public  static  void  suma10NumerosHacerMientras () {
        // Variables de Daclarar
        int contador = 1 ;
        numeros dobles , sumaNumeros = 0 ;
        // Datos de entrada y Proceso
        hacer {
            Sistema . fuera . println ( " Ingrese el valor en la posición " + contador + " : " );
            numeros = teclado . nextDouble ();
            sumaNumeros = sumaNumeros + numeros;
            contador ++ ;
        }
        while (contador <= 10 );
        Sistema . fuera . println ( " La suma de los 10 números es: " + sumaNumeros);
    } 
    public  static  void  suma10NumerosPara () {
        // Variables de Daclarar        
        numeros dobles , sumaNumeros = 0 ;
        // Datos de entrada y Proceso
        para ( int contador = 1 ; contador <= 10 ; contador ++ ) {
            Sistema . fuera . println ( " Ingrese el valor en la posición " + contador + " : " );
            numeros = teclado . nextDouble ();
            sumaNumeros = sumaNumeros + numeros;            
        }
        Sistema . fuera . println ( " La suma de los 10 números es: " + sumaNumeros);
    }        

    public  static  void  main ( String [] args ) {
        Sistema . fuera . println ( "¡¡ Holas Mundo !! " );
        // suma10NumerosMientras ();
        // suma10NumerosHacerMientras ();
        suma10NumerosPara ();
    }
}