package Fundamentos_java;

import java.util.Scanner;

public class Calculo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int a = scan.nextInt();
		
		System.out.println("digite um segundo valor: ");
		int b = scan.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int c = scan.nextInt();
		
		int soma = a+b+c;
		double media = soma/3;
		
		System.out.println("A soma dos valores digitados é: "+ soma + " e a media é: "+ media);
		
		
		
	}

}
