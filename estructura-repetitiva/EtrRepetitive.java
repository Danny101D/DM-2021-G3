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
            contador ++ ; // contador = contador + 1;
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

    public  static  void  menuMain () {
        int opcionAlg = 0 ;
        String mensaje = " Seleccione el algortimo que desea probar: " +
        " \ n 1 = suma10NumerosMientras " +
        " \ n 2 = suma10NumerosHacerMientras " +
        " \ n 3 = suma10NumerosPara " +
        " \ n 4 = suma10NumerosMientras " +
        " \ n 0 = Salir del Programa "
        ;
        Sistema . fuera . println (mensaje);
        opcionAlg = teclado . nextInt ();
        hacer {                        
            switch (opcionAlg) {
                caso  1 : suma10NumerosMientras (); romper ;
                caso  2 : suma10NumerosHacerMientras () ;; romper ;
                caso  3 : suma10NumerosPara (); romper ;
                caso  4 : suma10NumerosMientras (); romper ;
                predeterminado :  System . fuera . println ( "¡ Opción no existe! " ); romper ;    
            } 
            Sistema . fuera . println ( "¿ Desea seguir probando algoritmos ?: " + mensaje);           
            opcionAlg = teclado . nextInt ();
        } while (opcionAlg ! = 0 );        
    }


    public  static  void  main ( String [] args ) {
        menuMain ();
    }



}