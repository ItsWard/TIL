package test;

import java.util.Arrays;
import java.util.function.Predicate;

public class Test4 {

    public static void main(String[] args) {
        int b = 1000;
        long a;
        a = b;

        int[] base = new int[50001];
        for(int i = 0 ; i < 50001 ; i++)
            base[i] = i;

        int[] sample = new int[50001];
        for(int i = 0 ; i < 50001 ; i++)
            sample[i] = i;

        long beforeTime = System.currentTimeMillis();

        System.out.println(isSubsetOf2(base, sample));

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime);//두 시간에 차 계산
        System.out.println("시간차이(u) : "+secDiffTime);
    }


    public static boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        return Arrays.stream(sample)
                .allMatch( i -> Arrays.stream(base)
                        .anyMatch(j -> i == j));

    }

    public static boolean isSubsetOf2(int[] base, int[] sample) {
        Arrays.sort(base);  // binarySearch을 사용하기 전 사전작업
        for(int i : sample)
            if(Arrays.binarySearch(base, i) < 0)  // binarySearch의 반환값 : 존재하는 경우는 index 반환 / 존재하지 않으면 음수값 반환
                return false;
        return true;
    }
}
