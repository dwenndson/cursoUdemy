import entities.Quantos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("How many rooms will be rented? ");
        int rooms = sc.nextInt();

        while (rooms > 9) {
            System.out.println("O número máximo de quantos é 9, 0 também conta");
            rooms = sc.nextInt();
        }
        Quantos[] hotel = new Quantos[rooms];
        sc.nextLine();
        for (int i = 0; i < hotel.length; i++) {
            System.out.println("Rent #"+i+":");
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            hotel[i] = new Quantos(name, email, room);

        }
        System.out.println("Busy rooms: ");
        for (Quantos quarto :
                hotel) {
            System.out.println(quarto);
        }
    }
}
