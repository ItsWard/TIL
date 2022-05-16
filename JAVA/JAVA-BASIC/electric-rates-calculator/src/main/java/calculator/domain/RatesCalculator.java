package main.java.calculator.domain;

public class RatesCalculator {

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    int electricity = 0;
    double price = 0;

}
