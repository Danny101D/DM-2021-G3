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

}
