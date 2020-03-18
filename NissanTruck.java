package com.company;

public class NissanTruck implements Truck {
    int axles, weight;

    public NissanTruck(int axles, int weight) {
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
