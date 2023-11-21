package aps;
import java.util.Scanner;

public class Questao6 {	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite o total de reboco em m² produzido no mês: ");
	        double totalReboco = scanner.nextDouble();

	        
	        double valorPorMetroQuadrado;
	        if (totalReboco <= 40) {
	            valorPorMetroQuadrado = 9.80;
	        } else {
	            valorPorMetroQuadrado = 10.00;
	        }

	        
	        int diasUteisPorMes = 22;
	        double producaoMediaDiaria = totalReboco / diasUteisPorMes;
	        double valorMonetario = totalReboco * valorPorMetroQuadrado;

	        System.out.println("\nInformações sobre a produção do trabalhador:");
	        System.out.println("Dias úteis considerados para o mês: " + diasUteisPorMes + " dias");
	        System.out.printf("Produção média diária do trabalhador: %.2f m²/dia%n", producaoMediaDiaria);
	        System.out.printf("Valor monetário atribuído à produção: R$%.2f%n", valorMonetario);

	       
	        double valorBruto = totalReboco * valorPorMetroQuadrado * diasUteisPorMes;
	        System.out.printf("\nValor bruto a ser pago ao funcionário: R$%.2f%n", valorBruto);

	        scanner.close();
	    }
	}
