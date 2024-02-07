import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para os nossos usuários
        // Obter pelo scanner os valores digitados no terminal
        System.out.print("Por favor digite seu Nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Digite o número da sua Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();


        // Exibir a mensagem criada.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo: R$ " + saldo + " já está disponível para saque.");
    }
}
