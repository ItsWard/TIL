package main.java.calculator.define;

import java.util.HashMap;
import java.util.Map;

public class ElectronicBillTable { // 각 전기계산의 상수 값과, 연산시 필요한 맵을 저장하는 클래스입니다.


    Map<Integer, Double> lowVoltageMap = new HashMap<>(); //ViewCliCalculator에서 연산할 때 사용되는 테이블입니다.

    public final Map<Integer, Double> getMap() {
        return lowVoltageMap;
    }

    public ElectronicBillTable() { //생성자, 키값에 맞춰 전력요금을 계산하기 위해 해당 테이블 선언시 넣기

        int index = 0;

        lowVoltageMap.put(index++, LowVoltageTable.BELLOW_100KWH.value);
        lowVoltageMap.put(index++, LowVoltageTable.EXCESS_100KWH.value);
        lowVoltageMap.put(index++, LowVoltageTable.EXCESS_200KWH.value);
        lowVoltageMap.put(index++, LowVoltageTable.EXCESS_300KWH.value);
        lowVoltageMap.put(index++, LowVoltageTable.EXCESS_400KWH.value);
        lowVoltageMap.put(index, LowVoltageTable.EXCESS_500KWH.value);

    }


    private enum LowVoltageTable{                   //다른 테이블 사용하는 경우

        //LOW_VOLTAGE Define 전력 요금_2022.05.18v
        BELLOW_100KWH(60.7),
        EXCESS_100KWH(125.9),
        EXCESS_200KWH(187.9),
        EXCESS_300KWH(208.6),
        EXCESS_400KWH(417.7),
        EXCESS_500KWH(670.6);

        private final double value;
        LowVoltageTable(double value) {
            this.value = value;
        }
    }

}
