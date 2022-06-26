import java.util.Date;

public class Main {

    public static void main(String[] args) {



        Funcionario nome = new Funcionario("Jorge", "Alberto", 33, "476890000", true);
        Funcionario nome2 = new Funcionario("Alberto", "Jorge", 20, "476890263", false);

        if(nome.getregistroMT()) {
            System.out.println(nome + "e apto para contratacao, funcionario registrado no MT" + "\n");

            PorHora Contrato1 = new PorHora(12, "2022-02-02", nome,Cargo.CHEFE, 12, 100.0);
            PorHora Contrato2 = new PorHora(8, "2022-02-02", nome2,Cargo.FUNCIONARIO, 30, 27.5);

        } else{

            throw new IllegalArgumentException(nome + "nao e apto para contratacao, sem registro no MT" + "\n");
        }

        if(nome2.getregistroMT()) {
            System.out.println(nome2 + "e apto para contratacao, funcionario registrado no MT " + "\n");

            PorHora Contrato1 = new PorHora(12, "2022-02-02", nome,Cargo.CHEFE, 12, 100.0);
            PorHora Contrato2 = new PorHora(8, "2022-02-02", nome2,Cargo.FUNCIONARIO, 30, 27.5);

            System.out.println(Contrato2.compareTo(Contrato1));

        } else{
            throw new IllegalArgumentException(nome2 + "nao e apto para contratacao, sem registro no MT" + "\n");
        }

    }
}