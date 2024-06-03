import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

    // encurtar a função verbosa de system out println
    public static void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        print("Insira o número da sua conta");
        int numero = scanner.nextInt();

        print("Insira o número sua agência");
        String agencia = scanner.next();

        // Consumir a nova linha pendente
        scanner.nextLine();

        print("Insira seu nome completo");
        String nomeCliente = scanner.nextLine();

        print("Insira seu saldo");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque";

        System.out.println(mensagem);
    }
}
