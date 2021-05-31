@@ -1,13 +1,22 @@
import  pe.edu.upeu.SubProgramas ;	import  pe.edu.upeu.SubProgramas ;
import  pe.edu.upeu.recur.EjemplosRecursivos ;
import  pe.edu.upeu.util.Teclado ;


 Aplicación de clase  pública {	 Aplicación de clase  pública {


    public  static  void  main ( String [] args ) arroja  Exception {	    public  static  void  main ( String [] args ) arroja  Exception {
        SubProgramas obj = nuevos  Subprogramas (); // / obj es un objeto	       / * SubProgramas obj = new SubProgramas (); /// obj es un objeto
        //obj.funcionExponencial ();	        //obj.funcionExponencial ();
        obj.matIntCompuesto ();	        obj.matIntCompuesto ();
        System.out.println ("Holasss"); * /


        Sistema . fuera . println ( " Holasss " );	        Teclado tc = nuevo  Teclado ();

        EjemplosRecursivos objER = new  EjemplosRecursivos ();

        int numero = tc . leer ( 0 , " Ingrese un número: " );
        Sistema . fuera . println ( " Facorial iterativo: " + objER . factorial (numero));
        Sistema . fuera . println ( " Facorial Recursivo: " + objER . factorialRecur (numero));
    }	    }
}	}