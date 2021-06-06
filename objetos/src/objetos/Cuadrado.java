package objetos;

import java.util.Scanner;

public class Cuadrado {
    private double Lado;
    private double Perimetro;
    private double Area;
    Menu menu=new Menu();

    public Cuadrado(double Lado, double Perimetro, double Area) {
        this.Lado = Lado;
        this.Perimetro = Perimetro;
        this.Area = Area;
    }

    
    public double getLado() {
        return Lado;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    

    
    public  void calcularArea(String tipo){
        setArea(Math.pow(getLado(), 2));
        System.out.println("El Area de un "+tipo+" con el Tamaño de Lado: "+getLado()+"cm es: "+getArea()+"cm2");
    }
    public void calcularPerimetro(int n,String tipo){
        double aux=0;
        for (int i = 0; i < n; i++) {
            aux+=getLado();
        }
        setPerimetro(aux);
        System.out.println("El Perimetro de un "+tipo+" con el Tamaño de Lado: "+getLado()+"cm es:"+getPerimetro()+"cm");
    }
    
    
}
