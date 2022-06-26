public class PorHora extends Contrato {
    private int hora;
    private double precoHora;

    public PorHora(int duracaoContrato, String dataInicial, Funcionario funcionario, int hora, double precoHora) {
        super(duracaoContrato, dataInicial, funcionario);
        this.hora = hora;
        this.precoHora = precoHora;
    }

    public int gethora() {
        return hora;
    }

    public void sethora(int hora) {
        this.hora = hora;
    }

    public double getprecoHora() {
        return precoHora;
    }

    public void setprecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public String toString() {
        return "PorHora{" +
                "hora=" + hora +
                ", precoHora=" + precoHora +
                '}';
    }

}
