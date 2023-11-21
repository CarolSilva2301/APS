package aps;
import java.util.Scanner;
public class Questao19 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Informe o dia: ");
	        int dia = scanner.nextInt();

	        System.out.print("Informe o mês: ");
	        int mes = scanner.nextInt();

	        System.out.print("Informe o ano: ");
	        int ano = scanner.nextInt();

	        
	        exibirDataPorExtenso(dia, mes, ano);
	    }

	    public static void exibirDataPorExtenso(int dia, int mes, int ano) {
	        String[] meses = {
	            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
	            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
	        };

	        if (mes < 1 || mes > 12) {
	            System.out.println("Mês inválido.");
	        } else {
	            System.out.println(dia + " de " + meses[mes - 1] + " de " + ano);
	        }
	    }
	}
