package processoSeletivoTinnova;

public class Exercicio4 {
	public static void main(String args[]) {
	
	
	for(String s: args) {
		System.out.println("Soma dos multiplos de 3 ou 5 menores que " + s);
//		System.out.print(s +"! = ");
		Double valor = Double.parseDouble(s);
		System.out.println(somaMultiplosDe3ou5(valor));
	}
		
	}
	
	private static double somaMultiplosDe3ou5(double valor) {
		
		double resultado;
		if(valor == 0.0) {
			resultado = 0;
		}else {
			valor--;
			double soma = 0.0;
			
			while(valor > 1) {
				if(valor % 3 == 0 || valor % 5 == 0) {
					soma = soma + valor;
				}
				valor--;
			}
			resultado = soma;
		}
		
		return resultado;
	}
}
