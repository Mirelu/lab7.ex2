package com.company;
import java.util.;
class Shape {
    private int Raza;
    private int Lungime;
    private int Latime;

    public Shape(int Raza, int Lungime, int Latime) {
        this.Raza = Raza;
        this.Lungime = Lungime;
        this.Latime = Latime;
    }
}
public class Circle extends Shape{
    public Circle(int Raza){
        super(Raza);
    }
}
public class Main {

    public static void main(String[] args) {
    Circle c1 = new Circle();
    system.out.println("Aria carcului este : " + Raza*Raza * 3,14);
    }
}
