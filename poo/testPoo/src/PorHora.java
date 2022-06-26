import java.util.Date;

public class PorHora extends Contrato implements Comparable<PorHora> {
    private Integer horaMes;
    private Double precoHora;

    public PorHora(int duracaoContrato, String dataInicial, Funcionario funcionario,Cargo cargo, int horaMes, double precoHora) {
        super(duracaoContrato, dataInicial, funcionario, cargo);
        this.horaMes = horaMes;
        this.precoHora = precoHora;
    }


    public int gethoraMes() {
        return horaMes;
    }

    public double getprecoHora() {
        return precoHora;
    }


    @Override
    public String toString() {

        return getfuncionario().toString() + "\n" +
                getCargo() + "\n" +
                "Horas por mes: " + this.gethoraMes() + "\n" +
                "Preco por Hora: " + this.getprecoHora() + "\n" +
                "Duracao do Contrato: " + this.getduracaoContrato() + "\n" +
                "Data Inicial: " + this.getdataInicial() + "\n";
    }

    @Override
    public int compareTo(PorHora o) {
        if(this.getprecoHora() > o.getprecoHora()) return 1;
        if(this.getprecoHora() < o.getprecoHora()) return -1;
        return 0;
    }
}
