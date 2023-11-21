package aps;
import java.util.Scanner;

public class Questao3 {
		
		public static void main(String[] args) {
			//utilizada para ler a entrada de dados
			Scanner leia = new Scanner(System.in);
			//variaveis
			boolean achaDigito = false;
		    boolean achaLetraMaiuscula = false;
		    boolean achaLetraMinuscula = false;
		    boolean achaCaractereEspecial = false;
		    String senha;
		    
		    System.out.println("Digite uma senha que satisfaz os seguintes critérios:"+ "\n" +
		            "- Possua no mínimo 6 caracteres;"+ "\n" +
		            "- Contenha no mínimo 1 digito;"+ "\n" +
		            "- Contenha no mínimo 1 letra em minúsculo;" + "\n" +
		            "- Contenha no mínimo 1 letra em maiúsculo;" + "\n" +
		            "- Contenha no mínimo 1 caractere especial (!@#$%^&*()-+);");
		    //solicita do usuario a digitação da senha para verificação do cumprimento dos critérios
		    System.out.print("Digite a senha: ");
		    senha = leia.next();
		    
			//Verifica a quantidade de caracteres da senha
			if (senha.length() < 6) {
				
				System.out.print("A senha digitada possui " + (senha.length()) 
						+ " caracteres, é necessário ter minimo 6 caracteres, faltam: " 
						+ (6 - senha.length() + " caractere(s) \n"));
			}
			else {//percorre a senha e verifica os diferentes caracteres que a senha possui
				for (char c : senha.toCharArray()) {
			         if (c >= '0' && c <= '9') {
			        	 achaDigito = true;
			         } else if (c >= 'A' && c <= 'Z') {
			        	 achaLetraMaiuscula = true;
			         } else if (c >= 'a' && c <= 'z') {
			        	 achaLetraMinuscula = true;
			         } else {
			        	 achaCaractereEspecial = true;
			         }
			    }//verifica se achou os caracteres obrigatórios, caso não exista, aparece a mensagem na tela
				if(!achaDigito) {
					System.out.println("Sua senha precisa ter pelo menos um digito!");
				}
				if(!achaLetraMaiuscula) {
					System.out.println("Sua senha precisa ter pelo menos uma letra em maiusculo!");
				}
				if(!achaLetraMinuscula) {
					System.out.println("Sua senha precisa ter pelo menos uma letra em minusculo!");
				}
				if (!achaCaractereEspecial) {
					System.out.println("Sua senha precisa ter pelo menos um caractere especial");
				}
				//se valida todos os critérios, a senha é validada
				if(achaDigito && achaLetraMaiuscula && achaLetraMinuscula && achaCaractereEspecial) {
					System.out.println("Senha cadastrada com sucesso!");
				}
			}
					
			leia.close();
		}
	}