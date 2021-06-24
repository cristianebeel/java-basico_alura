public class ProgramaComMultiplos18 {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 3 entre 0 e 100");
        for(int numero = 1; numero <= 100; numero++){
            if(numero % 3 == 0) System.out.println(numero);
        }
    }
}
