package Fundamentos_java;

//import java.util.Scanner;

public class WrappersEmpacotador {
	public static void main(String[] args) {
		//Scanner entrada = new Scanner(System.in);
		Byte b = 1;
		Short s = 1000;
		//Integer i = Integer.parseInt(entrada.next()); 
		Integer i = 10000;//int
		Long l = 100000L;
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
			
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
		
		
	}

}
