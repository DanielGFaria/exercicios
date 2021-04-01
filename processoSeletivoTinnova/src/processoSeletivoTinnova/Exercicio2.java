package processoSeletivoTinnova;

public class Exercicio2 {
	public static void main(String args[]) {
		int[] v = new int[args.length];
		int x = 0;
		for(String s: args) {
			int valor = Integer.parseInt(s);
			v[x] = valor;
			x++;
		}

		System.out.print("Lista Antes da Ordenação: ");
		for(int i=0;  i < v.length; i++) {
			System.out.print(v[i]);
		}
		System.out.println("");

		v = ordenarBubbleSort(v);
		
		System.out.print("Lista Depois da Ordenação: ");
		for(int i=0;  i < v.length; i++) {
			System.out.print(v[i]);
		}
	}

	private static int[] ordenarBubbleSort(int[] v) {
	
	int camposParaVerificacao = v.length-1;
	for(int j=0;  j < (v.length-1); j++) {
		for(int i=0;  i < camposParaVerificacao; i++) {
			int valorAtual = v[i];
			int valorPosterior = v[i+1];
			
			if(valorAtual > valorPosterior) {
				v[i] = valorPosterior;
				v[i+1] = valorAtual;
			}
		}
		camposParaVerificacao--;
	}
	
	return v;
	}
}
