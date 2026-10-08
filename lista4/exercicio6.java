package lista4;


public class exercicio6 {

    enum NivelAcesso {
        BASICO,
        INTERMEDIARIO,
        ADMIN
    }

    static class Usuario {
        String nome;
        NivelAcesso nivel;

        Usuario(String nome, NivelAcesso nivel) {
            this.nome = nome;
            this.nivel = nivel;
        }

        void verificarPermissao(String recurso) {
            boolean permitido = false;

            switch (nivel) {
                case BASICO:
                    permitido = recurso.equals("CONSULTAR");
                    break;

                case INTERMEDIARIO:
                    permitido = recurso.equals("CONSULTAR")
                            || recurso.equals("EDITAR");
                    break;

                case ADMIN:
                    permitido = recurso.equals("CONSULTAR")
                            || recurso.equals("EDITAR")
                            || recurso.equals("GERENCIAR_USUARIOS");
                    break;
            }

            if (permitido) {
                System.out.println(nome + " tem permissão para " + recurso);
            } else {
                System.out.println(nome + " não tem permissão para " + recurso);
            }
        }

        void exibirInfo() {
            System.out.println("Usuário: " + nome);
            System.out.println("Nível de acesso: " + nivel);
        }
    }

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Joao", NivelAcesso.BASICO);
        Usuario usuario2 = new Usuario("Maria", NivelAcesso.INTERMEDIARIO);
        Usuario usuario3 = new Usuario("Pedro", NivelAcesso.ADMIN);

        Usuario[] usuarios = {usuario1, usuario2, usuario3};

        String[] recursos = {"CONSULTAR", "EDITAR", "GERENCIAR_USUARIOS"};

        for (Usuario usuario : usuarios) {
            usuario.exibirInfo();

            for (String recurso : recursos) {
                usuario.verificarPermissao(recurso);
            }

            System.out.println();
        }
    }
}