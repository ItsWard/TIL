package main.java.calculator.display;

import main.java.calculator.define.ResidentialElectricRatesTable;
import main.java.calculator.domain.RatesCalculator;

import java.util.Map;

public class ViewCliCalculator implements CliCalculator{
    @Override
    public String setTitle(String title) {
        return "=========================" + System.lineSeparator() + title + System.lineSeparator() + "=========================";
    }

    @Override
    public String calc(RatesCalculator ratesCalculator) {

        final int ELECTRICITY_MIN = 0;
        final int ELECTRICITY_MAX = 9999;

        if(ratesCalculator.getElectricity() < ELECTRICITY_MIN || ratesCalculator.getElectricity() > ELECTRICITY_MAX)
            return String.format("잘못된 입력입니다.");

        ResidentialElectricRatesTable residentialElectricRatesTable = new ResidentialElectricRatesTable();
        Map<Integer, Double> map = residentialElectricRatesTable.getMap();

        double price = 0;

        int length = (ratesCalculator.getElectricity() / 100) ;
        int remain = ratesCalculator.getElectricity() - (length * 100);

        System.out.println(length);
        System.out.println(remain);

        for(int i = 0 ; i < length; i++)
            price += map.get(i) * 100;

        price += remain * map.get(length);
        ratesCalculator.setPrice(price);

        return String.format("%dkWh의 전기 요금은 %f원 입니다.",ratesCalculator.getElectricity(), ratesCalculator.getPrice());
    }
}
