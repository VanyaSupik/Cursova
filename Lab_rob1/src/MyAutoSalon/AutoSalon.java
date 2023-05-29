package MyAutoSalon;


import MyAutoSalon.Interfaces.MethodsForAutoSalon;

public class AutoSalon extends Car implements MethodsForAutoSalon {

    private String name;
    private double length;
    private double width;
    private int numberOfCars;
    private double receipts;


    public AutoSalon(String name, double length, double width, double receipts) {
        super("Франція","Renault",2022,30000);
        this.name = name;
        this.length = length;
        this.width = width;
        this.receipts = receipts;
    }


    public void numberCars(){
        addCars();
        numberOfCars = cars.size();//кількість елементів
        System.out.println("Кількість автомобілів у салоні: " + numberOfCars);
   }

    public double square(){
        double s = length*width;
        System.out.println("Площа приміщення автосалону: " + s);
        return s;//Площа автосалону
    }

    public String nameOfSalon(String street){
        System.out.println("Автосалон " + name + " знаходиться на вулиці " + street);
        return name;
    }
    public void showCars(){
        System.out.println("Список наявних автомобілів у салоні: ");
        for (String s: cars){
            System.out.println("- " + s + ";");
        }
    }
    public double profit(int soldCars){
        if(soldCars <= 2 ){
            receipts = 75000;
        }else if(soldCars > 2 && soldCars < 4){
            receipts = 120000;
        }else {
            System.out.println("Виручка за день складає більше 120 тис. ");
        }
        System.out.println("Виручка за день складає: " + receipts + " тис.");
        return receipts;
    }

    public void info(){
        addCars();
        nameOfSalon("Городоцька 154А");
        showCars();
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public double getReceipts() {
        return receipts;
    }

    public void setReceipts(double receipts) {
        this.receipts = receipts;
    }


    public static void main(String[] args) {
        AutoSalon autoSalon = new AutoSalon("Renault", 20.0, 25.5, 0 );
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Інформаія про салон " + autoSalon.getName());
        autoSalon.numberCars();
        autoSalon.square();
        autoSalon.nameOfSalon("Городоцька 154А");
        autoSalon.showCars();
        autoSalon.profit(3);

    }
}
