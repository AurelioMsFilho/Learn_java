package Fundamentos_java;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		
		int num = leia.nextInt();
		if(num %2 ==0) {
			System.out.println( num + "É par");
		}else {
			System.out.println(num + " É impar");
		}
	}

}
