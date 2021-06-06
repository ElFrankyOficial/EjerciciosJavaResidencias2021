package objetos;

import java.util.Scanner;

public class Menu {
    Scanner leer=new Scanner(System.in);
    int Lado=0;
    int Opc=0;
    Cuadrado objCuadrado;
    Cubo objCubo;
    public void Presentacion(){
       
        try{
            System.out.println(" Ingrese la Medida de un Lado en cm(Centimetros)");
            Lado=leer.nextInt();
            Opciones(Lado);
            
        }catch(java.util.InputMismatchException ea){
            System.out.println("Debe de Ingresar Valores Numericos");
        }
        
    }
    public void Opciones(double lado){
        objCuadrado=new Cuadrado(lado,0,0);
        objCubo=new Cubo(0,lado,0,0);
        try{
            System.out.println("* El valor de el lado es: "+Lado+" *");
            System.out.println(" Seleccione la Opcion que Desea Calcular");
            System.out.println(" 1: Calcular el Area de un Cuadrado" );
            System.out.println(" 2: Calcular el Perimetro de Un Cuadrado");
            System.out.println(" 3: Calcular el Volumen de un Cubo");
            System.out.println(" 4: Calcular el Perimetro de un Cubo");
            System.out.println(" 5: Cancelar");
            System.out.println(" 6: Salir");
            Opc=leer.nextInt();
            switch(Opc){
                case 1:
                    objCuadrado.calcularArea("Cuadrado");
                    Menux(lado);
                    break;
                case 2:
                    objCuadrado.calcularPerimetro(4,"Cuadrado");
                    Menux(lado);
                    break;
                case 3:
                    objCubo.Vol("Cubo");
                    Menux(lado);
                    break;
                case 4:
                    objCubo.Perimetros(12,"Cubo");
                    Menux(lado);
                    break;
                case 5:
                    Presentacion();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no Valida");
                    break;
            }   
        }catch(java.util.InputMismatchException e){
            System.out.println("Opcion no Valida");  
        }
        
        
    }
    public void Menux(double lado){
        try{
            
            Scanner leer=new Scanner(System.in);
            int opc=0;
            System.out.println("* El valor de el lado es: "+lado+" *");
            System.out.println("*Seleccione la Opcion que Desea Hacer Ahora*");
            System.out.println("1: Regresar al Menu de Calculos con el Mismo Valor");
            System.out.println("2: Volver a Ingresar el Tamaño del Lado");
            opc=leer.nextInt();
            switch(opc){
                case 1:
                    Opciones(Lado);
                    break;
                case 2:
                    Presentacion();
                    break;
                default:
                    System.out.println("Opcion no Valida");
                    break;
            }
        }catch(java.util.InputMismatchException e){
            System.out.println("Opcion no Valida");
        }
        
    }
    
    
    
}
