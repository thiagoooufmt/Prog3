package lista3;

public class exercicio2 {

    static class Pessoa {
        String nome;
        int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }

    static class Aluno extends Pessoa {
        String matricula;

        Aluno(String nome, int idade, String matricula) {
            super(nome, idade);
            this.matricula = matricula;
        }

        void exibirInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Matrícula: " + matricula);
        }
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 20, "2026001");

        aluno1.exibirInfo();

    }
}