package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		int agencia;
		String conta = "220304-X ";
		String nomeCliente = " ";
		double saldo = 1.000;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor digite o seu Nome completo:");

		nomeCliente = scanner.nextLine();

		System.out.println("Olá, " + nomeCliente + " Seja Bem-vindo !!! ");

		System.out.println("Por favor, digite o número da Agência!");

		agencia = scanner.nextInt();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
				+ agencia + ", conta " + conta + " e seu saldo é " + saldo + ". Já está disponível para saque.");

	}

}