package com.agh.p1_area_calculator;

import java.util.Scanner;

public class CircleLoad {

    public void Count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius..");
        double r = scanner.nextDouble();
        Circle c = new Circle(r);
        c.print();
        System.out.println("Area:" + c.calculateArea());
        System.out.println("Perimeter:" + c.calculatePerimeter());
    }
}
