package aps;
import java.util.Scanner;

public class Questao18 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Informe um ano para verificar se é bissexto: ");
	        int ano = scanner.nextInt();

	        if (verificarAnoBissexto(ano)) {
	            System.out.println(ano + " é um ano bissexto.");
	        } else {
	            System.out.println(ano + " não é um ano bissexto.");
	        }
	    }

	    public static boolean verificarAnoBissexto(int ano) {
	        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
	            return true;
	        }
	        return false;
	    }
	}

