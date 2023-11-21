package aps;
import java.util.Scanner;

public class Questao4 {
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Informe os rendimentos brutos do trabalhador: ");
	        double rendimentosBrutos = scanner.nextDouble();
	        
	        scanner.close();

	        double inss;
	        if (rendimentosBrutos <= 1045.00) {
	            inss = rendimentosBrutos * 0.075;
	        } else if (rendimentosBrutos <= 2089.60) {
	            inss = rendimentosBrutos * 0.09;
	        } else if (rendimentosBrutos <= 3134.40) {
	            inss = rendimentosBrutos * 0.12;
	        } else if (rendimentosBrutos <= 6101.06) {
	            inss = rendimentosBrutos * 0.14;
	        } else {
	            inss = 6101.06 * 0.14;
	        }

	        double baseDeCalculo = rendimentosBrutos - inss;
	        double ir;
	        if (baseDeCalculo <= 1903.98) {
	            ir = 0;
	        } else if (baseDeCalculo <= 2826.65) {
	            ir = (baseDeCalculo * 0.075) - 142.80;
	        } else if (baseDeCalculo <= 3751.05) {
	            ir = (baseDeCalculo * 0.15) - 354.80;
	        } else if (baseDeCalculo <= 4664.68) {
	            ir = (baseDeCalculo * 0.225) - 636.13;
	        } else {
	            ir = (baseDeCalculo * 0.275) - 869.36;
	        }
	       
	        System.out.println("Contribuição do INSS: R$" + inss);
	        System.out.println("Imposto de Renda Retido na Fonte (IR): R$" + ir);
	    }
	}


