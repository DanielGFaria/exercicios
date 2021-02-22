package processoSeletivoTinnova;

public class Exercicio1 {
	
	
	
	public static void main(String args[]) {
		
		Double totalEleitores = 1000.0;
		Double validos = 800.0;
		Double votosBrancos =150.0;
		Double nulos = 50.0;
		
		Double percentualVotosValidos = calcularPercentualVotos(totalEleitores, validos);
		System.out.print("Percentual de Votos Validos: ");
		System.out.println(percentualVotosValidos);
		
		Double percentualVotosBrancos = calcularPercentualVotos(totalEleitores, votosBrancos);
		System.out.print("Percentual de Votos Brancos: ");
		System.out.println(percentualVotosBrancos);
		
		Double percentualVotosNulos = calcularPercentualVotos(totalEleitores, nulos);
		System.out.print("Percentual de Votos Nulos: ");
		System.out.println(percentualVotosNulos);
		
	}
	
	public static Double calcularPercentualVotos(Double totalEleitores, Double calcular) {
		double percentualVotos;
		
		percentualVotos = (calcular  / totalEleitores) * 100;
		
		return percentualVotos;
	}
	
	
	
	
	
}
