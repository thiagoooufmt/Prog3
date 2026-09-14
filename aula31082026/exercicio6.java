package aula31082026;

import java.util.ArrayList;
import java.util.Iterator;

public class exercicio6 {

    public static void main(String[] args) {

        class ContaBancaria {

            int numero;
            String titular;
            double saldo;

            ContaBancaria(int numero, String titular, double saldo) {
                this.numero = numero;
                this.titular = titular;
                this.saldo = saldo;
            }
        }

        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaBancaria(101, "João", 1500.00));
        contas.add(new ContaBancaria(102, "Maria", 2500.00));
        contas.add(new ContaBancaria(103, "Carlos", 3000.00));

        Iterator<ContaBancaria> iterator = contas.iterator();

        double saldoTotal = 0;

        while (iterator.hasNext()) {
            ContaBancaria conta = iterator.next();

            System.out.println("Número: " + conta.numero);
            System.out.println("Titular: " + conta.titular);

            saldoTotal += conta.saldo;
        }

        System.out.printf("Saldo total acumulado no banco: R$ %.2f%n", saldoTotal);
    }
}
