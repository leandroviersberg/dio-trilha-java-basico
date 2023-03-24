package EstudosDioJavaBasico;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        // criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();

        // System.out.println("Digite seu cpf ");
        // long cpf = scanner.nextLong();

        System.out.println("Tenho " + idade + " anos ");
        // System.out.println("Meu cpf é " + cpf);
        System.out.println("Ola, " + nome + " " + sobrenome + " Seu usuário foi cadastrado com sucesso");

    }
}