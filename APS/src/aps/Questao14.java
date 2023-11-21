package aps;
import java.util.Scanner;

public class Questao14 {
	
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);

	         int tamanho = 30;
	         int[] numeros = new int[tamanho];
	         int[] pares = new int[tamanho];
	         int[] impares = new int[tamanho];
	         int contadorPares = 0;
	         int contadorImpares = 0;

	         System.out.println("Digite os 30 valores:");

	         for (int i = 0; i < tamanho; i++) {
	             numeros[i] = sc.nextInt();
	             if (numeros[i] % 2 == 0) {
	                 pares[contadorPares] = numeros[i];
	                 contadorPares++;
	             } else {
	                 impares[contadorImpares] = numeros[i];
	                 contadorImpares++;
	             }
	         }

	         System.out.print("Números pares: [");
	         for (int i = 0; i < contadorPares; i++) {
	             System.out.print(pares[i]);
	             if (i < contadorPares - 1) {
	                 System.out.print(", ");
	             }
	         }
	         System.out.println("]");

	         System.out.print("Números ímpares: [");
	         for (int i = 0; i < contadorImpares; i++) {
	             System.out.print(impares[i]);
	             if (i < contadorImpares - 1) {
	                 System.out.print(", ");
	             }
	         }
	         System.out.println("]");

	         sc.close();
	     }
	 }


