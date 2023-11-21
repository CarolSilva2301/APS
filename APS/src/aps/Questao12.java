package aps;
import java.util.Scanner;
public class Questao12 {
	      public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);

	         double somaValores = 0;
	         int numeroTotalMercadorias = 0;
	         char continuar = 0;

	         do {
	             System.out.print("Digite o valor da mercadoria: ");
	             double valorMercadoria = sc.nextDouble();

	             if (valorMercadoria < 0) {
	                 System.out.println("O valor da mercadoria não pode ser negativo. Tente novamente.");
	                 continue;
	             }

	             somaValores += valorMercadoria;
	             numeroTotalMercadorias++;

	             System.out.print("Mais mercadorias (S/N)? ");
	             continuar = sc.next().charAt(0);

	         } while (continuar == 'S' || continuar == 's');

	         if (numeroTotalMercadorias == 0) {
	             System.out.println("Nenhuma mercadoria foi inserida.");
	         } else {
	             double valorTotalEstoque = somaValores;
	             double mediaValorMercadorias = somaValores / numeroTotalMercadorias;

	             System.out.println("Valor total em estoque: " + valorTotalEstoque);
	             System.out.println("Média de valor das mercadorias: " + mediaValorMercadorias);
	         }

	         sc.close();
	     }
	 }
