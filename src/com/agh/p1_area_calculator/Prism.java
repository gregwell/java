package com.agh.p1_area_calculator;

public class Prism extends Figure implements Printable{
    double volume;
    double a;
    double h;
    int sides;

    //a*b - base,
    public Prism(double _a, double _h, int _sides)
    {
        name = "Regular prism";
        a = _a;
        h = _h;
        sides = _sides;
        volume = 0;
    }

    double calculateVolume() {
        volume = a*a * h;
        return volume;
    }

    @Override
    double calculateArea() {
        area = a*a + sides*a*h;
        return area;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("a(base): " + a);
        System.out.println("height: " + h);
        System.out.println("no of sides: " + sides);
    }
}
