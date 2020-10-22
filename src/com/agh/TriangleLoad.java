package com.agh;

import java.util.Scanner;

public class TriangleLoad {

    public void Count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height, then sides length a,b,c..");
        double t_h = scanner.nextDouble();
        double t_a = scanner.nextDouble();
        double t_b = scanner.nextDouble();
        double t_c = scanner.nextDouble();
        Triangle t = new Triangle(t_h,t_a,t_b,t_c);
        t.print();
        System.out.println("Area:" + t.calculateArea());
        System.out.println("Perimeter:" + t.calculatePerimeter());
    }
}
