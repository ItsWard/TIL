package test;

import java.text.DecimalFormat;
import java.util.Arrays;

import static java.lang.Character.getNumericValue;


public class Test3 {

    public static void main(String[] args) {

        int num = 1000;
        String str = "YlQO uT9";

        numberSearch(str);

        System.out.println(decryptCaesarCipher("nzop delepd dfaazced jzf", 11));

    }

    public static String computeSquareRoot(int num) {
        // TODO:
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("%.2f", sqrt(6, num));
    }

    private static double sqrt(int n, int num) {
        if (n == 0) return 1;
        double result = ((sqrt(n - 1, num)) * (sqrt(n - 1, num)) + num) / (double) (2 * sqrt(n - 1, num));
        return result;
    }


    public static int numberSearch(String str) {
        if (str.length() == 0) {
            return 0;
        }
        String a = str.replaceAll("[^0-9]", "");
        String b = str.replaceAll("[0-9]", "");
        b = b.replaceAll(" ", "");
        double sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum = sum + getNumericValue(a.charAt(i));
        }
        double result = sum / b.length();
        return (int) Math.round(result);
    }


    public static String decryptCaesarCipher(String str, int secret) {
        return str;
    }

    public String compressString(String str) {
        // TODO:
        int cnt = 0;
        String result = "";
        char buffer = 0;

        for(char word : str.toCharArray()){

            if(buffer == word){
                cnt++;
            }
            else{
                result += Integer.toString(++cnt);
                result += buffer;

                buffer = word;
                cnt = 0;
            }

        }

        return result;

    }
}
