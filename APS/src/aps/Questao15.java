package aps;
import java.util.Scanner;

public class Questao15 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int totalEntrevistados = 1000;
	        int contagemSim = 0;
	        int contagemNao = 0;
	        int contagemFemininoSim = 0;
	        int contagemMasculinoNao = 0;

	        for (int i = 0; i < totalEntrevistados; i++) {
	            System.out.print("Informe o sexo do entrevistado (M/F): ");
	            char sexo = scanner.next().charAt(0);

	            System.out.print("A pessoa gostou do produto? (sim/nao): ");
	            String resposta = scanner.next();

	            if (resposta.equalsIgnoreCase("sim")) {
	                contagemSim++;
	                if (sexo == 'F' || sexo == 'f') {
	                    contagemFemininoSim++;
	                }
	            } else if (resposta.equalsIgnoreCase("nao")) {
	                contagemNao++;
	                if (sexo == 'M' || sexo == 'm') {
	                    contagemMasculinoNao++;
	                }
	            }
	        }

	        double porcentagemFemininoSim = (contagemFemininoSim / (double) totalEntrevistados) * 100;
	        double porcentagemMasculinoNao = (contagemMasculinoNao / (double) totalEntrevistados) * 100;

	        System.out.println("a. Número de pessoas que responderam sim: " + contagemSim);
	        System.out.println("b. Número de pessoas que responderam não: " + contagemNao);
	        System.out.println("c. Porcentagem de pessoas do sexo feminino que responderam sim: " + porcentagemFemininoSim + "%");
	        System.out.println("d. Porcentagem de pessoas do sexo masculino que responderam não: " + porcentagemMasculinoNao + "%");
	    }
	}

