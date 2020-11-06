package com.agh.p2_car_showroom;

import java.util.PriorityQueue;

public class Menu {

    public void execute() {

        Vehicle v1 = new Vehicle("Fiat", "Seicento", ItemCondition.USED, 600, 2001, 100732, 1.0);
        Vehicle v2 = new Vehicle("Renault", "Clio", ItemCondition.NEW, 30250, 2019, 0, 2.0);
        Vehicle v3 = new Vehicle("Renault", "Clio", ItemCondition.USED, 21000, 2014, 44555, 2.3);
        Vehicle v4 = new Vehicle("Ford", "Fiesta", ItemCondition.NEW, 50250, 2020, 0, 1.6);
        Vehicle v5 = new Vehicle("Volvo", "XC40", ItemCondition.NEW, 70222, 2020, 0, 2.5);
        Vehicle v6 = new Vehicle("Volvo", "XC60", ItemCondition.NEW, 90560, 2020, 0, 2.8);

        CarShowroom w = new CarShowroom("WCTS. Wiejskie Centrum Tanich Samochodow", 10);
        w.addProduct(v1);
        w.addProduct(v2);
        w.addProduct(v3);
        w.addProduct(v4);
        w.addProduct(v5);
        w.addProduct(v6);
        w.addProduct(v6);

        Vehicle v7 = new Vehicle("Fiat", "Seicento", ItemCondition.USED, 1150, 2006, 160732, 1.0);
        Vehicle v8 = new Vehicle("Renault", "Clio", ItemCondition.DAMAGED, 5000, 2005, 300250, 2.0);
        Vehicle v9 = new Vehicle("Renault", "Clio", ItemCondition.USED, 21000, 2014, 44555, 2.3);
        Vehicle v10 = new Vehicle("Ford", "Fiesta", ItemCondition.USED, 10500, 1999, 250567, 1.6);
        Vehicle v11 = new Vehicle("Volvo", "XC40", ItemCondition.USED, 45250, 2016, 70232, 2.5);
        Vehicle v12 = new Vehicle("Volvo", "XC60", ItemCondition.USED, 50233, 2016, 111200, 2.8);

        CarShowroom m = new CarShowroom("MCTS. Miejskie Centrum Tanich Samochodow", 30);
        m.addProduct(v7);
        m.addProduct(v8);
        m.addProduct(v9);
        m.addProduct(v10);
        m.addProduct(v11);
        m.addProduct(v12);

       w.summary();
       m.summary();

        System.out.println("The most popular car in WCTS: " + w.max());

        CarShowRoomContainer showrooms = new CarShowRoomContainer();
        showrooms.addCenter(m.getName(),m);
        showrooms.addCenter(w.getName(),w);
        showrooms.summary();
        showrooms.removeCenter(m.getName());
        showrooms.summary();

        System.out.println(w.search("XC40").getModel() + " " + w.search("XC40").getCondition());





    }

}
