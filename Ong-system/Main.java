public class Main {

    public static void main(String[] args) {

        System.out.println("SISTEMA DE GESTÃO-ONG");
        
        System.out.println();

        Voluntario voluntario = new Voluntario();
        voluntario.setNome("Maria");
        voluntario.setCpf("256.456.989-60");
        voluntario.setDiasAtuacao(120);
        voluntario.setSetor("Aulas");

        Doador doador = new Doador();
        doador.setNome("Carlos");
        doador.setCpf("123.654.321-06");
        doador.setDiasAtuacao(365);
        doador.setValorDoadoMensal(250.00);

        doador.setDiasAtuacao(-10);
        System.out.println();

        ProjetoSocial projeto = new ProjetoSocial();
        projeto.setNomeDoProjeto("Esperança");
        projeto.setMetaImpacto(200);
        projeto.setLider(voluntario);

        voluntario.exibirResumo();
        System.out.println();
        doador.exibirResumo();
        System.out.println();

        projeto.iniciarProjeto();
    }
}
