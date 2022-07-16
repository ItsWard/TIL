package test;

import java.util.*;
import java.io.*;


public class Test4 {


    public static void main(String[] args) throws IOException{


        System.out.println(getMaxMeeting());


    }

    public static int getMaxMeeting () throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());

        int[][] time = new int[max][2];
        String input;

        StringTokenizer st;

        for(int i = 0 ; i < max ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }

        });

        int count = 0;
        int meetTime = 0;

        for (int i = 0; i < max; i++) {
            if (meetTime < time[i][0]) {
                meetTime = time[i][1];
                count++;
            }
        }

        return count;
    }

}
