package MyAutoSalon;

import MyAutoSalon.Interfaces.MethodsForCarOrder;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CarOrder extends Client implements MethodsForCarOrder {
    private int orderId;
    private Date orderDate;
    private Car car;
    private String inputCar;
    private String confirm;
    private ArrayList<String> orderedCar = new ArrayList<>();
    private ArrayList<String> customer = new ArrayList<>();


    public CarOrder(String brand, String model, int budget, double volume, String fuel, String name, String email, String phone, int orderId, Date orderDate, Car car) {
        super(brand, model, budget, volume, fuel, name, email, phone);
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.car = car;
    }

    public CarOrder(String model, int orderId, Date orderDate, Car car) {
        super(model);
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.car = car;

    }

    public void carToOrder(){
        System.out.println("Вкажіть який автомобіль ви б хотіли замовити");
        car.addCars();
        Scanner scanner = new Scanner(System.in);
        inputCar = scanner.nextLine();
        if (car.cars.contains(inputCar)){
            System.out.println("Автомобіль є в наявності, можна оформити замовлення");
            orderedCar.add(inputCar);

        }else {
            System.out.println("Бажаного автомобіля немає в наявності, виберіть інший");
        }
    }

    public void order(){
        System.out.println("Оформлюємо замовлення ");
        System.out.println("Ваші дані з бази даних автосалону, які потрібні для оформлення замовлення: ");
        String s = "Ім'я: " + getName() + "\n" + "Email: " + getEmail() + "\n" + "Номер телефону: " + getPhone() + "\n" + "Дата замовлення: " + orderDate + "\n" + "Номер замовлення: " + orderId;
        System.out.println("Інформація про замовника: " + s);
        customer.add(s);
    }

    public void cancel(){
        orderedCar.removeAll(orderedCar);
        customer.removeAll(customer);
        System.out.println("Замовлення скасовано ");
    }

    public void confirmInfo(){
        System.out.println("Виберіть опцію: Підтвердити/Скасувати");
        Scanner scanner = new Scanner(System.in);
        confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Підтвердити")){
            System.out.println("Замовлення успішно оформлене");
            for (String s:customer){
                System.out.println(s);
            }
            System.out.println("Обраний автомобіль");
            for (String s:orderedCar){
                System.out.println(s);
            }
        }else if (confirm.equalsIgnoreCase("Скасувати")){
            cancel();
        }else {
            System.out.println("Введено невірний запит");
        }
    }
    public void info(){
        order();
        for (String n:orderedCar){
            System.out.println("Обраний автомобіль " + n);
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInputCar() {
        return inputCar;
    }

    public void setInputCar(String inputCar) {
        this.inputCar = inputCar;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }


    public static void main(String[] args) {
        CarOrder carOrder = new CarOrder("Renault","Megane", 20000,2.0,"Дизель","Іван Супик","vanjasupik51352@gmail.com","+380973892020", 28021, new Date(), new Car("Франція","Renault",2022,30000));
        System.out.println("----------------------------------------------------------------------------------------");
        carOrder.carToOrder();
        System.out.println("----------------------------------------------------------------------------------------");
        carOrder.order();
        System.out.println("----------------------------------------------------------------------------------------");
        carOrder.confirmInfo();
    }

}
