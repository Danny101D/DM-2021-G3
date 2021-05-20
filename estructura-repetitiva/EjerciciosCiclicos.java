import  java.util.Random ;
import  java.util.Scanner ;

public  class  EjerciciosCiclicos {
  
     escáner estático teclado = nuevo  escáner ( System . in);

    public  static  void  contarNumerosNegPosCero () {
        // Variables de Daclarar
        int nNumeros, cantCero = 0 , cantNeg = 0 , cantPost = 0 ;
        numeros dobles ;
        int numInit = 0 , numFinal = 0 ;
        // datos de entrada
        Sistema . fuera . println ( " Ingrese N cantidad: " );
        nNumeros = teclado . nextInt ();
        NumAleatorio aleatorio =  new  Random ();
        // Proceso
        for ( int numero = 1 ; numero <= nNumeros; numero ++ ) {
            / * System.out.print ("Ingrese el valor de la posición" + numero + ":"); * /
            / * numeros = teclado.nextDouble (); * /
            numeros = numAleatorio . nextInt ( 10 ) - 4 ;
            Sistema . fuera . println (numeros);
            si (numeros < 0 ) {cantNeg ++ ;}
            if (numeros > 0 ) {cantPost = cantPost + 1 ;}
            if (numeros == 0 ) {cantCero + = 1 ;}             
        }
        // datos de salida
        Sistema . fuera . println ( " De total de numeros: \ n " + cantCero + " es / son cero (s) " +
        " \ n " + cantNeg + " es / son menor (es) de cero " +
        " \ n " + cantPost + " es / son mayor (es) de cero "
        );
    }

     pagoHamburgesas vacío estático  público () { 
        // Variables de Daclarar
        String tipoPago;
        int cantidad;
        doble totalPago = 0 ;
        int contador = 1 ;
        // proceso y datos de entrada
        while (contador <= 3 ) {
            if (contador == 1 ) {
                Sistema . fuera . println ( " Ingrese la cantidad de hamburgesas simples: " );
                cantidad = teclado . nextInt ();
                totalPago = totalPago + cantidad * 20 ;
            }
            if (contador == 2 ) {
                Sistema . fuera . println ( " Ingrese la cantidad de hamburgesas Dobles: " );
                cantidad = teclado . nextInt ();
                totalPago = totalPago + cantidad * 25 ;
            }
            si (contador == 3 ) {
                Sistema . fuera . println ( " Ingrese la cantidad de hamburgesas Triples: " );
                cantidad = teclado . nextInt ();
                totalPago = totalPago + cantidad * 28 ;
            }  
            contador ++ ;                  
        }
        // datos de salida, entrada
        Sistema . fuera . println ( " Ingrese la forma de pago (Con tarjeta = CT, Sin tarjeta = ST): " );
        tipoPago = teclado . Siguiente();
        if (tipoPago . toUpperCase () . equals ( " CT " )) {
            totalPago = totalPago + totalPago * 0.05 ;
        } 
        Sistema . fuera . println ( " El monto total a pagar es: " + totalPago);
    }


    public  static  void  main ( String [] args ) {
        // contarNumerosNegPosCero ();
        pagoHamburgesas ();
    }
}