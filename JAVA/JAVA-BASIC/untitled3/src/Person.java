public class Person {
    String name;
    private int age;

    public Person() {
        this.name = "홍길동";
        this.age = 3;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void learn(){
        System.out.println("공부를 합니다.");

    }
    void walk(){
        System.out.println("걷습니다.");
    }
    void eat(){
        System.out.println("밥을 먹습니다.");
    }

    public int calc(String op, int x, int y){

       int result = 0;

        if( op == "+")
            result = sum(x, y);
        else if (op == "-")
            result = minus(x, y);

        return result;
    }


    private int sum(int x, int y){

        int result = x + y;

        return result;
    }

    private int minus(int x, int y){

        int result = x - y;

        return result;
    }



}

class Programmer extends Person {
    String companyName;

    public Programmer() {
        super();
    }

    public Programmer(String name, int age) {
        super(name, age);


    }

    void coding(){
        System.out.println("코딩을 합니다.");
    }


    @Override //재 정의
    void learn(){
        System.out.println("코딩 공부를 합니다.");
    }

}

class Dancer extends Person {
    String groupName;

    public Dancer(String name, int age) {
        super(name, age);

    }

    void dancing(){
        System.out.println("춤을 춥니다.");
    }
}

class Singer extends Person {
    String bandName;

    public Singer(String name, int age) {
        super(name, age);
    }

    void singing(){
        System.out.println("노래합니다.");
    }
    void playGuitar(){
        System.out.println("기타를 칩니다.");
    }
}