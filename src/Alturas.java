import entities.Pessoa;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Quantas pessoas seram digitadas? ");
        int pessoas = sc.nextInt();

        Pessoa[] listPessoas = new Pessoa[pessoas];
        for (int i = 0; i < listPessoas.length; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.print("Nome: ");
            pessoa.setNome(sc.next());
            System.out.print("Idade: ");
            pessoa.setIdade(sc.nextInt());
            System.out.print("Altura: ");
            pessoa.setAltura(sc.nextDouble());
            listPessoas[i] = pessoa;
        }
        double mediaAltura = Arrays.stream(listPessoas)
                .mapToDouble(Pessoa::getAltura)
                .average()
                .getAsDouble();
        System.out.printf("Altura média: %.2f\n",  mediaAltura);

        double pessoaMenorDezeseisPorcentagem = (double) Arrays.stream(listPessoas)
                .filter(pessoa -> pessoa.getIdade() < 16)
                .count() / pessoas * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", pessoaMenorDezeseisPorcentagem);

        sc.nextLine();
        for (Pessoa pessoa : listPessoas) {
            String nome = pessoaMenorDeseis(pessoa);
            if(nome != null){
                System.out.println(nome);
            }
        }
    }

    private static double alturaMedia(Pessoa[] pessoas) {
        double media = 0;
        for (Pessoa pessoa : pessoas) {
            media += pessoa.getAltura();
        }
        return media - pessoas.length;
    }

    private static String pessoaMenorDeseis(Pessoa pessoa) {
        if (pessoa.getIdade() < 16){
            return pessoa.getNome();
        }
        return null;
    }
}
