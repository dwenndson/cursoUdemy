import java.util.Locale;
import java.util.Scanner;

public class somar_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int tam = sc.nextInt();

        double[] vec = new double[tam];
        double soma = 0;

        for(int n = 0; n < vec.length; n++) {
            System.out.print("Digite um numero: ");
            vec[n] = sc.nextDouble();
            soma += vec[n];
        }
        double media = soma / vec.length;

        System.out.print("VALORES = ");
        for (double i : vec) {
            System.out.print(i + " ");
        }

        System.out.printf("\nSOMA = %.2f%n", soma);

        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}
