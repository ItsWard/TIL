package main.java.calculator.utill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    // cli에서 입력 받을 때, BufferReader를 이용해 입력 받고, 숫자값이 아닌경우 Throw하여 런타임 오류를 없애기 위한 클래스입니다.


    public static int inputInteger(BufferedReader bufferedReader) {                     //입력 데이터가 숫자가 아닌경우 다시 입력받도록 하는 메소드
        String str = "";
        int num = 0;
        try {
            num = Integer.parseInt(bufferedReader.readLine());                          //정상적일경우 num에 데이터 입력
        } catch (IOException | NumberFormatException e) {                               //에러 발생일 경우
            System.out.println("[System] 잘못된 입력입니다. 다시 입력하세요.");
            return inputInteger(bufferedReader);                                        //재귀함수(자기자신 다시 실행)
        }


        return num;
        //int값 반환
    }


}
