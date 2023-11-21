package aps;
import java.util.Scanner;
public class Questao7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Quantas pessoas serão analisadas (N): ");
	        int n = scanner.nextInt();

	        String[] nomes = new String[n];
	        char[] sexos = new char[n];
	        int[] anosNascimento = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nInforme os dados da pessoa " + (i + 1));
	            scanner.nextLine();  

	            System.out.print("Nome: ");
	            nomes[i] = scanner.nextLine();

	            System.out.print("Sexo (M/F): ");
	            sexos[i] = scanner.next().charAt(0);

	            System.out.print("Ano de nascimento: ");
	            anosNascimento[i] = scanner.nextInt();
	        }
	        
	        System.out.println("\nPessoas aptas ao serviço militar:" );

	        for (int i = 0; i < n; i++) {
	            int idade = 2023 - anosNascimento[i];
	            if (sexos[i] == 'M' && idade >= 18 && idade <= 45) {
	                System.out.println(nomes[i]);
	            }
	        }
	    }
	}

