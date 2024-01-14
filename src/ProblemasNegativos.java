import java.util.Scanner;

public class ProblemasNegativos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int tam = sc.nextInt();

        int[] vec = new int[tam];

        sc.nextLine();

        for(int n = 0; n < vec.length; n++) {
            System.out.print("Digite um numero: ");
            vec[n] = sc.nextInt();
        }
        System.out.println("Numeros negativos");
        for (int i : vec) {
            if (i < 0) {
                System.out.println(i);
            }

        }
    }
}
