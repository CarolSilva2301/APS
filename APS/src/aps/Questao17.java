package aps;
import java.util.Scanner;
public class Questao17 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Informe o número do quarto: ");
	        int numeroQuarto = scanner.nextInt();

	        
	        System.out.print("Informe o número de diárias: ");
	        int numeroDiarias = scanner.nextInt();

	        
	        double taxaServicos;
	        if (numeroDiarias < 15) {
	            taxaServicos = 20.00;
	        } else if (numeroDiarias == 15) {
	            taxaServicos = 14.00;
	        } else {
	            taxaServicos = 12.00;
	        }

	        
	        double precoDiaria = 300.00;
	        double totalPagar = numeroDiarias * precoDiaria + taxaServicos;

	        System.out.println("Número do quarto: " + numeroQuarto);
	        System.out.println("Número de diárias: " + numeroDiarias);
	        System.out.println("Taxa de serviços: R$" + taxaServicos);
	        System.out.println("Total a pagar: R$" + totalPagar);
	    }
	}


