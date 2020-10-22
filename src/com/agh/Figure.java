package com.agh;

public abstract class Figure {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    public String name;
    public double area;
    public double perimeter;

    public Figure() {
        name = "undetermined";
        area = perimeter = 0;
    }

}
