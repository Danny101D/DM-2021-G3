paquete  pe.edu.upeu.util ;

import  java.io.BufferedReader ;
import  java.io.InputStreamReader ;

 clase  pública Teclado {
    BufferedReader br =  new  BufferedReader (
        nuevo  InputStreamReader ( System . in));


    public  int  leer ( int  valor , String  msg ) {
       Sistema . fuera . println (mensaje);
       prueba {
        valor = Entero . parseInt (br . readLine ());
       } captura ( Excepción e) {
           valor = leer (valor, mensaje);
       }
        devolver el valor;
    }

    public  long  leer ( valor largo  , String msg ) { 
        Sistema . fuera . println (mensaje);
       prueba {
        valor = Largo . parseLong (br . readLine ());
       } captura ( Excepción e) {
           valor = leer (valor, mensaje);
       }
        devolver el valor;
    }

    public  double  leer ( valor doble  , String msg ) { 
        Sistema . fuera . println (mensaje);
        prueba {
            valor = Doble . parseDouble (br . readLine ());
           } captura ( Excepción e) {
               valor = leer (valor, mensaje);
           }
            devolver el valor;
    } 
    public  char  leer ( valor de char  , String msg ) { 
        Sistema . fuera . println (mensaje);
        prueba {
            valor = br . readLine () . charAt ( 0 ); // Pedro
           } captura ( Excepción e) {
               valor = leer (valor, mensaje);
           }
            devolver el valor;
    }    
    pública  Cadena  leer ( Cadena de  valor , cadena  msg ) {
        Sistema . fuera . println (mensaje);
        prueba {
            valor = Cadena . valueOf (br . readLine ()); // Pedro
           } captura ( Excepción e) {
               valor = leer (valor, mensaje);
           }
            devolver el valor;
    }     
    public  boolean  leer ( valor booleano  , String msg ) { 
        Sistema . fuera . println (mensaje);
        prueba {
            valor = booleano . parseBoolean (br . readLine ()); // Pedro
           } captura ( Excepción e) {
               valor = leer (valor, mensaje);
           }
            devolver el valor;
    }          

}
