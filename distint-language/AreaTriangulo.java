import java.util.Scanner;

class AreaTriangulo{ 
Scanner teclado=new Scanner(System.in);
public static void main(String [] arg){
 //Definir Variables y otros
  System.out.println("Hola Mundo");
  int b, h, area;
  //Datos de Entrada
  System,out,orintln("Ingrese la Base");
  b=teclado.nextInt();
  System,out,orintln("Ingrese la Altura");
  h=teclado.nextInt();
  //Proceso
  area=(b*h)/2;
  //Datos de Salida
  System,out,orintln("Area de un Triangulo es:"+area);
}
}