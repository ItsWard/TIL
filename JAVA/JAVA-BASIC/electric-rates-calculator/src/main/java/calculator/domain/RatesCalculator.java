package main.java.calculator.domain;

public class RatesCalculator {

    // 전기계산기의 가격과 전력양에 대한 클래스입니다.

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

    int electricity = 0; //전력양
    double price = 0; // 가격

}
