package aps;

	public class Questao13 {

		    public static void main(String[] args) {
		        // Tamanho do vetor
		        int tamanho = 50;

		        // Criar um vetor de 50 elementos
		        int[] vetor = new int[tamanho];

		        // Preencher o vetor de acordo com o dobro do índice
		        for (int i = 0; i < tamanho; i++) {
		            vetor[i] = 2 * i;
		        }

		        // Exibir o vetor
		        System.out.println("Vetor de elementos sendo o dobro do índice:");
		        for (int i = 0; i < tamanho; i++) {
		            System.out.print(vetor[i] + " ");
		        }
		    }
		}