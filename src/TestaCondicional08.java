public class TestaCondicional08 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 26;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("valor de acompanhado: " + acompanhado);

        //if (idade >= 18 || quantidadePessoas >= 2) {
        //if (idade >= 18 && quantidadePessoas >= 2) {
        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vinde");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}