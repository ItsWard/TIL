package string;

public class Count {

    public static void main(String[] args) {

        partTimeJob(49720);
    }


    public static int partTimeJob(int k) {
        // TODO:
        int money = k;
        int coinConut = 0;
        int quotient = 0;
        int remainder = 0;
        int[] coin = new int[]{500, 100, 50, 10, 5, 1};



        for(int i : coin){
            quotient = money / i;
            remainder = money % i;
            coinConut += quotient;
            money = remainder;
        }

        return coinConut;

    }
}
