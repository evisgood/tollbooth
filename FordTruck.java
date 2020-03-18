package com.company;

public class FordTruck implements Truck{
    int axles, weight;

    public FordTruck(int axles, int weight) {
        this.axles = axles;
        this.weight = weight;
    }

    @Override
    public int getAxles() {
        return axles;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
