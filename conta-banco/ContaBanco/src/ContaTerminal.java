import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Numero da Conta ");
        numero = teclado.nextInt();
        System.out.println("Digite o numero da Agencia ");
        agencia = teclado.next();
        System.out.println("Digite o numero da Nome do Cliente ");
        nomeCliente = teclado.next();
        System.out.println("Digite o numero da Saldo ");
        saldo = teclado.nextFloat();
        teclado.close();
        // Opcional: Exibir os dados lidos para confirmação
        System.out.println("\nDados da Conta:");
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.printf("Saldo: R$%.2f", saldo);

        System.out.println();

    }
}
