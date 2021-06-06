package objetos;

import java.util.Scanner;

public class Cubo extends Cuadrado {
    private double Volumen;

    public Cubo(double Volumen, double Lado, double Perimetro, double Area) {
        super(Lado, Perimetro, Area);
        this.Volumen = Volumen;
    }
    public void Perimetros(int l,String tipo){
       calcularPerimetro(l, tipo);
       System.out.println("El Perimetro de un "+tipo+" con el Tamaño de Lado: "+getLado()+"cm es:"+getPerimetro()+"cm");

    }

    public void Vol(String tipo){
       Volumen=Math.pow(getLado(), 3);
       System.out.println("El Volumen de un "+tipo+" con el Tamaño de Lado: "+getLado()+"cm es:"+Volumen+"cm3");
 
    }
    }
