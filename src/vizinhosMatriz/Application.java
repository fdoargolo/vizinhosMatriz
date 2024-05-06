package vizinhosMatriz;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas que deseja:");
		int linhas = scanner.nextInt();
		System.out.print("Digite a quantidade de colunas que deseja:");
		int colunas = scanner.nextInt();

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		System.out.print("Digite o numero da matriz que deseja encontrar vizinhos: ");
		int numeroPesquisa = scanner.nextInt();

		encontrarVizinhos(matriz, numeroPesquisa);

		scanner.close();
	}

	public static void encontrarVizinhos(int[][] matriz, int numeroPesquisa) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (numeroPesquisa == matriz[i][j]) {

					if (j - 1 >= 0) System.out.println("Número à esquerda: " + matriz[i][j - 1]);
					else System.out.println("Não existe número à esquerda.");
				
					if (i - 1 >= 0) System.out.println("Número acima: " + matriz[i - 1][j]);
					else System.out.println("Não existe número acima.");
					
					if (j + 1 < matriz[i].length) System.out.println("Número à direita: " + matriz[i][j + 1]);
					else System.out.println("Não existe número à direita.");
					
					if (i + 1 < matriz.length) System.out.println("Número abaixo: " + matriz[i + 1][j]);
					else System.out.println("Não existe número abaixo.");
					
					System.out.println();
				}
			}
		}

	}

}
