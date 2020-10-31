package com.agh.p1_area_calculator;

import java.util.Scanner;

public class SquareLoad {

    public void Count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length, then enter width..");
        double l = scanner.nextDouble();
        double w = scanner.nextDouble();
        Square s = new Square(l,w);
        s.print();
        System.out.println("Area:" + s.calculateArea());
        System.out.println("Perimeter:" + s.calculatePerimeter());
    }

}
