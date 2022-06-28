package main.java.calculator;

import main.java.calculator.program.Calculator;
import main.java.calculator.program.CliCalculatorImpl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RatesCalculatorApplication {


    public static void main(String[] args) throws IOException { //실제 계산기 어플리케이션입니다. (메인 프로그램)

        CliCalculatorImpl cliCalculatorImpl = new CliCalculatorImpl(); // 값을 연산 하는 클래스를 인스턴스화 합니다.
        Calculator calculator = new Calculator(); //전기 계산기 가격과 사용양을 저장하는 인스턴스화 합니다.
        BufferedReader inputBufferReader = new BufferedReader(new InputStreamReader(System.in)); //CLI 환경에서 scanner 대신 입력받을 객체입니다.
        //실제 검증 해봤으면 좋겠다.(blog에 추가)

        int electricity = 0; //전력양의 초기값은 0입니다. (입력 전)

        System.out.println(cliCalculatorImpl.setTitle("주택용 전기요금(저압) 계산기"));

                               //Try Ca
        //electricity = inputInteger(inputBufferReader);
        electricity =Integer.parseInt(inputBufferReader.readLine());// 데이터를 입력받습니다.
        calculator.setElectricity(electricity);                        // ratesCalculator 객체에 현재 입력값을 저장합니다.
        System.out.println(cliCalculatorImpl.calc(calculator));        //연산한 값을 터미널창에 출력합니다.

    }


}
