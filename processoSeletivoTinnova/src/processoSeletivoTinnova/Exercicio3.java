package processoSeletivoTinnova;

public class Exercicio3 {
	public static void main(String args[]) {
	
	System.out.println("Calculadora de Fatorial");
	for(String s: args) {
		System.out.print(s +"! = ");
		Double valor = Double.parseDouble(s);
		System.out.println(calcularFatorial(valor));
	}
		
	}
	
	private static double calcularFatorial(double valor) {
		
		double resultado;
		if(valor == 0.0) {
			resultado = 1;
		}else {
			double valorTemp = valor;
			
			while(valor > 1) {
				valorTemp = valorTemp * (valor-1);
				valor--;
			}
			resultado = valorTemp;
		}
		
		return resultado;
	}
}
