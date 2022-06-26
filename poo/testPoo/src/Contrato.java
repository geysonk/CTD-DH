import java.time.LocalDate;
import java.util.Date;

public abstract class Contrato{
    private int duracaoContrato;
    private String dataInicial;
    Funcionario funcionario;

    Cargo cargo;

    public Contrato(int duracaoContrato, String dataInicial, Funcionario funcionario, Cargo cargo) {
        this.duracaoContrato = duracaoContrato;
        this.dataInicial = dataInicial;
        this.funcionario = funcionario;
        this.cargo = cargo;
    }

    public int getduracaoContrato() {
        return duracaoContrato;
    }

    public String getdataInicial() {
        return dataInicial;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Funcionario getfuncionario() {
        return funcionario;
    }
}