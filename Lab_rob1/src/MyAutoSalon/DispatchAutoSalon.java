package MyAutoSalon;

import java.util.ArrayList;
import java.util.Date;

public class DispatchAutoSalon {
    AutoSalon autoSalon = new AutoSalon("Renault", 20.0, 25.5, 0 );
    Car car = new Car("Франція","Renault",2022,30000);
    CarOrder carOrder = new CarOrder("Renault","Megane", 20000,2.0,"Дизель","Іван Супик","vanjasupik51352@gmail.com","+380973892020", 28021, new Date(), new Car("Франція","Renault",2022,30000));
    Finance finance = new Finance(new ArrayList<>());
    Client client1 = new Client("Renault","Megane", 20000,2.0,"Дизель","Іван Супик","vanjasupik51352@gmail.com","+380973892020");
    Seller seller1 = new Seller("Іван","Супик",25000,3,0);

    Car c;//виконання динамічної диспетчеризації реалізовано за допомогою посилкової змінної с.

    void choice(String i){
        if (i.equalsIgnoreCase("Інформація про клас AutoSalon")){
            c = autoSalon;
            c.info();
        }else if(i.equalsIgnoreCase("Інформаія про клас Car")){
            c = car;
            c.info();
        }else if (i.equalsIgnoreCase("Інформація про клас Client")){
            c = client1;
            c.info();
        }else if (i.equalsIgnoreCase("Інформація про клас CarOrder")){
            c = carOrder;
            c.info();
        }else if (i.equalsIgnoreCase("Інформація про клас Finance")){
            c = finance;
            c.info();
        }else if (i.equalsIgnoreCase("Інформаія про клас Seller")){
            c = seller1;
            c.info();
        }else {
            System.out.println("Помилка, запустіть програму знову");

        }

    }

}

