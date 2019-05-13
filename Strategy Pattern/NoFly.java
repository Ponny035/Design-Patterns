public class NoFly implements IFlyBehavior {

  @Override
  public void fly() {
    System.out.println("Why I can't fly.");
  }
}
