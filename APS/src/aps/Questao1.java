package aps;
import java.util.Scanner;

	public class Questao1 {
		private static final Scanner SCANNER2 = new Scanner (System.in);

		public static void main (String[] args) {
			double indice;
		
		System.out.print("Digite o Índice de Poluição: ");
		Scanner scanner = SCANNER2; 
		
		indice = SCANNER2.nextDouble();

		if (indice >= 0.5) {
	        System.out.println("Notificação para todos os grupos: Paralisar atividades.");
	    } 
		if (indice >= 0.4) {
	        System.out.println("Notificação para o grupo 1º e 2º: Paralisar atividades.");
	    } 
		if (indice >= 0.3) {
	        System.out.println("Notificação para o 1º grupo: Paralisar atividades.");
	    } 
		if (indice >= 0.25 && indice <= 0.5) {
	        System.out.println("Índice dentro do aceitável. Nenhuma notificação necessária.");
	    } 
		else {
	        System.out.println("Índice de poluição baixo. Nenhuma notificação necessária.");
	    }

		scanner.close();
		
		}
		
		}
		

	

