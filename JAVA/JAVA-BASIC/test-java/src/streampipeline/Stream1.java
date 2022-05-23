package streampipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Stream1 {
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member(Member.MALE, 30) ,
                new Member(Member.MALE, 25) ,
                new Member(Member.FEMALE, 22));

        List<Integer> ageAve = memberList
                            .stream()
                            .map(Member::getAge)
                            .collect(Collectors.toList());
        System.out.println(ageAve);
        List<String> names = Arrays.asList("abc", "rrr", "ccc", "asa");
        names.stream()
                .map(word->word.split(" "))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);

        number1.stream()
                .flatMap(i -> number2.stream())
                .forEach(System.out::println);

        int[] arr = new int[]{1,2,3};



    }





}
