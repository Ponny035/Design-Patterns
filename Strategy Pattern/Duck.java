public class Duck implements IQuackBehavior, IFlyBehavior, IDisplayBehavior {

  IQuackBehavior quackBehavior;
  IFlyBehavior flyBehavior;
  IDisplayBehavior displayBehavior;

  public Duck(IQuackBehavior quackBehavior, IFlyBehavior flyBehavior, IDisplayBehavior displayBehavior) {
    this.quackBehavior = quackBehavior;
    this.flyBehavior = flyBehavior;
    this.displayBehavior = displayBehavior;
  }

  @Override
  public void quack() {
    this.quackBehavior.quack();
  }

  @Override
  public void fly() {
    this.flyBehavior.fly();
  }

  @Override
  public void display() {
    this.displayBehavior.display();
  }
}
