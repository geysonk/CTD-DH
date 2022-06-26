public class Main {

    public static void main(String[] args) {

        Funcionario yasminkhalaf = new Funcionario("Yasmin", "Khalaf", 33, "476890263", true);
        PorHora Contrato1 = new PorHora(12, "2022-07-26", yasminkhalaf, 40, 23.5);
        PorHora Contrato2 = new PorHora(8, "2022-08-20", yasminkhalaf, 30, 27.5);

        System.out.println(Contrato1.compareTo(Contrato2));
        System.out.println(Contrato1.apto(yasminkhalaf));
    }
}