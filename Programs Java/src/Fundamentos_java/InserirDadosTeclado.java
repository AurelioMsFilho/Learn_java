package Fundamentos_java;

import java.util.Scanner;

public class InserirDadosTeclado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome Completo: ");
		String nomeCompleto = scan.nextLine();
		nomeCompleto = nomeCompleto.toUpperCase();
		System.out.println(nomeCompleto);
	}

}
