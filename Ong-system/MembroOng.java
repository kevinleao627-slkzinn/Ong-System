public class MembroOng {

    private String nome;
    private String cpf;
    private int diasAtuacao;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getDiasAtuacao() {
        return diasAtuacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDiasAtuacao(int dias) {
        if (dias < 0) {
            System.out.println("Dias de atuação não pode ser negativo.");
            return;
        }
        this.diasAtuacao = dias;
    }

    public void exibirResumo() {
        System.out.println("Nome:" + nome);
        System.out.println("Dias de Atuação:" + diasAtuacao);
    }
}
    
