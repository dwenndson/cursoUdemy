package entities;

public class Pessoa {
    private String Nome;
    private int Idade;
    private double Altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura) {
        Nome = nome;
        Idade = idade;
        Altura = altura;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }
}
