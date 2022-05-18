import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConStore conStore = new ConStore();
        conStore.method();
        conStore.method3();

    }
}



class ConStore {

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int num;
    String name;

    String[] item = new String[]{"등록가능","등록가능","등록가능","등록가능","등록가능"};


    void method() {

        Scanner sc = new Scanner(System.in);


        System.out.println("[System] ChoonSik 주인님 어서오세요.");
        System.out.println("[System] 이용하실 메뉴를 선택해 주세요.");
        viewMenu();
        System.out.println();

        System.out.println("원하는 기능의 번호를 입력해주세요 : ");
        num = Integer.parseInt(sc.nextLine());
        System.out.println("입력 하신 번호 " + num);

        System.out.println("원하는 제품의 이름을 입력해주세요 : ");
        name = sc.nextLine();
        System.out.println("입력하신 제품명 : " + name );
        System.out.println();

    }
    private void viewMenu(){
        System.out.println( "1. 물건 정보(제품명) 등록하기");
        System.out.println( "2. 물건 정보(제품명) 등록 취소하기");
        System.out.println( "3. 물건 넣기 (제품 입고) ");
        System.out.println( "4. 물건 빼기 (제품 출고)");
        System.out.println( "5. 재고 조회");
        System.out.println( "6. 프로그램 종료");

    }


    public void method3(){

        int num = 0;

        num = getNum();

        if(num == 6)
            return;

        switch (num) {
            case 1:
                for (int i = 0; i < item.length; i++) {
                    if (item[i].equals("등록가능")) {
                        item[i] = name;
                        break;
                    }
                    break;
                }

                break;

        }


        //출력
        for (String s : item) System.out.println(s);
    }
}
