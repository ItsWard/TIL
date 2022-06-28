import java.util.Arrays;
import java.util.List;
public class Lambda1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 10, 12);

        int sum =
                numbers.stream()
                        .filter(number -> number > 4 && (number % 2 == 0))
                        .mapToInt(number -> number)
                        .sum();

        System.out.println(sum);
    }

}
