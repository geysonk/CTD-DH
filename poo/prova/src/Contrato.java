import java.util.Date;

public abstract class Contrato {
    private final Integer numMeses;
    private final Date dataInicio;
    private static Boolean registro;

    public Contrato(Integer numMeses, Date dataInicio, Boolean registro) {
        this.numMeses = numMeses;
        this.dataInicio = dataInicio;
        Contrato.registro = registro;
    }

    public Integer getNumMeses() {
        return numMeses;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public static Boolean getRegistro() {
        return registro;
    }
}











