public class Test {
  public static void main(String[] args) {
    Duck d1 = new WildDuck();
    Duck d2 = new CityDuck();
    Duck d3 = new CloudDuck();
    Duck d4 = new RubberDuck();

    System.out.println("Wild Duck");
    d1.quack();
    d1.fly();
    d1.display();
    System.out.println();

    System.out.println("City Duck");
    d2.quack();
    d2.fly();
    d2.display();
    System.out.println();

    System.out.println("Cloud Duck");
    d3.quack();
    d3.fly();
    d3.display();
    System.out.println();

    System.out.println("Rubber Duck");
    d4.quack();
    d4.fly();
    d4.display();
  }
}
