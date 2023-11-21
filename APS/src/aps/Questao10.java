package aps;
import java.util.Scanner;

public class Questao10 {
		public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);

	         System.out.print("Digite o nome do aluno: ");
	         String nome = sc.nextLine();

	         double nota1, nota2, nota3;
	         double media;

	         System.out.print("Digite a primeira nota (de 0 a 10): ");
	         nota1 = sc.nextDouble();

	         if (nota1 < 0 || nota1 > 10) {
	             System.out.println("NOTA INVÁLIDA!");
	             sc.close();
	             return; 
	         }

	         System.out.print("Digite a segunda nota (de 0 a 10): ");
	         nota2 = sc.nextDouble();

	         if (nota2 < 0 || nota2 > 10) {
	             System.out.println("NOTA INVÁLIDA!");
	             sc.close();
	             return; 
	         }

	         System.out.print("Digite a terceira nota (de 0 a 10): ");
	         nota3 = sc.nextDouble();

	         if (nota3 < 0 || nota3 > 10) {
	             System.out.println("NOTA INVÁLIDA!");
	             sc.close();
	             return; 
	         }

	         
	         media = (nota1 + nota2 + nota3) / 3;

	         System.out.println("Nome do aluno: " + nome);
	         System.out.println("Média das notas: " + media);

	         sc.close();
	     }
	 }

