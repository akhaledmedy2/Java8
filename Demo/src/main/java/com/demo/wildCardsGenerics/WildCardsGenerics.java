package com.demo.wildCardsGenerics;

import java.util.ArrayList;
import java.util.List;

public class WildCardsGenerics {

    public static void main(String[] args) {

        List<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building());
        buildingList.add(new Building());
        printBuildings(buildingList);

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office());
        officeList.add(new Office());
        printBuildings(officeList);


        List<House> houseList = new ArrayList<>();
        houseList.add(new House());
        houseList.add(new House());
        printBuildings(houseList);

        addHouseList(houseList);
        addHouseList(buildingList);

    }

    static void printBuildings (List<? extends Building> buildings){
        buildings.forEach(System.out::println);
    }

    static void addHouseList(List<? super House> houseList){
        houseList.add(new House());
    }
}
