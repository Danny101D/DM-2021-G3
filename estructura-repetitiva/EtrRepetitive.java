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

    public  static  void  main ( String [] args ) {
        Sistema . fuera . println ( "¡¡ Holas Mundo !! " );
        suma10NumerosMientras ();
    }
}