package chap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {

  public static void main(String... args) {
    List<Apple> inventory = Arrays.asList(
        new Apple(80, "green"),
        new Apple(155, "green"),
        new Apple(120, "red")
    );

    // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
    List<Apple> greenApples = filterApples(inventory, (Apple apple) -> "green".equals((apple.getColor())));
    prettyPrintApple(inventory, new ApplSimpleFormatter());
    System.out.println(greenApples);
  }



  public interface AppleFormatter {
    String accept(Apple apple);
  }

  public static void prettyPrintApple(List<Apple> inventory, AppleFormatter f){
    for(Apple apple : inventory){
      String output = f.accept(apple);
      System.out.println(output);
    }
  }

  public static class ApplSimpleFormatter implements AppleFormatter{
    public String accept(Apple apple){
      String charateristic = apple.getWeight() > 150 ? "heavy" : "light";
      return "A" + charateristic + " " + apple.getColor() + " apple";
    }

  }


public interface ApplePridicate{
  boolean test (Apple apple);
}


  public static class AppleHeavyWeighhtPredicate implements ApplePridicate{
    public boolean test(Apple apple) {
      return apple.getWeight() > 150;
    }
  }

  public class AppleGreenColorPredicate implements ApplePridicate{
    public boolean test(Apple apple) {
      return "green".equals(apple.getColor());
    }
  }

  public static List<Apple> filterApples(List<Apple> inventory, ApplePridicate p){
    List<Apple> result = new ArrayList<>();
    for(Apple apple : inventory){
      if(p.test(apple)){
        result.add(apple);
      }
    }
    return result;
  }

  public static class Apple {

    private int weight = 0;
    private String color = "";

    public Apple(int weight, String color) {
      this.weight = weight;
      this.color = color;
    }

    public int getWeight() {
      return weight;
    }

    public void setWeight(int weight) {
      this.weight = weight;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }

    @SuppressWarnings("boxing")
    @Override
    public String toString() {
      return String.format("Apple{color='%s', weight=%d}", color, weight);
    }

  }

}
