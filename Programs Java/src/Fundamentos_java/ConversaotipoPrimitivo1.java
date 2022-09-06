package Fundamentos_java;

public class ConversaotipoPrimitivo1 {
	public static void main(String[] args) {
		double a =1 ;
		float b  = (float) 1.12345678888; // Conversão explícita (Cast)
		System.out.println(a);
		System.out.println(b);
		
		int c = 34;
		byte d = (byte) c; //Conversão explicita (Cast)
		System.out.println(d);
		
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);// haverá perda de informação ( onumero será truncado)
		
	}


}
