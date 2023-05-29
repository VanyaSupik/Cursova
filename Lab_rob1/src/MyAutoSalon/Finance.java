package MyAutoSalon;

import MyAutoSalon.Interfaces.MethodsForFinance;

import java.util.ArrayList;

public class Finance extends Car implements MethodsForFinance {
    private double totalRevenue;
    private double totalExpenses;
    private double netProfit;
    private ArrayList<Sale> sales;//зберігає інформацію про проданий автомобіль

    public Finance(ArrayList<Sale> sales) {
        super("Франція","Renault",2022,30000);
        this.sales = sales;
    }

    public double calculateTotalRevenue() {
        for (Sale sale : sales) {
            totalRevenue += sale.getPrice();
        }
        System.out.println("Загальний дохід автосалону: " + totalRevenue );
        return totalRevenue;
    }

    public double calculateTotalExpenses() {
        for (Sale sale : sales) {
            totalExpenses += sale.getCost();
        }
        System.out.println("Загальні витрати автосалону: " + totalExpenses);
        return totalExpenses;
    }

    public double calculateNetProfit() {
        double n = totalRevenue - totalExpenses;
        System.out.println("Чистий дохід автосалону: " + n);
        return n;
    }
    public void info(){
        sales.add(new Sale("Renault Scenic",25000.0,23000.0));
        calculateTotalRevenue();
        calculateTotalExpenses();
        calculateNetProfit();
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public double getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(double netProfit) {
        this.netProfit = netProfit;
    }

    public static class Sale {
        private String carModel;
        private double price;
        private double cost;

        public Sale(String carModel, double price, double cost) {
            this.carModel = carModel;
            this.price = price;
            this.cost = cost;
        }

        public double getProfit() {
            return price - cost;
        }

        public double getProfitMargin() {
            return getProfit() / price;
        }

        public String toString() {
            return "Модель автомобіля: " + carModel + "\nЦіна: $" + price + "\nВартість автомобіля для автосалону: $" + cost + "\nПрибуток: $" + getProfit() + "\nПрибуток з продажу автомобіля у відсотках: " + getProfitMargin() * 100 + "%";
        }

        public String getCarModel() {
            return carModel;
        }

        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
    }

    public static void main(String[] args) {

        Finance finance = new Finance(new ArrayList<>());
        finance.sales.add(new Sale("Renault Scenic",25000.0,23000.0));
        finance.sales.add(new Sale("Renault Megane",30000.0,26000.0));
        finance.sales.add(new Sale("Renault Laguna",27000.0,24000.0));
        finance.sales.add(new Sale("Renault Duster",20000.0,18000.0));
        finance.sales.add(new Sale("Renault Logan",29000.0,25000.0));
        finance.sales.add(new Sale("Renault Clio",24000.0,20000.0));
        finance.sales.add(new Sale("Renault Zoe",25000.0,24000.0));

        finance.calculateTotalRevenue();
        finance.calculateTotalExpenses();
        finance.calculateNetProfit();

        System.out.println("----------------------------------------------------------------------------------------");

        Sale sale1 = new Sale("Renault Scenic",25000.0,23000.0);
        Sale sale2 = new Sale("Renault Megane",30000.0,26000.0);
        Sale sale3 = new Sale("Renault Laguna",27000.0,24000.0);
        Sale sale4 = new Sale("Renault Duster",20000.0,18000.0);
        Sale sale5 = new Sale("Renault Logan",29000.0,25000.0);
        Sale sale6 = new Sale("Renault Clio",24000.0,20000.0);
        Sale sale7 = new Sale("Renault Zoe",25000.0,24000.0);

        System.out.println(sale1.toString());
        System.out.println(sale2.toString());
        System.out.println(sale3.toString());
        System.out.println(sale4.toString());
        System.out.println(sale5.toString());
        System.out.println(sale6.toString());
        System.out.println(sale7.toString());
    }
}

