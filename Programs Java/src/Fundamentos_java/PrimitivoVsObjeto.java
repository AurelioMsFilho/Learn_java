package Fundamentos_java;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
	
	String a = new String("Texto");
	a.toUpperCase();
	
	
	// Wrappers são a versão objeto dos tipos primitivos

	int num = 123;
	System.out.println(num);
}
}