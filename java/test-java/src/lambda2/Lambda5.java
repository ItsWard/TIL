package lambda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Lambda5 {



    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Double a =  list.stream()
                        .mapToDouble(Integer::intValue)
                        .average()
                        .getAsDouble();

        List<Integer> oddNumbers = new ArrayList<>();

        oddNumbers= list.stream()
                .filter(i -> i%2 == 0)
                .collect(Collectors.toList());

        System.out.println(a);

        int[] temperature = new int[]{1,2,1,21,};

        Arrays.stream(temperature)
                .count();


    }

}
