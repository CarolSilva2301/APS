package aps;
import java.util.Scanner;
public class Questao9 {
	 
	 public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);

	         System.out.println("Digite o primeiro valor inteiro: ");
	         int valor1 = sc.nextInt();

	         System.out.println("Digite o segundo valor inteiro: ");
	         int valor2 = sc.nextInt();

	         System.out.println("Digite o terceiro valor inteiro: ");
	         int valor3 = sc.nextInt();

	         System.out.println("Digite o quarto valor inteiro: ");
	         int valor4 = sc.nextInt();

	         int maior = valor1;
	         int menor = valor1;

	         
	         if (valor2 > maior) {
	             maior = valor2;
	         }
	         if (valor3 > maior) {
	             maior = valor3;
	         }
	         if (valor4 > maior) {
	             maior = valor4;
	         }

	         
	         if (valor2 < menor) {
	             menor = valor2;
	         }
	         if (valor3 < menor) {
	             menor = valor3;
	         }
	         if (valor4 < menor) {
	             menor = valor4;
	         }

	         System.out.println("O maior valor é: " + maior);
	         System.out.println("O menor valor é: " + menor);

	         sc.close();
	     }
	 }

