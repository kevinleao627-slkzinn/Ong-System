public class Doador extends MembroOng {

    private double valorDoadoMensal;

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valorDoadoMensal) {
        this.valorDoadoMensal = valorDoadoMensal;
    }

    @Override
    public void exibirResumo() {
        System.out.println("/---- Doador ------/");
        System.out.println("Nome:" + getNome());
        System.out.println("CPF:" + getCpf());
        System.out.println("Dias de Atuação:" + getDiasAtuacao());
        System.out.printf("Status: Doador Ativo / Contribuição Mensal:R$ %.2f%n", valorDoadoMensal);
    }
}
