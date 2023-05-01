package com.demo.wildCardsGenerics;

public class House extends Building {

    public int numberOfRooms = 7;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "house";
    }
}
