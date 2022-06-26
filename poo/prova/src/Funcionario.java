import java.util.*;

public class Funcionario {
    private final String nome;
    private final String sobrenome;
    private final Integer rg;
    private final Integer idade;
    private final List<Contrato> contratos = new ArrayList<Contrato>();

    public Funcionario(String nome, String sobrenome, Integer rg, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.idade = idade;
    }

    public void addContrato(Contrato contrato) { contratos.add(contrato); }

    public List<Contrato> getContratos() { return contratos; }

    public List<Contrato> orderContratos() {
        List<Contrato> orderedContratos = new LinkedList<Contrato>();
        for (Contrato contrato: contratos) {
            orderedContratos.add(contrato);
        }
        return orderedContratos;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", rg=" + rg +
                ", idade=" + idade +
                ", contratos=" + contratos +
                '}';
    }
}
