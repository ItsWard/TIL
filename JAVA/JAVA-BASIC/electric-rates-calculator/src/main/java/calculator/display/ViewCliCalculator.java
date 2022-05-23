package main.java.calculator.display;

import main.java.calculator.define.ResidentialElectricRatesTable;
import main.java.calculator.domain.RatesCalculator;

import java.util.Map;

public class ViewCliCalculator implements CliCalculator{
    @Override
    public String setTitle(String title) { //입력된 title에 맞춰 타이틀 String 출력
        return "=========================" + System.lineSeparator() + title + System.lineSeparator() + "=========================";
    }

    @Override
    public String calc(RatesCalculator ratesCalculator) {

        final int ELECTRICITY_MIN = 0; //입력 최소범위
        final int ELECTRICITY_MAX = 9999; //입력 최대범위

        if(ratesCalculator.getElectricity() < ELECTRICITY_MIN || ratesCalculator.getElectricity() > ELECTRICITY_MAX) // 최대 최소 범위 넘는 경우 입력 오류 안내
            return String.format("잘못된 입력입니다.");

        ResidentialElectricRatesTable residentialElectricRatesTable = new ResidentialElectricRatesTable();
        Map<Integer, Double> map = residentialElectricRatesTable.getMap();

        double price = 0;

        int length = (ratesCalculator.getElectricity() / 100) ; // 계산 순회 횟수
        int rest = ratesCalculator.getElectricity() - (length * 100); //나머지

        //System.out.println(length); 횟수 잘 들어오는 지 디버깅
        //System.out.println(remain);

        for(int i = 0 ; i < length; i++)
            price += map.get(i) * 100; // 전체 요금 계산

//     key = 0 ,     LOW_VOLTAGE_100KWH_BELOW = 60.7;
//     key = 1 ,     LOW_VOLTAGE_100KWH_EXCESS = 125.9;
//     key = 2 ,     LOW_VOLTAGE_200KWH_EXCESS = 187.9;
//     key = 3 ,     LOW_VOLTAGE_300KWH_EXCESS = 208.6;
//     key = 4 ,     LOW_VOLTAGE_400KWH_EXCESS = 417.7;
//     key = 5 ,     LOW_VOLTAGE_500KWH_EXCESS = 670.6;
        // 위와 같이 해쉬맵으로 저장되어있으므로, 350이 들어 올 경우는 length는 3이므로
        // 전력 요금은 key에 해당하는 값 *  100 +를 3번 반복하며 더함


        price += rest * map.get(length); // 나머지는 최대값과 계산하여 더함
        ratesCalculator.setPrice(price);

        return String.format("%dkWh의 전기 요금은 %f원 입니다.",ratesCalculator.getElectricity(), ratesCalculator.getPrice());
    }
}
