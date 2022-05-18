
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyStorageV3 {

    static String[] products = new String[]{"등록 가능", "등록 가능", "등록 가능", "등록 가능", "등록 가능"};
    static int[] productsNum = new int[]{0, 0, 0, 0, 0};

    public static void main(String[] args) throws IOException { // 입력 시 잘못된 데이터 예외처리를 위한 Exception throws

        boolean isExit = false;                                 //해당 프로그램 무한 반복 하다가 종료 누르면 isExit true

        systemNotice("Item_Storage_V3", "");
        System.out.println("------------------------------");
        systemNotice("코드스테이츠 점장님 어서오세요.");
        systemNotice("해당 프로그램의 기능입니다.");
        while (!isExit) {                                       //true 시 loop빠져나감
            prodMenu();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼리더로 입력받음
                int selectNum = inputInteger(br);                               //예외처리(숫자 외 문자 입력 시 다시 입력하도록 하는 메소드)
                switch (selectNum) {
                    case 1 :
                        prodInput(br,products);                         // 제품 추가
                        break;
                    case 2:
                        prodRemove(br,products);                        // 제품 제거
                        break;
                    case 3:
                        prodAmountAdd(br,products);                     // 제품 입고
                        break;
                    case 4:
                        prodAmountDecrease(br,products);                // 제품 출고
                        break;
                    case 5:
                        prodSearch(products,true);                // 현재 제품 및 제품 갯수 파악
                        break;
                    case 6:
                        systemNotice("프로그램을 종료합니다.");           // 프로그램 종료
                        br.close();                                      // 버퍼리더 종료
                        isExit = true;                                   // 반복 프로그램 종료
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력하세요."); //1~6 벗어난 입력 시 다시 입력 안내
                }
        }
    }
    private static void prodInput(BufferedReader bufferedReader, String[] products) throws IOException {

        prodSearch(products,false);             // 현재 제품  파악

        String s ="";

        systemNotice("제품 등록을 원하는 제품명을 입력하세요 : ");
        s = bufferedReader.readLine();          // 제품명 입력
        int index = Arrays.asList(products).indexOf("등록 가능");   //List의 indexOf 기능을 이용하여 "등록 가능"의 가장 가까운 순서의 인덱스 확인

        if (index < 0) {                                           // 만약 "등록 가능" 이 없다면, 인덱스는 -1을 반환하므로 실행 x
            systemNotice("더이상 등록 할 수 없습니다.");
            return;
        }

        if (Arrays.asList(products).contains(s)) {                  // 배열 내 동일한 제품이 있는 경우 실행 x
            systemNotice("동일한 제품이 존재합니다.");
            return;
        }

        products[index] = s;
        systemNotice("등록이 완료됬습니다.");
        prodSearch(products,false);         // 현재 제품  파악
    }
    private static void prodRemove(BufferedReader bufferedReader, String[] products) throws IOException {

        prodSearch(products,false);             // 현재 제품 및 제품 갯수 파악

        String s = "";

        systemNotice("제품 등록 취소를 원하는 제품명을 입력하세요 : ");
        s = bufferedReader.readLine();              // 제품명 입력

        int index = Arrays.asList(products).lastIndexOf(s);     //List의 indexOf 기능을 이용하여 "등록 가능"의 가장 먼 순서의 인덱스 확인

        if (index < 0 || s.equals("등록 가능")) {               // 만약 입력된 데이터가 목록에 없다면, 인덱스는 -1을 반환하므로 실행 x, 등록 가능에 추가하려는 경우 실행 x
            systemNotice("해당 제품은 등록되어있지 않습니다.");
            return;
        }

        productsNum[index] = 0;                             // 등록 취소했으므로 갯수도 0개 초기화
        products[index] = "등록 가능";                        // 해당 부분 등록 가능하도록 설정
        systemNotice("제품 취소가 완료 되었습니다.");
        prodSearch(products,false);                   // 현재 제품  파악
    }
    private static void prodAmountAdd(BufferedReader bufferedReader, String[] products) throws IOException {

        prodSearch(products,true);                  // 현재 제품 및 개수 파악

        String s = "";

        int count = 0;
        systemNotice("제품의 수량을 추가합니다. (입고)");
        systemNotice("수량을 추가할 제품명을 입력하세요 : ");
        s = bufferedReader.readLine();                  // 제품명 입력

        int index = Arrays.asList(products).indexOf(s);  //List의 indexOf 기능을 이용하여 "등록 가능"의 가장 가까운 순서의 인덱스 확인

        if (index < 0 || s.equals("등록 가능")) {       // 만약 입력된 데이터가 목록에 없다면, 인덱스는 -1을 반환하므로 실행 x, 등록 가능에 추가하려는 경우 실행 x
            systemNotice("해당 제품은 등록되어있지 않습니다.");
            return;
        }

        systemNotice("추가할 수량을 입력해주세요 : ");
        count = inputInteger(bufferedReader);           //예외처리(숫자 외 문자 입력 시 다시 입력하도록 하는 메소드)

        if (count < 0) {                                // 0보다 작은 숫자일 경우 x
            systemNotice("0 이상의 숫자를 입력해 주세요.");
            return;
        }

        productsNum[index] += count;                    // 현재 제품의 갯수 + 입력된 갯수
        systemNotice("Clear", "정상적으로 제품의 수량 추가가 완료되었습니다.");
        prodSearch(products,true);               // 현재 제품 및 개수 파악
    }
    private static void prodAmountDecrease(BufferedReader bufferedReader, String[] products) throws IOException {

        prodSearch(products,true);               // 현재 제품 및 개수 파악

        String s = "";

        int count = 0;
        systemNotice("제품의 출고를 진행합니다.");
        systemNotice("출고를 진행할 제품명을 입력하세요 : ");
        s = bufferedReader.readLine();                  // 제품명 입력

        int index = Arrays.asList(products).lastIndexOf(s);

        if (index < 0 || s.equals("등록 가능")) {           // 만약 입력된 데이터가 목록에 없다면, 인덱스는 -1을 반환하므로 실행 x, 등록 가능에 추가하려는 경우 실행 x
            systemNotice("해당 제품은 등록되어있지 않습니다.");
            return;
        }

        systemNotice("원하는 출고량을 입력하세요 : ");
        count = inputInteger(bufferedReader);

        if (count < 0) {                                //예외처리(숫자 외 문자 입력 시 다시 입력하도록 하는 메소드)
            systemNotice("0 이상의 숫자를 입력해 주세요.");
            return;
        }

        if (productsNum[index] < count) {               //저장된 제품 보다 요청한 출고 갯수가 많은경우 x
            systemNotice("현재 제품의 수량보다 많은 양을 출고할 수 없습니다.");
            return;
        }

        productsNum[index] -= count;                // 저장된 제품 - 입력 갯수
        systemNotice("Clear", "출고가 완료되었습니다.");
        prodSearch(products,true);             // 현재 제품 및 개수 파악
    }
    private static void prodSearch(String[] products, boolean isNum) {
        systemNotice("현재 등록된 물건 목록 ▼");         // 현재 제품 및 개수 파악
        if (isNum)
            for (int i = 0; i < products.length; i++)
                System.out.printf("> %s : %d개%n", products[i], productsNum[i]);     //isNum이 true 인 경우 전체 제품과 제품 갯수 데이터 출력
        else
            for (String product : products) System.out.printf("> %s%n", product);    //isNum이 false 인 경우 전체 제품 출력

    }
    private static void prodMenu() {
        int index = 1;                                                              //만약 메뉴가 추가된다면, 번호 상관없이 지정할 수 있도록 index++로 지정(ex,
                                                                                    // 4번 메뉴에 추가되는경우 해당 부분에 넣으면 자동으로 한칸씩 밀리는효과
        System.out.printf("%d. 물건 정보(제품명) 등록하기%n", index++);
        System.out.printf("%d. 물건 정보(제품명) 등록 취소하기%n", index++);
        System.out.printf("%d. 물건 넣기 (제품 입고)%n", index++);
        System.out.printf("%d. 물건 빼기 (제품 출고)%n", index++);
        System.out.printf("%d. 재고 조회%n", index++);
        System.out.printf("%d. 프로그램 종료%n", index);
        System.out.printf("------------------------------%n");
        systemNotice("원하는 기능의 번호를 입력하세요 : ");
    }
    private static void systemNotice(String title, String s) {                         //[]가 표시된 값 출력
        System.out.println("[" + title + "] " + s);
    }
    private static void systemNotice(String s) {                                        //[System]이 표시된 값 출력
        System.out.println("[System] " + s);
    }
    private static int inputInteger(BufferedReader bufferedReader){                     //입력 데이터가 숫자가 아닌경우 다시 입력받도록 하는 메소드
        String str = "";
        int num = 0;
        try {
            num = Integer.parseInt(bufferedReader.readLine());                          //정상적일경우 num에 데이터 입력
        } catch (IOException | NumberFormatException e) {                               //에러 발생일 경우
            System.out.println("[System] 잘못된 입력입니다. 다시 입력하세요.");
            return inputInteger(bufferedReader);                                        //재귀함수(자기자신 다시 실행)
        }
        return num;                                                                     //int값 반환
    }
}


