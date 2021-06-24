public class TestaEscopo09 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 26;
        int quantidadePessoas = 3;
        boolean acompanhado;

        if (quantidadePessoas >= 2) acompanhado = true;
        else acompanhado = false;
        System.out.println("valor de acompanhado: " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vinde");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}