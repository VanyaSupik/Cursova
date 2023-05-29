package MyAutoSalon;

import MyAutoSalon.Interfaces.MethodsForAutoSalon;

import java.time.LocalDate;
import java.util.ArrayList;

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    ArrayList<String> cars = new ArrayList<>();//зберігає доступні автомобілі в автосалоні


    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void addCars(){
        cars.add("Scenic");
        cars.add("Megane");
        cars.add("Laguna");
        cars.add("Duster");
        cars.add("Logan");
        cars.add("Clio");
        cars.add("Zoe");
    }

    public double calculateValue() {
        int age = LocalDate.now().getYear() - this.year;
        double depreciation = 0.1 * age * this.price;
        return this.price - depreciation; //метод для обчислення вартості автомобіля
    }

    public void displayInformation() {
        System.out.println("Виробник: " + this.make);
        System.out.println("Марка: " + this.model);
        System.out.println("Рік випуску: " + this.year);
        System.out.println("Ціна: " + this.price);
    }

    public void newCar(String newCar){
        if (newCar != null){
            addCars();
            cars.add(newCar);
            System.out.println("Нове авто додано до списку доступних автомобілів в автосалоні");
            System.out.println("Оновлений список доступних автомобілів: ");
            for (String s: cars){
                System.out.println("- " + s + ";");
            }
        }else {
            System.out.println("Оновлення, доступного списку автомобілів в автосалоні, відсутнє ");

        }
    }

    public void startEngine() {
        System.out.println("Продавець-консультант запустив двигун");
    }

    public void stopEngine() {
        System.out.println("Продавець-консультант зупинив двигун");
    }

    public void testDrive(boolean s) {
        System.out.println("Клієнт вибрав " + year + " " + make + " " + model + " для тест-драйву...");
        startEngine();
        System.out.println("Клієнт катається...");
        stopEngine();
        System.out.println("Тест-драйв закінчено");
        if (s) {
            System.out.println("Клієнт задоволений автомобілем " + model);
        } else if (!(s)) {
            System.out.println("Клієнт не задоволений автомобілем " + model);
        }
    }

    public void info(){
        displayInformation();
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------------");
        Car car = new Car("Франція","Renault",2022,30000);
        System.out.println("Вартість автомобіля " + car.getYear() + " року: " + car.calculateValue());
        car.displayInformation();
        car.newCar("Captur");
        car.testDrive(true);
        System.out.println("----------------------------------------------------------------------------------------");
    }

}
