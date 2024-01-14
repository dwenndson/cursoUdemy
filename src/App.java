import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vec = new Product[n];

        for (int i = 0; i < vec.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vec[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vec.length; i++){
            sum += vec[i].getPrice();
        }
        double avg = sum / vec.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
    }
}
