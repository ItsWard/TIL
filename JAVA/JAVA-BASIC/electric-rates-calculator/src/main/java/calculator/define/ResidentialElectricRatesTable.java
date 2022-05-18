package main.java.calculator.define;

import java.util.HashMap;
import java.util.Map;

public class ResidentialElectricRatesTable {

    //LOW_VOLTAGE

    //Summer (07.01 ~ 08.31)
    public static final double LOW_VOLTAGE_100KWH_BELOW = 60.7;
    public static final double LOW_VOLTAGE_100KWH_EXCESS = 125.9;
    public static final double LOW_VOLTAGE_200KWH_EXCESS = 187.9;
    public static final double LOW_VOLTAGE_300KWH_EXCESS = 208.6;
    public static final double LOW_VOLTAGE_400KWH_EXCESS = 417.7;
    public static final double LOW_VOLTAGE_500KWH_EXCESS = 670.6;


    public Map<Integer, Double> getMap() {
        return map;
    }

    Map<Integer, Double> map = new HashMap<>();


    public ResidentialElectricRatesTable() {

        int index = 0;

        map.put(index++, LOW_VOLTAGE_100KWH_BELOW);
        map.put(index++, LOW_VOLTAGE_100KWH_EXCESS);
        map.put(index++, LOW_VOLTAGE_200KWH_EXCESS);
        map.put(index++, LOW_VOLTAGE_300KWH_EXCESS);
        map.put(index++, LOW_VOLTAGE_400KWH_EXCESS);
        map.put(index, LOW_VOLTAGE_500KWH_EXCESS);

    }
}
