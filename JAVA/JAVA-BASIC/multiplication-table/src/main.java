import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {

        final int MIN = 2;
        final int MAX = 9;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        starPrint();

        try {
            int num = Integer.parseInt(bufferedReader.readLine());
            if(num > MIN && num < MAX) {
                System.out.printf("%d 단 이 입력되었습니다.%n", num);
                for (int i = 1; i < 10; i++)
                    System.out.printf("%d * %d = %d%n", num, i, num * i);
            }

        } catch (IOException e) {
            System.out.println("잘못된 입력입니다.");
            errorPrint();
        }

    }

    public static void errorPrint(){
        System.out.println("[경고]구구단은 2단~ 9단 까지만 선택할 수 있습니다. 프로그램을 종료합니다.");
        System.out.println("프로그램을 종료합니다.");
    }

    public static void starPrint(){
        System.out.println("[안내]희망하는 구구단을 숫자로 입력해주세요 (2~9) :");
    }

}
