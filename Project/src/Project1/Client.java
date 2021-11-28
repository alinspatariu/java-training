package Project1;

public class Client implements Observer {
    private String name;
    Store store = new Store();
    Client(String name){
        this.name=name;

    }
    @Override
    public void update(){
        System.out.print(name + " Your car is in our shop " );
    }
    @Override
    public void followstore(Store store)
    {
        this.store = store;
    }


}
