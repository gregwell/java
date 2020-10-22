package com.agh;

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
        return Math.PI*r;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public void print() {

    }
}
