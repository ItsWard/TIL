package main.java.calculator.display;

import main.java.calculator.define.ElectronicBillTable;
import main.java.calculator.domain.RatesCalculator;

import java.util.Map;

public class ViewCliCalculator implements CliCalculator{ //인터페이스에서 상속받아 데이터를 연산하는 부분입니다.
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

        ElectronicBillTable electronicBillTable = new ElectronicBillTable();
        Map<Integer, Double> map = electronicBillTable.getMap();

        double price = 0;

        int length = (ratesCalculator.getElectricity() / 100) ; // 계산 순회 횟수 (523이 들어왔으면 5)
        int rest = ratesCalculator.getElectricity() - (length * 100); //나머지값 (523이 들어왔으면 23)

        //System.out.println(length); 횟수 잘 들어오는 지 디버깅
        //System.out.println(rest);

        for(int i = 0 ; i < length; i++)
            price += map.get(i) * 100; // 전체 요금 계산

//     key = 0 ,     100KWH_BELOW = 60.7;
//     key = 1 ,     100KWH_EXCESS = 125.9;
//     key = 2 ,     200KWH_EXCESS = 187.9;
//     key = 3 ,     300KWH_EXCESS = 208.6;
//     key = 4 ,     400KWH_EXCESS = 417.7;
//     key = 5 ,     500KWH_EXCESS = 670.6;

// 위와 같이 해쉬맵으로 저장되어있으므로, 523이 들어 올 경우는 length는 5이므로
// 전력 요금은 key에 해당하는 값 *  100 +를 5번 반복하며 더함


        price += rest * map.get(length); // 나머지는 최대값과 계산하여 더함
        ratesCalculator.setPrice(price); // 계산기 객체에 저장

        return String.format("%dkWh의 전기 요금은 %f원 입니다.",ratesCalculator.getElectricity(), ratesCalculator.getPrice());
    }
}
