package lista3;

public class exercicio7 {
	

    static class ContaBancaria {
        String titular;
        double saldo;

        ContaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
            }
        }

        void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }

        void exibirInfo() {
            System.out.println("Titular: " + titular);
            System.out.println("Saldo: R$ " + saldo);
        }
    }

    static class ContaEspecial extends ContaBancaria {
        double limite;

        ContaEspecial(String titular, double saldo, double limite) {
            super(titular, saldo);
            this.limite = limite;
        }

        @Override
        void sacar(double valor) {
            if (valor > 0 && valor <= saldo + limite) {
                saldo -= valor;
            } else {
                System.out.println("Limite insuficiente!");
            }
        }

        @Override
        void exibirInfo() {
            super.exibirInfo();
            System.out.println("Limite: R$ " + limite);
        }
    }

    static class ContaPoupanca extends ContaBancaria {
        double taxaRendimento;

        ContaPoupanca(String titular, double saldo, double taxaRendimento) {
            super(titular, saldo);
            this.taxaRendimento = taxaRendimento;
        }

        void calcularRendimento() {
            saldo += saldo * taxaRendimento / 100;
        }

        @Override
        void exibirInfo() {
            super.exibirInfo();
            System.out.println("Rendimento: " + taxaRendimento + "%");
        }
    }

    static class Produto {
        String nome;
        double preco;

        Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Preço: R$ " + preco;
        }
    }

    static class Livro extends Produto {
        String autor;

        Livro(String nome, double preco, String autor) {
            super(nome, preco);
            this.autor = autor;
        }

        @Override
        public String toString() {
            return super.toString() + ", Autor: " + autor;
        }
    }

    static class CD extends Produto {
        int numeroFaixas;

        CD(String nome, double preco, int numeroFaixas) {
            super(nome, preco);
            this.numeroFaixas = numeroFaixas;
        }

        @Override
        public String toString() {
            return super.toString() + ", Número de faixas: " + numeroFaixas;
        }
    }

    static class DVD extends Produto {
        int duracao;

        DVD(String nome, double preco, int duracao) {
            super(nome, preco);
            this.duracao = duracao;
        }

        @Override
        public String toString() {
            return super.toString() + ", Duração: " + duracao + " minutos";
        }
    }

    static class Loja {

        void exibirProdutos(Produto[] produtos) {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public static void main(String[] args) {

        ContaEspecial conta1 = new ContaEspecial("Joao", 1000, 500);
        ContaPoupanca conta2 = new ContaPoupanca("Maria", 2000, 5);

        conta1.sacar(1200);
        conta2.calcularRendimento();

        conta1.exibirInfo();
        conta2.exibirInfo();

        System.out.println();

        Produto[] produtos = new Produto[5];

        produtos[0] = new Livro("Dom Casmurro", 35.90, "Machado de Assis");
        produtos[1] = new Livro("Harry Potter", 59.90, "J.K. Rowling");
        produtos[2] = new CD("Thriller", 29.90, 9);
        produtos[3] = new CD("The Eminem Show", 39.90, 20);
        produtos[4] = new DVD("Vingadores", 49.90, 143);

        Loja loja = new Loja();
        loja.exibirProdutos(produtos);

    }
}