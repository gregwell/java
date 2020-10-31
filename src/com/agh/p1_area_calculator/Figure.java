package com.agh.p1_area_calculator;

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
