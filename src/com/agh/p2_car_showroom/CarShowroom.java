package com.agh.p2_car_showroom;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarShowroom {
    private String name;
    private int maxVehicles;
    private int amount = 0;
    private HashMap<Vehicle, Integer> vehicleMap = new HashMap<Vehicle, Integer>(); //Vehicle, amount of cars this type

    public CarShowroom(String name, int maxVehicles) {
        this.name = name;
        this.maxVehicles = maxVehicles;
    }

    public void addProduct(Vehicle product) {
        if(amount + 1 > maxVehicles ) {
            System.err.println("The maximum amount of vehicles in Showroom has been exceeded.");
        }
        if(vehicleMap.containsKey(product)) {
            Integer k = vehicleMap.get(product);
            vehicleMap.replace(product, k+1);
            amount++;
        } else {
            vehicleMap.put(product,1);
            amount++;
        }
    }

    public void getProduct(Vehicle product) {
        if (vehicleMap.containsKey(product)) {
            Integer k = vehicleMap.get(product);
            if (k-1 == 0) {
                vehicleMap.remove(product);
                amount--;
            } else {
                vehicleMap.replace(product, k-1);
                amount--;
            }
        }
    }

    public void removeProduct(Vehicle product) {
        if(vehicleMap.containsKey(product)) {
            amount = amount - vehicleMap.get(product);
            vehicleMap.remove(product);
        }
    }

    public Vehicle search(String model) {
        Comparator<String> compare = Comparator.naturalOrder();
        for (Vehicle v : vehicleMap.keySet()) {
            if (compare.compare(model, v.getModel())>0) {
                return v;
            }
        }
        return null;
    }

    public List<Vehicle> searchPartial(String model) {
        List<Vehicle> result = new ArrayList<>();
        Pattern p = Pattern.compile(model); //regex

        for (Vehicle v : vehicleMap.keySet()) {
            Matcher match = p.matcher(v.getModel());
            if (match.find()) {
                result.add(v);
            }
        }
        return result;
    }

    public int countByCondition(ItemCondition condition) {
        int result = 0;
        for (Vehicle v : vehicleMap.keySet()) {
            if (v.getCondition() == condition) {
                result++;
            }
        }
        return result;
    }

    public void summary() {
        for ( Vehicle v : vehicleMap.keySet()) {
            v.print();
            System.out.println("-----------------------");
        }
    }

    public PriorityQueue<Vehicle> sortByName() {
        return new PriorityQueue<>(vehicleMap.keySet());
    }

    public PriorityQueue<Integer> sortByAmount() {
        return new PriorityQueue<>(vehicleMap.values());
    }

    public String max() {
        return Collections.max(vehicleMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey().getModel();
    }

    public int getMaxVehicles() {
        return maxVehicles;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CarShowroom{" +
                "name='" + name + '\'' +
                ", maxVehicles=" + maxVehicles +
                ", amount=" + amount +
                ", vehicleMap=" + vehicleMap +
                '}';
    }
}
