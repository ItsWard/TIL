package main.java.calculator.utill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    BufferedReader reader;
    String str;

    public Input() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getStr() throws IOException {
        return reader.readLine();
    }



}
