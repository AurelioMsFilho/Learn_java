package Fundamentos_java;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Aurélio";
		var idade = 40;
		var sobrenome = "Martins";
		var salario =3200.33;
		
    	System.out.println("Nome: "+ nome + "\nSobrenome: "+ sobrenome+ "\nidade: "+idade+" \nSalario: "+ salario);
//ou 		
		System.out.printf("O Sr. %s %s tem %d anos e ganha R$: %.2f.",nome,sobrenome,idade,salario);
		
		String frase = String.format("\nO Sr. %s %s tem %d anos e ganha R$: %.2f.",nome,sobrenome,idade,salario);
		System.out.println(frase);
		System.out.println("Qualquer coisa".contains("coisa"));
		System.out.println("Qualquer coisa".indexOf("Qual"));
		System.out.println("Qualquer coisa".substring(6));
		System.out.println("Qualquer coisa".substring(6, 10));
		
		
	}

}
