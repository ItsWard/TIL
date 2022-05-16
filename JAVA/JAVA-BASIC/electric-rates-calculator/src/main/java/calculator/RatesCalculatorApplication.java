package main.java.calculator;


import main.java.calculator.display.ViewCliCalculator;
import main.java.calculator.domain.RatesCalculator;
import main.java.calculator.utill.Input;

import java.io.IOException;

public class RatesCalculatorApplication {



    public static void main(String[] args) throws IOException {

        ViewCliCalculator viewCliCalculator = new ViewCliCalculator();
        RatesCalculator ratesCalculator = new RatesCalculator();
        Input input = new Input();

        int electricity = 0;



        System.out.println(viewCliCalculator.setTitle("주택용 전기요금(저압) 계산기"));

        try {
            electricity = Integer.parseInt(input.getStr());
            ratesCalculator.setElectricity(electricity);
            System.out.println(viewCliCalculator.calc(ratesCalculator));
        }
        catch (NumberFormatException e){
            System.out.println("잘못된 입력입니다.");
        }

    }


}
