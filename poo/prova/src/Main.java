public class Main {
    public static void main(String[] args) {

    Funcionario funcionario = new Funcionario("João", "Silva", 123456789, 30);
    ContratoHora contratoHora = new ContratoHora(12, null, true, 10, 100.0);
    System.out.println(contratoHora);
    System.out.println(funcionario);
    }
}
