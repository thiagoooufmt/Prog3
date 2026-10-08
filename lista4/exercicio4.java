package lista4;

public class exercicio4 {

    interface Pagamento {
        void processarPagamento(double valor);
        void cancelarPagamento();
    }

    static class PagamentoCartao implements Pagamento {

        @Override
        public void processarPagamento(double valor) {
            System.out.println("Pagamento de R$ " + valor + " realizado com Cartão.");
        }

        @Override
        public void cancelarPagamento() {
            System.out.println("Pagamento com Cartão cancelado.");
        }
    }

    static class PagamentoPix implements Pagamento {

        @Override
        public void processarPagamento(double valor) {
            System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
        }

        @Override
        public void cancelarPagamento() {
            System.out.println("Pagamento via Pix cancelado.");
        }
    }

    static class PagamentoBoleto implements Pagamento {

        @Override
        public void processarPagamento(double valor) {
            System.out.println("Boleto de R$ " + valor + " gerado para pagamento.");
        }

        @Override
        public void cancelarPagamento() {
            System.out.println("Pagamento por Boleto cancelado.");
        }
    }

    public static void main(String[] args) {

        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new PagamentoCartao();
        pagamentos[1] = new PagamentoPix();
        pagamentos[2] = new PagamentoBoleto();

        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento(150.00);
            pagamento.cancelarPagamento();
            System.out.println();
        }

    }
}