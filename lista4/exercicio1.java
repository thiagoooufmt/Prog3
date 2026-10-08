package lista4;

public class exercicio1 {

    static abstract class ContaBancaria {
        String titular;
        double saldo;

        ContaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        abstract void sacar(double valor);
        abstract void depositar(double valor);

        void exibirInfo() {
            System.out.println("Titular: " + titular);
            System.out.println("Saldo: R$ " + saldo);
        }
    }

    static class ContaCorrente extends ContaBancaria {

        ContaCorrente(String titular, double saldo) {
            super(titular, saldo);
        }

        @Override
        void sacar(double valor) {
            if (valor <= 0) {
                System.out.println("Valor de saque inválido!");
            } else if (valor + 1.00 <= saldo) {
                saldo -= valor + 1.00;
                System.out.println("Saque realizado: R$ " + valor);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }

        @Override
        void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado: R$ " + valor);
            } else {
                System.out.println("Valor de depósito inválido!");
            }
        }
    }

    static class ContaPoupanca extends ContaBancaria {

        ContaPoupanca(String titular, double saldo) {
            super(titular, saldo);
        }

        @Override
        void sacar(double valor) {
            if (valor <= 0) {
                System.out.println("Valor de saque inválido!");
            } else if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado: R$ " + valor);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }

        @Override
        void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado: R$ " + valor);
            } else {
                System.out.println("Valor de depósito inválido!");
            }
        }
    }

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("Joao", 1000);
        ContaPoupanca conta2 = new ContaPoupanca("Maria", 500);

        System.out.println("Conta Corrente:");
        conta1.exibirInfo();

        conta1.depositar(200);
        conta1.sacar(300);
        conta1.sacar(1000);
        conta1.sacar(-50);

        System.out.println("\nConta Poupança:");
        conta2.exibirInfo();

        conta2.depositar(100);
        conta2.sacar(200);
        conta2.sacar(1000);
        conta2.depositar(-20);

        System.out.println("\nSaldos finais:");

        conta1.exibirInfo();
        conta2.exibirInfo();

    }
}