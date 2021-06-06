
package traductornumerosromanos;

import java.util.Scanner;


public class Conversor {
   
    Scanner leer=new Scanner(System.in);
    int numero=0;
    int m=0,d=0,c=0,l=0,x=0,v=0,i=0;
    String Romano="";
    public void Menu(){
        try{
            System.out.println(" Bienvenidos \n En este Programa se Podran Hacer Conversiones de Numeros Decimales a Romanos \n");
            System.out.println(" Seleccione la Opcion que Desea Ejecutar");
            System.out.println(" 1: Convertir un Numero Decimal a Romano (1-1000)");
            System.out.println(" 2: Terminar Ejecucion");
            int opc=leer.nextInt();
            switch(opc){
                case 1:
                    Transformar();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no Valida");
        }
            
        }catch(java.util.InputMismatchException e){
            System.out.println("opcion no valida");
        }
        
        
    }
    public void Transformar(){
        System.out.println("Ingrese un numero entero que se encuentre entre 1-1000");
        numero=leer.nextInt();
        if (numero<1 || numero>1000) {
            System.out.println("numero no valido");
            Transformar();
        }else{
           m=numero/1000;
           c=numero/100%10;
           d=numero/10%10;
           i=numero%10;
           
            for (int j = 0; j < m; j++) {
               Romano+="M"; 
            }
            if (c==9) {
                Romano+="CM";
            }else if (c>=5) {
                Romano+="D";
                for (int j = 6; j <=c; j++) {
                    Romano+="C";
                }
            }else if (c==4) {
                Romano+="CD";
            }else{
                for (int j = 0; j < c; j++) {
                    Romano+="C";
                }
            }
            
            if (d==9) {
                Romano+="XC";
            }else if(d>=5){
                Romano+="L";
                for (int j = 6; j < d; j++) {
                    Romano+="X";
                }
            }else if(d==4){
                Romano+="XL";
            }else{
                for (int j = 0; j < d; j++) {
                    Romano+="X";
                }
            }
            if (i==9) {
              Romano+="IX";
            }else if(i==6){
                Romano+="VI";
            }else if (i>=5) {
                Romano+="V";
                for (int j = 6; j <= i; j++) {
                    Romano+="I";
                }
            }else if (i==4) {
                Romano+="IV";
            }else{
                for (int j = 0; j < i; j++) {
                    Romano+="I";
                }
            }
        }
        System.out.println(Romano+"\n");
        Menu();
    }
}
