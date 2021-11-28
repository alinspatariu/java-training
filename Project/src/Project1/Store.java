package Project1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Store implements Clients {
    public Car car;
    ArrayList<Client> clients = new ArrayList<>();
    ArrayList<Car> cars = new ArrayList<>();

    @Override
    public void addclient(Client client){
        clients.add(client);
    }
    @Override
    public void removeclient(Client client){
        clients.remove(client);

    }
    @Override
    public void notifyClients(Car car){
        for(Client client :clients)
        {
            if(cars.contains(car))
            {
                client.update();
                System.out.println(" " +car.getClass().getSimpleName());
            }


        }
    }
    @Override
    public void updatecar(Car car){
        this.car=car;
        notifyClients(car);
    }

   public void addcar(Car car){
        cars.add(car);
   }
   public void removecar(Car car){
        cars.remove(car);
   }

}

