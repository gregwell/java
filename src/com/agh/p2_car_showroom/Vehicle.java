package com.agh.p2_car_showroom;

public class Vehicle implements Comparable<Vehicle> {
    private String brand;
    private String model;
    private ItemCondition condition;
    private double price;
    private Integer productionDate;
    private double mileage;
    private double engineCapacity;

    public Vehicle(String brand, String model, ItemCondition condition, double price, Integer productionDate, double mileage, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.condition = condition;
        this.price = price;
        this.productionDate = productionDate;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
    }

    public void print() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model );
        System.out.println("Condition: " + condition);
        System.out.println("Price: " + price);
        System.out.println("Production date: " + productionDate);
        System.out.println("Mileage: " + mileage);
        System.out.println("Engine capacity" + engineCapacity);
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.model.compareTo(o.model);
    }

    public String getModel() {
        return model;
    }

    public ItemCondition getCondition() {
        return condition;
    }
}
