import java.util.Date;

public class PorMes extends Contrato {
    private double salarioMes;
    private int totalHora;
    private String posicao;

    public PorMes(int duracaoContrato, String dataInicial, Funcionario funcionario, Cargo cargo, double salarioMes, int totalHora, String posicao) {

        super(duracaoContrato, dataInicial, funcionario, cargo);

        this.salarioMes = salarioMes;
        this.totalHora = totalHora;
        this.posicao = posicao;
    }
    public double getSalarioMes() {
        return salarioMes;
    }

    public int getTotalHora() {
        return totalHora;
    }

    public String getPosicao() {
        return posicao;
    }

    @Override
    public Funcionario getfuncionario() {
        return super.getfuncionario();
    }

    @Override
    public String toString() {
        return getfuncionario() + "\n" +
               getCargo() + "\n" +
               "Salario mes: " + getSalarioMes() + "\n" +
               "Total Horas mes: " + getTotalHora() + "\n" +
               "Posicao: " + getPosicao();
    }

}