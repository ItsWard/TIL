import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        String commaSeparatedNumbers = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));


        System.out.println(commaSeparatedNumbers);

        IntBinaryOperator operato = Math :: max;
        System.out.println(operato.applyAsInt(3,4));

        IntBinaryOperator op = Math :: min;
        System.out.
    }

}
