package main.java.calculator.domain;

public class RatesCalculator {

    // 전기계산기의 가격과 전력양에 대한 클래스입니다.
    // 추상(extends, interface 어떤 경우에 사용해야하는지)
    public int getElectricity() {
        return electricity;
    }
    public void setElectricity(int electricity) {
        this.electricity = electricity;
        //<Add> Input을 여기서 처리, 캡슐화 

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
