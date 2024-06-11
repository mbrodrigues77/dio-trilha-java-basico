import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    // TODO:
    //Conhecer e importar a classe Scaner]
    //Exibir as mensagens para o nosso usuário
    //Obter pelo Sacner os valores digitados no terminal
    //Exibir a mensagem da conta criada
    
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                
        System.out.println("Por favor, digite o numero de sua Agência e tecle 'ENTER' em seguida:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero de sua Conta e tecle 'ENTER' em seguida:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu nome completo e tecle 'ENTER' em seguida:");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu Saldo em conta e tecle 'ENTER' em seguida:");
        double saldo = scanner.nextDouble();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é a " + agencia + ", sua conta a " + conta + " e o seu saldo é de R$" + saldo+ " já disponível para saque.");
   
    }
}
