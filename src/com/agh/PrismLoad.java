package com.agh;

import java.util.Scanner;

public class PrismLoad {
    public void Count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base a, then height, then number of sides..");
        double p_a = scanner.nextDouble();
        double p_h = scanner.nextDouble();
        int p_sides = scanner.nextInt();
        Prism p = new Prism(p_a,p_h,p_sides);
        p.print();
        System.out.println("Area:" + p.calculateArea());
        System.out.println("Volume:" + p.calculateVolume());
    }
}
