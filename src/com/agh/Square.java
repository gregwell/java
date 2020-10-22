package com.agh;

public class Square extends Figure implements  Printable{

    double length, width;

    //constructors
    public Square() {
        name = "Square";
        length = width = 0;
    }

    public Square(double _length, double _width)
    {
        name = "Square";
        length = _length;
        width = _width;
    }

    @Override
    double calculateArea() {
        area = length*width;
        return area;
    }

    @Override
    double calculatePerimeter() {
        perimeter = 2* length + 2 * width;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("radius: " + name);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
