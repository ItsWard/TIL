package lambda2;

import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;

public class Lambda3 {
    public static void main(String[] args) {

        Object obj = new Object() {

            public int max(int a, int b) {
                return a > b ? a : b;

            }
        };

        MyFunction f = ((a, b) -> a > b ? a : b);
        IntBinaryOperator operator = Math::max;
        int value3 = operator.applyAsInt(1,2);
        int value2 = f.max(1, 2);

    }

    @FunctionalInterface
    interface MyFunction {
        public abstract int max(int a, int b);
    }

}
