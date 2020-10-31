package com.agh.p1_area_calculator;

public class Circle extends Figure implements Printable{

    double r;

    //constructors
    public Circle() {
        name = "Circle";
        r = 0;
    }

    public Circle(double _r)
    {
        name = "Circle";
        r = _r;
    }

    @Override
    double calculateArea() {
        area = Math.PI*r;
        return area;
    }

    @Override
    double calculatePerimeter() {
        perimeter = 2*Math.PI*r;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("radius: " + r);
    }
}
