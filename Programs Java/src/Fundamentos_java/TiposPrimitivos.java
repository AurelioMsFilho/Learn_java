package Fundamentos_java;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
	
	// Exemplo Informações de um funcionário
	
	//Tipos numéricos inteiros
	byte anosDeEmpresa = 23;
	short numeroDeVoos = 542;
	int id = 56781;
	long pontosAcumulados = 3_134_845_223L;
	
	// Tipos numéricos com ponto flutuante
	float salario = 11_445.44f;
	double vendasAcumuladas = 2_991_797_103.01;
	
	// Tipo booleanos
	boolean estaDeFerias = false; //true
	char status = 'A'; // Só aceita uma letra ou um Simbolo
	
	//Dias de Empresa
	
	System.out.println("Dias de empresa são: "+ anosDeEmpresa * 365);
	
	//Número de Viagens
	System.out.println("O número de viagens a trabalho foi de: " +numeroDeVoos / 2);
	
	//Pontos por Real
	System.out.println(pontosAcumulados / vendasAcumuladas);
	
	System.out.println("O funcionário de identificação " +id +": ganha -> "+ salario);
	System.out.println( "Férias? "+ estaDeFerias);
	System.out.println("Status: "+ status);
	
	

}
}
