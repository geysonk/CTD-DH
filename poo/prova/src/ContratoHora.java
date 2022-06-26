import java.util.Date;

public class ContratoHora extends Contrato implements Comparable<ContratoHora>{

    private Integer horaMes;
    private Double valorHora;

    public ContratoHora(Integer numMeses, Date dataInicio, Boolean registro, Integer horaMes, Double valorHora) {

        super(numMeses, dataInicio, registro);
        this.horaMes = horaMes;
        this.valorHora = valorHora;
    }


    @Override
    public int compareTo(ContratoHora o) {
        if (this.horaMes > o.horaMes) return 1;
        if (this.horaMes < o.horaMes) return -1;
        return 0;
    }


    @Override
    public String toString() {
        return "ContratoHora{" +
                "horaMes=" + horaMes +
                ", valorHora=" + valorHora +
                '}';
    }
}

