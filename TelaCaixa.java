package caixa;

import java.util.Scanner;

public class TelaCaixa {
	private int op;

	public int menu() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1 - Saldo");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("0 - Sair");
		System.out.print("Opção: ");
		Scanner scanner = new Scanner(System.in);
		op = scanner.nextInt();
		return op;
	}

	public static void mostraMsg(String msg) {
		System.out.println(msg);
	}

	public float sacar() {
		System.out.print("Insira o valor a sacar: ");
		Scanner scanner = new Scanner(System.in);
		float quantia = scanner.nextFloat();
		return quantia;
	}

	public float depositar() {
		System.out.print("Insira o valor a depositar: ");
		Scanner scanner = new Scanner(System.in);
		float quantia = scanner.nextFloat();
		return quantia;
	}
}