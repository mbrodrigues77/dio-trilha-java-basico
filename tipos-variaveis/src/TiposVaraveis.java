public class TiposVaraveis {
    public static void main(String[] args) throws Exception {
        /*Estudar Variáveis:
         * - Tipos primitivos
         * - Classe String, que representa texto na aplicação
         */

         String meuNome = "Marcelo Borges";

         double salarioMinimo  = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

		System.out.print(numero);

        final double VALOR_DE_PI = 3.14;
		
		VALOR_DE_PI=3.15;
    }
}
