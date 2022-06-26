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

    public boolean getregistroMT() {
        return registroMT;
    }

    public String getprimeiroNome() {
        return primeiroNome;
    }

    public String getsobrenome() {
        return sobrenome;
    }

    public int getidade() {
        return idade;
    }

    public String getRg() {
        return rg;
    }

    @Override
    public String toString() {
        return "Nome: " + getprimeiroNome() + '\n' +
               "Sobrenome: " + getsobrenome() + '\n' +
               "Idade: " + getidade() + '\n' +
               "RG: " + getRg() + '\n' +
               "Registo no MT: " + getregistroMT() + "\n";
    }
}
