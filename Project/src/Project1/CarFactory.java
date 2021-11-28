package Project1;

public class CarFactory {
    public  Car getCar(String type){
        if(type.equals("Audi")) {
            return new Audi();}
        else
            if(type.equals("BMW"))
            {return new BMW();}
            else
                if(type.equals("Mercedes"))
                {return new Mercedes();}
                return null;

    }
}
