package lista4;

import java.util.Scanner;

public class exercicio2 {

    static abstract class Funcionario {
        String nome;
        String matricula;
        double salarioBase;

        Funcionario(String nome, String matricula, double salarioBase) {
            this.nome = nome;
            this.matricula = matricula;
            this.salarioBase = salarioBase;
        }

        abstract double calcularSalario();

        void exibirInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Salário final: R$ " + calcularSalario());
        }
    }

    static class FuncionarioCLT extends Funcionario {

        FuncionarioCLT(String nome, String matricula, double salarioBase) {
            super(nome, matricula, salarioBase);
        }

        @Override
        double calcularSalario() {
            return salarioBase + (salarioBase * 0.10);
        }
    }

    static class FuncionarioComissionado extends Funcionario {
        double comissao;

        FuncionarioComissionado(String nome, String matricula, double salarioBase, double comissao) {
            super(nome, matricula, salarioBase);
            this.comissao = comissao;
        }

        @Override
        double calcularSalario() {
            return salarioBase + comissao;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a comissão do funcionário: R$ ");
        double comissao = scanner.nextDouble();

        if (comissao < 0) {
            System.out.println("Comissão inválida!");
            scanner.close();
            return;
        }

        Funcionario funcionario1 = new FuncionarioCLT("Joao", "001", 2000);
        Funcionario funcionario2 = new FuncionarioComissionado("Maria", "002", 1500, comissao);

        System.out.println("\nFuncionário CLT:");
        funcionario1.exibirInfo();

        System.out.println("\nFuncionário Comissionado:");
        funcionario2.exibirInfo();

        scanner.close();
    }
}