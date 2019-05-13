public class NoQuack implements IQuackBehavior {

  @Override
  public void quack() {
    System.out.println("Why I can't quack.");
  }
}
