package aps;
import java.util.Scanner;
public class Questao11 {
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);

	         System.out.print("Digite o número total de mercadorias em estoque: ");
	         int numeroTotalMercadorias = sc.nextInt();

	         if (numeroTotalMercadorias <= 0) {
	             System.out.println("O número total de mercadorias deve ser maior que zero.");
	             sc.close();
	             return;
	         }

	         double somaValores = 0;

	         for (int i = 1; i <= numeroTotalMercadorias; i++) {
	             System.out.print("Digite o valor da mercadoria " + i + ": ");
	             double valorMercadoria = sc.nextDouble();

	             if (valorMercadoria < 0) {
	                 System.out.println("O valor da mercadoria não pode ser negativo.");
	                 sc.close();
	                 return;
	             }

	             somaValores += valorMercadoria;
	         }

	         double valorTotalEstoque = somaValores;
	         double mediaValorMercadorias = somaValores / numeroTotalMercadorias;

	         System.out.println("Valor total em estoque: " + valorTotalEstoque);
	         System.out.println("Média de valor das mercadorias: " + mediaValorMercadorias);

	         sc.close();
	     }
	 }

