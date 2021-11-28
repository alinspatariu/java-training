package Project1;

public class Watch {
    public static void main(String[] args){
        Store carshop1 = new Store();
        CarFactory carFactory = new CarFactory();
        Car car=carFactory.getCar("Audi");
        Car car1=carFactory.getCar("BMW");
        Client client1= new Client("Alin");
        Client client2=new Client("Raul");
        Client client3=new Client("David");
        carshop1.addclient(client1);
        carshop1.addclient(client2);
        carshop1.addclient(client3);
        carshop1.addcar(car);
        carshop1.addcar(car1);

        client1.followstore(carshop1);
        client2.followstore(carshop1);

        carshop1.removeclient(client2);


        carshop1.updatecar(car);
        carshop1.updatecar(car1);
    }
}
