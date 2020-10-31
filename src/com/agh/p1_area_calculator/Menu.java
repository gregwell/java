package com.agh.p1_area_calculator;

import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public void ShowMenu() {

        CircleLoad circle = new CircleLoad();
        SquareLoad square = new SquareLoad();
        TriangleLoad triangle = new TriangleLoad();
        PrismLoad prism = new PrismLoad();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Choose figure: 1-square, 2-circle, 3-triangle, 4-regular prism..[0-EXIT]");
            int x = scanner.nextInt();

            switch(x) {
                case 1:
                    square.Count();
                    break;
                case 2:
                    circle.Count();
                    break;
                case 3:
                    triangle.Count();
                    break;
                case 4:
                    prism.Count();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("wrong input");
                    break;
            }
        }
    }


}
