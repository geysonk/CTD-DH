public class PorMes extends Contrato {
    private double salarioMes;
    private int totalHora;
    private String posicao;

    public PorMes(int duracaoContrato, String dataInicial, Funcionario funcionario, double salarioMes, int totalHora, String posicao) {
        super(duracaoContrato, dataInicial, funcionario);
        this.salarioMes = salarioMes;
        this.totalHora = totalHora;
        this.posicao = posicao;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }

    public int getTotalHora() {
        return totalHora;
    }

    public void setTotalHora(int totalHora) {
        this.totalHora = totalHora;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }


}