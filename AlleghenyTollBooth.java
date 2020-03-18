package com.company;

public class AlleghenyTollBooth implements TollBooth{
    int truckCounter;
    int receipts;

    public void setTruckCounter(int truckCounter) {
        this.truckCounter = truckCounter;
    }

    public void setReceipts(int receipts) {
        this.receipts = receipts;
    }

    @Override
    public void calculateToll(Truck i) {
        truckCounter+=1;

    int axles, weight, tollDue;
    axles = i.getAxles();
    weight = i.getWeight();

    tollDue=axles*5+(weight/500)*10;
        receipts+=tollDue;

            System.out.println("Your truck has: " + axles + " axes.");
            System.out.println("Weight of your truck is: " + weight + " kg.");
            System.out.println("Toll due: " + tollDue + " $.");

    }

    @Override
    public void displayData() {
        System.out.println("Totals since last collection - Receipts: $ "
        + receipts +
                " Trucks: " + truckCounter);
    }
    @Override
    public void drawerRemoved() {
        System.out.println("*** Collecting receipts  ***");
        displayData();
        setReceipts(0);
        setTruckCounter(0);
    }
}
