
import java.util.Scanner;

public class UsandoEntradaCast {

    public static void main(String[] args) {
        // entrada
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento");
        int anoNascimento = entrada.nextInt();
        System.out.println("Digite o ano atual");
        int anoAtual = entrada.nextInt();

        System.out.println("Digite o seu peso");
        double peso = entrada.nextDouble();

        System.out.println("Digite a sua altura");
        double altura = entrada.nextDouble();

        // processamento
        int idade = anoAtual - anoNascimento;
        int imc = (int) (peso / (altura * altura));

        // saida
        System.out.println("Idade: " + idade);
        System.out.println("IMC: " + imc);
    }

}
