package Project1;

public class Mercedes implements Car{
    public void type(){
        System.out.println("Mercedes");
    }

    @Override
    public void power() {
        System.out.println("200HP");
    }
}
