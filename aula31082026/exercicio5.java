package aula31082026;

public class exercicio5 {

    public static void main(String[] args) {

        class Produto {

            int id;
            String nome;
            double preco;

            Produto(int id, String nome, double preco) {
                this.id = id;
                this.nome = nome;
                this.preco = preco;
            }

            void aplicarDesconto(double porcentagem) {
                preco = preco - (preco * porcentagem / 100);
            }

            void exibirDetalhes() {
                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.printf("Preço: R$ %.2f%n", preco);
            }
        }

        Produto produto1 = new Produto(1, "Notebook", 3500.00);
        Produto produto2 = new Produto(2, "Celular", 2000.00);

        produto1.aplicarDesconto(10);
        produto2.aplicarDesconto(15);

        produto1.exibirDetalhes();
        System.out.println();
        produto2.exibirDetalhes();
    }
}
