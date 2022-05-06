
public class Main {
    public static void main(String[] args) {
        System.out.println(listPrimes(10));

    }

    public static String listPrimes(int num) {
        // TODO:
        String result = "";
        int cnt = 0;
        boolean isPrime = true;

        for(int j = 2 ; j <= num ; j++ ){

            isPrime = true;
            cnt = 0;

            for(int i=j ; i <=num; i++) {
                if(num%i != 0){
                    cnt ++;
                    if(cnt > 2){
                        isPrime = false;
                        break;
                    }

                }
                if(isPrime){
                    result +=  Integer.toString(j);
                }

            }

        }
        return result;
    }

}