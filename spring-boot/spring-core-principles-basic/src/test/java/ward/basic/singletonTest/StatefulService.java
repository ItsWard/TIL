package ward.basic.singletonTest;

public class StatefulService {
//    private int price; //해당 상태를 유지하면안됨(지역변수 사용하면 해결 가능)


    public int order(String name, int price) {

        System.out.println("name = " + name + ", price = " + price);
        return price;
    }

}
