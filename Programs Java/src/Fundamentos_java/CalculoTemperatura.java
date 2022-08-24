package Fundamentos_java;

public class CalculoTemperatura {
	public static void main(String[] args) {

		//(°F - 32) * 5/9 = °C
		final int AJUSTE = 32;
		final double CONSTANTE = 5.0/9;
		double  faren = 86;
		double celsius = (faren - AJUSTE) * CONSTANTE;
		System.out.println(celsius + "° Celsius");
		
		faren = 0;
		celsius = (faren - AJUSTE)* CONSTANTE;
		System.out.println("O resultado é: "+ celsius+"° c.");
	}

}
