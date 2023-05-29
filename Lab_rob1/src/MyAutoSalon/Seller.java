package MyAutoSalon;

import MyAutoSalon.Interfaces.MethodsForSeller;

public class Seller extends Car implements MethodsForSeller {
    private String name;
    private String surName;
    private int salary;
    private int carSold;
    private double commission;//Розмір комісії продавця з продажу автомобіля

    public Seller(String name, String surName, int salary, int carSold, double commission) {
        super("Франція","Renault",2022,30000);
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.carSold = carSold;
        this.commission = commission;
    }


    public String props(){
        System.out.println("Ім'я і прізвище продавця: " + name + " " + surName);
        return null;
    }


    public void salary(){
        System.out.println("Щомісячна зарплата - "+ salary);
    }

    public void commissionRate(double carPrice){
        if(carPrice <= 25000.00 && carPrice >= 20000.00 ){
            commission = 0.05;
            System.out.println("Розмір комісії продавця з продажу автомобіля: " + carPrice*commission);

        }else if (carPrice > 25000.00){
            commission = 0.08;
            System.out.println("Розмір комісії продавця з продажу автомобіля: " + carPrice*commission);
        }
    }

    public void soldCar(){
        System.out.println("Всередньому в день " + name + " " + surName + " продає " + carSold + " автомобілів");
    }

    public void searchCars(){
        AutoSalon autoSalon = new AutoSalon("Renault", 20.0, 25.5, 0);
        Client client = new Client("Duster");
        autoSalon.addCars();
        System.out.println("Наявні автомобілі в автосалоні:");
        for (String s: autoSalon.cars){
            System.out.println("- " + s + ";");
        }
        if (client.getModel() == autoSalon.cars.get(0)){
            System.out.println("Автомобіль є в наявності, можна оформити купівлю ");
            System.out.println("Покупка пройшла успішно ");
            autoSalon.cars.remove(0);
        }
        else if(client.getModel() == autoSalon.cars.get(1)){
            System.out.println("Автомобіль є в наявності, можна оформити купівлю ");
            System.out.println("Покупка пройшла успішно ");
            autoSalon.cars.remove(1);
        }
        else if(client.getModel() == autoSalon.cars.get(2)){
            System.out.println("Автомобіль є в наявності, можна оформити купівлю ");
            System.out.println("Покупка пройшла успішно ");
            autoSalon.cars.remove(2);
        }
        else if(client.getModel() == autoSalon.cars.get(3)){
            System.out.println("Автомобіль є в наявності, можна оформити купівлю ");
            System.out.println("Покупка пройшла успішно ");
            autoSalon.cars.remove(3);
        }
        else if(client.getModel() == autoSalon.cars.get(4)){
            System.out.println("Автомобіль є в наявності, можна оформити купівлю ");
            System.out.println("Покупка пройшла успішно ");
            autoSalon.cars.remove(4);
        }
        else if(client.getModel() == autoSalon.cars.get(5)){
            System.out.println("Автомобіль є в наявності, можна оформити купівлю ");
            System.out.println("Покупка пройшла успішно ");
            autoSalon.cars.remove(5);
        }
        else if(client.getModel() == autoSalon.cars.get(6)){
            System.out.println("Автомобіль є в наявності, можна оформити купівлю ");
            System.out.println("Покупка пройшла успішно ");
            autoSalon.cars.remove(6);
        }else {
            System.out.println("Такого автомобіля немає в наявності");
        }
        System.out.println("Автомобілі які залишилися в автосалоні");
        for (String s: autoSalon.cars){
            System.out.println("- " + s + ";");
        }
    }

    public void info(){
        props();
        salary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCarSold() {
        return carSold;
    }

    public void setCarSold(int carSold) {
        this.carSold = carSold;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public static void main(String[] args) {
        Seller seller1 = new Seller("Іван","Супик",25000,3,0);
        Seller seller2 = new Seller("Ірина","Гречин",25000,1,0);

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Інформація про першого продавця");
        seller1.props();
        seller1.salary();
        seller1.commissionRate(25000.00);
        seller1.soldCar();
        seller1.searchCars();

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Інформація про другого продавця");
        seller2.props();
        seller2.salary();
        seller2.commissionRate(30000.00);
        seller2.soldCar();
        seller2.searchCars();

    }
}
