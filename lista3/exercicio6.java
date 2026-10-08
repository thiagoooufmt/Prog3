package lista3;

public class exercicio6 {

    static class ContaBancaria {
        private int numero;

        ContaBancaria(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Conta Bancária: " + numero;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            ContaBancaria conta = (ContaBancaria) obj;
            return numero == conta.numero;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(numero);
        }
    }

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(12345);
        ContaBancaria conta2 = new ContaBancaria(12345);

        System.out.println("Conta 1: " + conta1);
        System.out.println("Conta 2: " + conta2);

        System.out.println("As contas são iguais? " + conta1.equals(conta2));

    }
}