package lista4;


public class exercicio5 {

    enum StatusPedido {
        AGUARDANDO_PAGAMENTO,
        PAGO,
        ENVIADO,
        ENTREGUE,
        CANCELADO
    }

    static class Pedido {
        int numero;
        double valor;
        StatusPedido status;

        Pedido(int numero, double valor) {
            this.numero = numero;
            this.valor = valor;
            this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
        }

        void alterarStatus(StatusPedido novoStatus) {
            status = novoStatus;
        }

        void exibirInfo() {
            System.out.println("Pedido: " + numero);
            System.out.println("Valor: R$ " + valor);
            System.out.println("Status: " + status);

            switch (status) {
                case AGUARDANDO_PAGAMENTO:
                    System.out.println("Aguardando pagamento do pedido.");
                    break;

                case PAGO:
                    System.out.println("Pagamento realizado com sucesso.");
                    break;

                case ENVIADO:
                    System.out.println("Pedido enviado para entrega.");
                    break;

                case ENTREGUE:
                    System.out.println("Pedido entregue com sucesso.");
                    break;

                case CANCELADO:
                    System.out.println("Pedido cancelado.");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(1, 150.00);
        Pedido pedido2 = new Pedido(2, 250.00);
        Pedido pedido3 = new Pedido(3, 350.00);

        pedido2.alterarStatus(StatusPedido.PAGO);
        pedido3.alterarStatus(StatusPedido.ENTREGUE);

        pedido1.exibirInfo();
        System.out.println();

        pedido2.exibirInfo();
        System.out.println();

        pedido3.exibirInfo();

        System.out.println("\nAlterando status do pedido 1:");
        pedido1.alterarStatus(StatusPedido.ENVIADO);
        pedido1.exibirInfo();

        System.out.println("\nCancelando pedido 2:");
        pedido2.alterarStatus(StatusPedido.CANCELADO);
        pedido2.exibirInfo();

    }
}