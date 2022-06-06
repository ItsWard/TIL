package string;

public class StringTest {

    public static void main(String[] args) {
        System.out.printf(String.valueOf(ABCheck("ccb")));
    }

    public static boolean ABCheck(String str) {
        if(str.length() == 0) {
            return false;
        }
        str = str.toLowerCase();

        for(int i = 4; i < str.length(); i++) {
            if((str.charAt(i) == 'a' && str.charAt(i - 4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i - 4) == 'a')) {
                return true;
            }
        }

        return false;
    }
}
