paquete  pe.edu.upeu ;


import  pe.edu.upeu.util.Teclado ;

público  de clase  subprogramas {
  // Scanner objTec = new Scanner (System.in); // objeto
  Teclado objTec = nuevo  Teclado ();



  public  int  factorial ( int  numero ) {
    int resultado = 1 ;
    if (numero > 1 ) {
        para ( int i =  1 ; i <= numero; i ++ ) {
            resultado = resultado * i;
        }
    }
     volver resultado;
  }

  public  doble  potencia ( doble  base , int  exponente ) {
      resultado doble = Matemáticas . pow (base, exponente);
    volver resultado;
  }

  public  void  senoX () {
    doble x = objTec . leer ( 0.0 , " Ingrese el angulo X: " );
    int fxl = objTec . leer ( 0 , " Ingrese el límite de la función: " );    
    doble resultadoFx = 0 ;
    int contador = 0 ;
    para ( int i =  1 ; i < fxl; i + = 2 ) {
      si (contador % 2 == 0 ) {
        resultadoFx = resultadoFx + (potencia (x, i) / factorial (i));
      } más {
        resultadoFx = resultadoFx - (potencia (x, i) / factorial (i));
      }
      Sistema . fuera . println ( " f (x) = " + resultadoFx);
      contador ++ ;
      } 
      
    Sistema . fuera . println ( " El seno ( " + x + " ) = " + resultadoFx);
  }


  public  void  funcionExponencial () {    
    doble x = objTec . leer ( 0.0 , " Ingrese un numero X: " );    
    int fxl = objTec . leer ( 0 , " Ingrese el límite de la función: " );
    doble resultadoFx = 0 ;
    para ( int fl =  0 ; fl < fxl; fl ++ ) {
        resultadoFx = resultadoFx + (potencia (x, fl) / factorial (fl));
        // System.out.println ("y =" + resultadoFx);
    }
    Sistema . fuera . println ( " La fun exponcial es: " + resultadoFx);
  }

  public  void  matIntCompuesto () {    
    doble  P = objTec . leer ( 0.0 , " Ingrese el Capital: " );     
    int periodo = objTec . leer ( 0 , " Ingrese el Periodo en Anhos: " );  
    doble capital final = 0 ;
    para ( int n =  1 ; n <= periodo; n ++ ) {
      capitalfinal + = Matemáticas . redondo ( P * potencia (( 1 + 0.15 ), n));  
    }
    Sistema . fuera . println ( " El capital final al cabo de " + periodo + " anhos es: " + capitalfinal);        
  }


    
}