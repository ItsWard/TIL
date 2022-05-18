import java.util.ArrayList;
import java.util.List;

public class Customer {

    int money;
    List<String> coffeeList = new ArrayList<>();

    public Customer(int money) {
        this.money = money;
        viewMoney();
    }



    public void buyCoffee(Coffee coffee){
        //현재 있는 돈이 부족해 커피를 못사면
        if (money < coffee.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        //커피를 샀을 때
        money = money - coffee.price; //[현재 있는돈 - 커피값]을 뺀 돈을 money에 저장
        coffeeList.add(coffee.toString()); // 현재 구매한 커피를 커피list에 추가
        System.out.println(coffee + "를 구매했습니다."); //구매한 커피가 무엇인지 출력

    }

    public void viewMoney(){
        System.out.printf("현재 가진 돈은 %d 입니다.%n",this.money);
    }

    public void viewCoffee(){

        for (String s : coffeeList) //리스트안에 있는 커피 갯수만큼 반복
            System.out.println(s); //리스트 내 커피 출력

    }


}

