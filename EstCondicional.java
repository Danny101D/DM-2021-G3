import java.util.Scanner;
class EstCondicional{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio01(){
    //Definir variables y otros
    System.out.println("Ejemplo estructura Condicional en Java");
    int cantidadX=0;
    double montoP=0;
    //Datos de Entrada
    System.out.println("Ingrese la cantidad de lapices:");
    cantidadX=teclado.nextInt();
    //Proceso
    if(cantidadX>=1000){
    montoP=cantidadX*0.80;
    }else{
    montoP=cantidadX*0.90;
    }
    //Datos de salida
    System.out.println("El monto a pagar es:"+montoP);
    }catch(Exception e){
      System.out.println("Error en ingreso de datos! vuelva a ejecutar");
    }


    }
  public static void main(String[] arg){
    ejercicio01();
  }
}