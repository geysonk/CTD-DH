import java.time.LocalDate;

public abstract class Contrato implements Comparable<Contrato> {
    private int duracaoContrato;
    private LocalDate dataInicial;
    Funcionario funcionario;

    public Contrato(int duracaoContrato, String dataInicial, Funcionario funcionario) {
        this.duracaoContrato = duracaoContrato;
        this.dataInicial = LocalDate.parse(dataInicial);
        this.funcionario = funcionario;
    }

    public int getduracaoContrato() {
        return duracaoContrato;
    }

    public void setduracaoContrato(int duracaoContrato) {
        this.duracaoContrato = duracaoContrato;
    }

    public LocalDate getdataInicial() {
        return dataInicial;
    }

    public void setdataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Funcionario getfuncionario() {
        return funcionario;
    }

    public void setfuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public int compareTo(Contrato o) {
        if(this.getduracaoContrato() > o.getduracaoContrato()) return 1;
        if(this.getduracaoContrato() < o.getduracaoContrato()) return -1;
        return 0;
    }

    public boolean apto(Funcionario getfuncionario) {
        if(this.getfuncionario().isRegistroMT() == true) {
            return true;
        } else {
            return false;
        }
    }
}