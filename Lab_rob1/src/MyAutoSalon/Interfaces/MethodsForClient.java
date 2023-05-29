package MyAutoSalon.Interfaces;

import MyAutoSalon.Client;

public interface MethodsForClient {
    public void printInfo();
    public void favoriteCar();
    public int money();
    public void carInSalon(boolean car);
    public void availability(double volumeDemo,String fuelDemo);
    public void addClients(Client c);

}

