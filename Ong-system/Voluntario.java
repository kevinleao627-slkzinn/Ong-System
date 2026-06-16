public class Voluntario extends MembroOng {

    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibirResumo() {
        System.out.println("/---- Voluntário -----/");
        System.out.println("Nome:" + getNome());
        System.out.println("CPF:" + getCpf());
        System.out.println("Dias de Atuação:" + getDiasAtuacao());
        System.out.println("Setor:" + setor);
    }
}