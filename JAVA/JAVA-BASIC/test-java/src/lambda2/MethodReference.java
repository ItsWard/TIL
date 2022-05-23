package lambda2;

import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {
        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("abc"));
    }





}
