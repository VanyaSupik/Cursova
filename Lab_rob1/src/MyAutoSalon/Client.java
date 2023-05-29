package MyAutoSalon;

import MyAutoSalon.Interfaces.MethodsForClient;

import java.util.ArrayList;

public class Client extends Car implements MethodsForClient {
    private String brand;//Бренд
    private String model;//Модель
    private int budget;//Бюджет
    private double volume;
    private String fuel;
    private String name;
    private String email;
    private String phone;

    ArrayList<String> allClients = new ArrayList<>();

    public Client(String brand, String model, int budget, double volume, String fuel, String name, String email, String phone) {
        super("Франція","Renault",2022,30000);
        this.brand = brand;
        this.model = model;
        this.budget = budget;
        this.volume = volume;
        this.fuel = fuel;
        this.name = name;
        this.email = email;
        this.phone = phone;

    }
    public Client(String model){
        super("Франція","Renault",2022,30000);
        this.model = model;

    }

    public void printInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Email: " + email);
        System.out.println("Номер телефону: " + phone);
    }



    public void favoriteCar(){
        System.out.println("Клієнт приїхав за: " + brand + " " + model);//Улюблений автомобіль
    }
    public int money(){
        System.out.println("Клієнт прийшов в автосалон з бюджетом: " + budget);
        return budget;
    }
    public void carInSalon(boolean car){
        if(car == true){
            System.out.println(brand + " " + model + " є в автосалоні. Можна оформити купівлю");
        }else {
            System.out.println(brand + " " + model + " немає в наявності");
        }

    }
    public void availability(double volumeDemo,String fuelDemo){
        if(volumeDemo==volume & fuelDemo.equals(fuel)){
            System.out.println("Бажаний автомобіль в наявності");
        }else {
            System.out.println("Немає такого автомобіля");
        }

    }
    public void addClients(Client c){
        allClients.add(c.name);
        allClients.add(c.phone);
        allClients.add(c.email);
        System.out.println("Клієнт добавлений в базу даних автосалону ");
        System.out.println("Інформація про доданого клієнта: ");
        for (String s: allClients){
            System.out.println("- " + s + "; ");
        }
    }
    public void info(){
        addClients(new Client("Renault","Megane", 20000,2.0,"Дизель","Іван Супик","vanjasupik51352@gmail.com","+380973892020"));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public static void main(String[] args) {
        Client client1 = new Client("Renault","Megane", 20000,2.0,"Дизель","Іван Супик","vanjasupik51352@gmail.com","+380973892020");
        Client client2 = new Client("Renault","Scenic", 15000,1.6,"Бензин","Ірина Гречин","irynahr19@gmail.com","+380963822150");
        Client client3 = new Client("Renault","Laguna", 25000,1.5,"Дизель","Юрій Самборин","yurasamboryn24@gmail.com","+380927862154");
        Client client4 = new Client("Renault","Duster", 30000,2.2,"Бензин","Василь Рущак","wasyaruschak01@gmail.com","+380943762169");

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Інформація про клієнта 1 ");
        client1.printInfo();
        client1.favoriteCar();
        client1.money();
        client1.carInSalon(true);
        client1.availability(2.0,"Дизель");
        client1.addClients(client1);

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Інформація про клієнта 2 ");
        client2.printInfo();
        client2.favoriteCar();
        client2.money();
        client2.carInSalon(true);
        client2.availability(1.6,"Бензин");
        client2.addClients(client2);

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Інформація про клієнта 3 ");
        client3.printInfo();
        client3.favoriteCar();
        client3.money();
        client3.carInSalon(true);
        client3.availability(1.5,"Дизель");
        client3.addClients(client3);

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Інформація про клієнта 4 ");
        client4.printInfo();
        client4.favoriteCar();
        client4.money();
        client4.carInSalon(true);
        client4.availability(2.2,"Бензин");
        client4.addClients(client4);

        System.out.println("----------------------------------------------------------------------------------------");

    }
}
