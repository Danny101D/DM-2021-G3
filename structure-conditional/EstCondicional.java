import java.util.Scanner;
class EstCondicional{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio01(){
    //Definir variables y otros
    System.out.println("Ejemplo estructura Condicional en Java");
    int cantidadX=0;
    double montoP=0;
    try{
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
      System.out.println("Error en ingreso de datos! vuelva ejecutar");
    }
  }

  static void ejercicio02(){
    //declarar variables
    int cantidadX;
    double montoP;
    //Datos de Entrada
    System.out.println("Ingrese la cantidad de personas invitadas:");
    cantidadX=teclado.nextInt();
    //Proceso
    if(cantidadX<=200){
      montoP=cantidadX*95;
    }else if(cantidadX>200 && cantidadX<=300){
      montoP=cantidadX*85;
    }else{
      montoP=cantidadX*75;
    }
    //Datos de salida
    System.out.println("El monto a pagar es:"+montoP);
  }

  static void bonoTrabajadorDMP(){
    //Definir variables
    int anhoAnt;
    double sueldo, bonoAnt=0, bonoSueld=0, bonoReal=0;
    //Datos de Entrada
    System.out.print("Ingrese anhos de antiguedad:");
    anhoAnt=teclado.nextInt();
    System.out.print("Ingrese el sueldo del trabajador:");
    sueldo=teclado.nextDouble();
    //Proceso
    if(anhoAnt>2 && anhoAnt<5){
      bonoAnt=sueldo*0.20;
    }else if (anhoAnt>=5){
      bonoAnt=sueldo*0.30;
    }

    if(sueldo<1000){
      bonoSueld=sueldo*0.25;
    }else if(sueldo>=1000 && sueldo<=3500){
    bonoSueld=sueldo*0.15;
    }else{
    bonoSueld=sueldo*0.10;
    }
    if(bonoAnt>=bonoSueld){
      bonoReal=bonoAnt;
    }else{
      bonoReal=bonoSueld;
    }
    //Datos de salida
    System.out.println("El trabajador tendra un bono de:"+bonoReal+ "\nSin embargo su bono por antiguedad es:  "+bonoAnt+" y el bono por sueldo es:"+bonoSueld);
  }

  public static void main(String[] arg){
   //ejercicio01();
   //ejercicio02();
  bonoTrabajadorDMP();
  }
}