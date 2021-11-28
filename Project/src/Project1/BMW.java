package Project1;

public class BMW implements Car{
  public void type(){
      System.out.println("BMW");
  }

    @Override
    public void power() {
        System.out.println("250 HP");
    }
}
