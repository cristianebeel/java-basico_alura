public class TestaFatorial19 {
    public static void main(String[] args) {
        int resultadoTotal = 1;
        for(int numero = 1; numero <= 6; numero++){
            resultadoTotal *= numero;
            System.out.println(resultadoTotal);
        }
    }
}