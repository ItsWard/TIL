package lambda2;

import java.util.ArrayList;

public class LambdaCollectionFrameWork {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(i);
        list.forEach(i -> System.out.println(i + ","));
        System.out.println();
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        list.replaceAll(i -> i * 10);
        System.out.println(list);




    }

}
