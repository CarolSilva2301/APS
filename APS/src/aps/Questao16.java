package aps;
import java.util.Scanner;
public class Questao16 {
	 public static void main(String[] args) {
	         Scanner scanner = new Scanner(System.in);

	         int a, b;

	         // Solicitar o valor do extremo esquerdo (a)
	         System.out.print("Informe o valor do extremo esquerdo do intervalo (a): ");
	         a = scanner.nextInt();

	         // Solicitar o valor do extremo direito (b) maior que a
	         do {
	             System.out.print("Informe o valor do extremo direito do intervalo (b): ");
	             b = scanner.nextInt();
	             if (b <= a) {
	                 System.out.println("O valor de b deve ser maior que a. Por favor, insira um valor maior que " + a + ".");
	             }
	         } while (b <= a);

	         int somaImpares = 0;
	         int produtoPares = 1;

	         for (int i = a; i <= b; i++) {
	             if (i % 2 == 0) {
	                 // Número par, calcular o produto
	                 produtoPares *= i;
	             } else {
	                 // Número ímpar, calcular a soma
	                 somaImpares += i;
	             }
	         }

	         System.out.println("Média dos números ímpares: " + (double) somaImpares / ((b - a + 1) / 2));
	         System.out.println("Produto dos números pares: " + produtoPares);
	     }
	 }
