package lambda2;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("김코딩", 95),
                new Student("이자바", 94)
        );

        list.stream().forEach(student -> {
            String name = student.getName();
            int score = student.getScore();
            System.out.println(name + " - " + score);
        });


    }


}
