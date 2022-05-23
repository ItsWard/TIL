package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        testMethod();
        String[] strArr = new String[]{"1", "2", "3", "4"};
        List<String> strList =  Arrays.asList(strArr);

        Integer[] integerArr = new Integer[]{1,2,3,4 };
        List<Integer> integerList =  Arrays.asList(integerArr);

        int[] intArr = new int[]{1,2,3,4 };
    //    List<int> intList =  Arrays.asList(intArr);


    }

    public static C testMethod(){
        C c = new C();
        return c;
    }

    static class P{
        public P() {
            System.out.println("P다.");
        }
    }

    static class C extends P{
        public C() {
            System.out.println("C다.");
        }
    }

}
