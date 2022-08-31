package Fundamentos_java;

import java.util.Scanner;

public class DadosFormatados {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite sua nota: ");
		float nota = teclado.nextFloat();
		
		
		if (nota>0 || nota <=4.9) {
			System.out.format("O Aluno %s obteve nota %.2f está Reprovado.\n",nome ,nota );
		}else if (nota <=6.9) {
			System.out.format("O Aluno %s obteve nota %2.f está de Recuperação.\n",nome , nota);
		}else {
			System.out.format("O Aluno %s obteve nota %2.f está Aprovado. \n",nome ,nota);
		}
	}

}
