package MyAutoSalon;

import java.util.Scanner;

public class MainAutoSalon {
    public static void main(String[] args) {
        DispatchAutoSalon dispatchAutoSalon = new DispatchAutoSalon();
        System.out.println("Виберіть опцію: Інформація про клас AutoSalon/Інформаія про клас Car/Інформація про клас Client/Інформація про клас CarOrder/Інформація про клас Finance/Інформаія про клас Seller");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        dispatchAutoSalon.choice(s);
    }
}
