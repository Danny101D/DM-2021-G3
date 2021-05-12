import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class RepasoJava {
    //objTeclado1 un Objeto
    static Scanner objTeclado1=new Scanner(System.in);
    /* Iinicio de definicion de variales/atributos  */
    int a=10;
    double b=5.0;

    char c='*';
    short d=1;
    float e=4f;
    long f=5411;
    boolean i=true;
   static String z="sdsdsdsdsdsdsdsdsd";

    Double g=545.2;
    Integer h=54545;
    Long j=(long)1234567891;

    BigInteger m=new BigInteger("54545454544444444444444444444444444444444444444");
    BigDecimal n;
    /* Fin de definicion de variales  */


    //Metodos 
    public static void saludo() {
       System.out.println("Dime tu nombre:");       
       z=objTeclado1.next();
        System.out.println("Hola "+z);
       
    }

    public void saludo2() {
        System.out.println("Dime tu nombre:");
        z=objTeclado1.next(); 
        System.out.println("Hola "+z);
    }

    public static void operacionesMath() {
      RepasoJava obj=new RepasoJava();
      System.out.println("Suma:"+(obj.a+obj.b));  
      System.out.println("Resta:"+(obj.a-obj.b));  
      System.out.println("Division:"+(obj.a/obj.b));  
      System.out.println("Multiplicacion:"+(obj.a*obj.b));  
      System.out.println("Potencia:"+Math.pow(obj.a, obj.b));  
    }

    public void operacionesMath2() {
        System.out.println("Suma:"+(a+b));  
        System.out.println("Resta:"+(a-b));  
        System.out.println("Division:"+(a/b));  
        System.out.println("Multiplicacion:"+(a*b));  
        System.out.println("Potencia:"+Math.pow(a, b));          
    }
    

    public static void main(String[] args) {
        //System.out.println("Hola Mundo");        
        operacionesMath();
        /*RepasoJava obj=new RepasoJava();
        obj.operacionesMath2();*/
        

    }
}