package main.java.calculator.utill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    // cli에서 입력 받을 때, BufferReader를 이용해 입력 받기 위함.
    BufferedReader reader;
    String str;

    public Input() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getStr() throws IOException {
        return reader.readLine();
    }


}
