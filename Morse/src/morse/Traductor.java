package morse;

import java.util.Scanner;

public class Traductor {
    
    String []letras={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
        "1","2","3","4","5","6","7","8","9","0"," "};
    String codigoMorse[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
        "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",
        ".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"," "};
    Scanner leer=new Scanner(System.in);
    

    public void Identificar(){
        leer.useDelimiter("\n");
        System.out.println("Bienvenido a Este Programa");
        System.out.println("Aqui Podrá Traducir Texto a Codigo Morse y Viceversa ");
        System.out.println("");
        
        try{
            System.out.println("1: Pulse 1 para Traducir de Texto a Codigo Morse");
        System.out.println("2: Pulse 2 para Traducir de Codigo Morse a Texto");
        System.out.println("3: Pulse 3 para Terminar la Ejecucion del Programa");
        int opc=leer.nextInt();
        switch(opc){
            case 1:
                TraducirLetras();
                break;
            case 2:
                TraducirMorse();
                break;
            case 3:
                System.exit(0);
                
            default:
                System.out.println("no se encontro la peticion");
                Identificar();
                break;
        }
            
        }catch(java.util.InputMismatchException e){
            System.out.println("Ingreso una opcion no valida");
        }
        
    }
    
    public void TraducirLetras(){
        System.out.println("\n");
        
        System.out.println("Ingrese la Palabra a Traducir de Texto a Codigo Morse");
        String Palabra=leer.next();
        Palabra=Palabra.toUpperCase();
        char Letra[]=Palabra.toCharArray();
        String palabraT="";
        for (int i = 0; i < Letra.length; i++) {
            String Aux=String.valueOf(Letra[i]);
            for (int j = 0; j < letras.length; j++) {
                if (Aux.equals(letras[j])) {
                    palabraT+=codigoMorse[j]+" ";
                }
            }
        }
        System.out.println("la palabra ya traducida a morse es: "+palabraT);
        System.out.println("\n");

      
        Identificar();
    }
    
    public void TraducirMorse(){
        System.out.println("Ingrese la Palabra a Traducir de Morse a Texto");
        String palabraT=leer.next();
        String letraMorse[]=palabraT.split(" ");
        palabraT="";
        int cont=0;
        for (int i = 0; i < letraMorse.length; i++) {
            if (letraMorse[i].equals("")) {
                if (cont==1) {
                    palabraT+=" ";
                    cont=0;
                }else{
                    cont++; 
                }   
            }else{
                for (int j = 0; j < codigoMorse.length; j++) {
                if (letraMorse[i].equals(codigoMorse[j])) {
                  palabraT+=letras[j];  
                }
            }   
            } 
        }
        System.out.println(palabraT);
        
        Identificar();
    }
    
}
