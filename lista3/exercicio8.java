package lista3;

public class exercicio8 {

    static class Produto {
        String nome;
        double preco;
        String codigoBarras;

        Produto(String nome, double preco, String codigoBarras) {
            this.nome = nome;
            this.preco = preco;
            this.codigoBarras = codigoBarras;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Preço: R$ " + preco
                    + ", Código de barras: " + codigoBarras;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || !(obj instanceof Produto)) {
                return false;
            }

            Produto produto = (Produto) obj;
            return codigoBarras.equals(produto.codigoBarras);
        }

        @Override
        public int hashCode() {
            return codigoBarras.hashCode();
        }
    }

    static class Livro extends Produto {
        String autor;

        Livro(String nome, double preco, String codigoBarras, String autor) {
            super(nome, preco, codigoBarras);
            this.autor = autor;
        }

        @Override
        public String toString() {
            return super.toString() + ", Autor: " + autor;
        }
    }

    static class CD extends Produto {
        int numeroFaixas;

        CD(String nome, double preco, String codigoBarras, int numeroFaixas) {
            super(nome, preco, codigoBarras);
            this.numeroFaixas = numeroFaixas;
        }

        @Override
        public String toString() {
            return super.toString() + ", Número de faixas: " + numeroFaixas;
        }
    }

    static class DVD extends Produto {
        int duracao;

        DVD(String nome, double preco, String codigoBarras, int duracao) {
            super(nome, preco, codigoBarras);
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

        void buscarProduto(Produto[] produtos, Produto procurado) {
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i].equals(procurado)) {
                    System.out.println("Produto encontrado na posição: " + i);
                    return;
                }
            }

            System.out.println("Produto não encontrado!");
        }

        public static void main(String[] args) {

            Produto[] produtos = new Produto[5];

            produtos[0] = new Livro("Dom Casmurro", 35.90, "001", "Machado de Assis");
            produtos[1] = new Livro("Harry Potter", 59.90, "002", "J.K. Rowling");
            produtos[2] = new CD("Thriller", 29.90, "003", 9);
            produtos[3] = new CD("The Eminem Show", 39.90, "004", 20);
            produtos[4] = new DVD("Vingadores", 49.90, "005", 143);

            Loja loja = new Loja();

            loja.exibirProdutos(produtos);

            Livro livro1 = new Livro("Dom Casmurro", 35.90, "001", "Machado de Assis");
            Livro livro2 = new Livro("Dom Casmurro", 35.90, "999", "Machado de Assis");

            System.out.println("\nBusca com código igual:");
            loja.buscarProduto(produtos, livro1);

            System.out.println("\nBusca com código diferente:");
            loja.buscarProduto(produtos, livro2);
        }
    }

    public static void main(String[] args) {
        Loja.main(args);
    }
}