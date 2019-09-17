package com.sqli.train;

import java.util.ArrayList;
 import java.util.List;
import java.util.stream.Collectors;

public class Train {
    private List<Wagon> wagons;
    private WagonFactory wagonFactory;

    public Train(String trainComponents) {
        wagons = new ArrayList<>();
        wagonFactory= new WagonFactory();

        for (int i = 0; i < trainComponents.length(); i++) {
            wagons.add(wagonFactory.getWagon(String.valueOf(trainComponents.charAt(i))));

        }
        wagons.get(wagons.size()-1).setLast(true);

    }

    public String print() {

        return wagons.stream().map(p-> p.toString()).collect(Collectors.joining("::"));
    }

}
