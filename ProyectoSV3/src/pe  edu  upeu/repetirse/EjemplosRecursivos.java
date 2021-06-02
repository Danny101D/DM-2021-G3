paquete  pe.edu.upeu.recur ;

import  java.math.BigInteger ;

public  class  EjemplosRecursivos {
 
     factorial largo  público ( int numero ) { 
        resultado largo = 1 ;
        if (numero > 1 ) {
            para ( int i =  1 ; i <= numero; i ++ ) {
                resultado = resultado * i;
            }
        }
         volver resultado;
      } 
          
      public  long  factorialRecur ( int  numero ) {
        resultado largo = 1 ;
        if (numero > 1 ) {
            return factorialRecur (numero - 1 ) * numero;
        } más {
            volver resultado;
        }        
      }       

      public  BigInteger  factorialBig ( int  numero ) {
        BigInteger resultado = new  BigInteger ( " 1 " );
        if (numero > 1 ) {
            para ( int i =  1 ; i <= numero; i ++ ) {
                resultado = resultado . multiplicar ( nuevo  BigInteger ( String . valueOf (i)));
            }
        }
         volver resultado;
      } 
            
      public  BigInteger  factorialRecurBig ( int  numero ) {
        BigInteger resultado = new  BigInteger ( " 1 " );
        if (numero > 1 ) {
            return factorialRecurBig (numero - 1 )
            .multiply ( new  BigInteger ( String . valueOf (numero)));
        } más {
            volver resultado;
        }        
      }    

      public  int  fibonacci ( int  numero ) { // 5
          int numAnt = 0 , numNew = 1 , numAux = 0 ;
          if (numero > 1 ) { //   0 1: 1 2 3 5
            para ( int cont =  1 ; cont < numero; cont ++ ) {
                numAux = numNew; // 1
                numNew = numAnt + numNew;
                numAnt = numAux;
            }
            return numNew;
          }
        return numero;
      }


      public  int  fibonacciRecur ( int  numero ) {
        if (numero > 1 ) {       
            return fibonacciRecur (numero - 1 ) + fibonacciRecur (numero - 2 );
        }
            return numero;
       }      





}