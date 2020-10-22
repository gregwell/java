package com.agh;

public class Triangle extends Figure implements Printable{

    double h;
    double a;
    double b;
    double c;

    //constructors
    public Triangle() {
        name = "Triangle";
        h = a = b = c = 0;

    }

    public Triangle(double _h, double _a, double _b, double _c)
    {
        name = "Triangle";
        h = _h;
        a = _a;
        b = _b;
        c = _c;
    }

    @Override
    double calculateArea() {
        area = a*h/2;
        return area;
    }

    @Override
    double calculatePerimeter() {
        perimeter = a+b+c;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("height: " + h);
        System.out.println("side a: " + a);
        System.out.println("side b: " + b);
        System.out.println("side c: " + c);
    }



}
