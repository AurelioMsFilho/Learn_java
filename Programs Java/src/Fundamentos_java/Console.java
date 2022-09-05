package Fundamentos_java;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia!\n\n");
		System.out.println("Bom");
		System.out.println("Dia");
		
		System.out.printf("Megasena %d %d %d %d %d %n", 1,2,3,4,5);
		System.out.printf("Salario: %.1f%n", 1234.5678 );
		System.out.printf("Nome: %s%n", "Charllote" );
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Meu nome é %s e tenho %d anos de idade ",nome , idade);
		
		
		entrada.close();
		
		
		
		
	}

}
