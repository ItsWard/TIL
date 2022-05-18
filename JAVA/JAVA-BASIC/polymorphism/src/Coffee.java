public abstract class Coffee {
    int price;

    public Coffee(int price) {
        this.price = price;
    }
Integer
   public abstract void setTemp();

}

class Americano extends Coffee{

    public Americano() {
        super(1500);
    }

    @Override
    public String toString(){
       return "아메리카노";
    }

    @Override
    public void setTemp() {
        System.out.println("123");
    }
}

class Latte extends Coffee{
    public Latte() {
        super(2000);
    }

    @Override
    public String toString(){
        return "라떼";
    }

    @Override
    public void setTemp() {
        System.out.println("456");
    }
}

class ColdBrew extends Coffee{
    public ColdBrew() {
        super(3000);
    }

    @Override
    public String toString(){
        return "콜드브루";
    }

    @Override
    public void setTemp() {
        System.out.println("789");
    }
}


