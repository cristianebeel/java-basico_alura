public class TesteIR10 {
    public static void main(String[] args) {
        double salario = 3751.01, aliquota = 0, deducao = 0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            aliquota = 7.5;
            deducao = 142;
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            aliquota = 15;
            deducao = 350;
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            aliquota = 22.5;
            deducao = 636;
        }

        System.out.println("Salário: " + salario + "\nA sua aliquota é de: " + aliquota + "%" + "\nVocê pode deduzir até: " + deducao);;
    }
}