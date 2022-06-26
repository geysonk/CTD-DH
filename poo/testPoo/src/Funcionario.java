public class Funcionario {
    private String primeiroNome;
    private String sobrenome;
    private int idade;
    private String rg;
    private boolean registroMT;

    public Funcionario(String primeiroNome, String sobrenome, int idade, String rg, boolean registroMT) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.rg = rg;
        this.registroMT = registroMT;
    }

    public boolean isRegistroMT() {
        return registroMT;
    }

    public void setregistroMT(boolean registroMT) {
        this.registroMT = registroMT;
    }

    public String getprimeiroNome() {
        return primeiroNome;
    }

    public void setprimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getsobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "funcionario{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", rg='" + rg + '\'' +
                ", registroMT=" + registroMT +
                '}';
    }
}
