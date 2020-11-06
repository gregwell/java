package com.agh.p2_car_showroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarShowRoomContainer {

    public HashMap<String, CarShowroom> map = new HashMap<>();

    public void addCenter(String name, CarShowroom showroom) {
        map.put(name, showroom);
    }

    public void removeCenter(String name) {
        map.remove(name);
    }

    public List<String> findEmpty() {
        List<String> result = new ArrayList<>();
        for (CarShowroom s : map.values()) {
            if (s.getAmount() == 0) {
                result.add(s.getName());
            }
        }
        return result;
    }

    public void summary() {
        System.out.println("Carshowrooms: ....");
        for (String k : map.keySet()) {
            double result = ((map.get(k).getAmount()) * 1.0 / map.get(k).getMaxVehicles())*100;
            System.out.println(k + ": " + result+"%");
        }
    }


}
