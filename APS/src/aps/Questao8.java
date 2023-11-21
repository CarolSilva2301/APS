package aps;
import javax.swing.JOptionPane;
public class Questao8 {
	
		    public static void main(String[] args) {
		        double num1, num2;

		        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
		        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

		        int opcao;
		        do {
		            String escolha = JOptionPane.showInputDialog(
		                    "Operações Disponíveis:\n" +
		                            "1. Adição\n" +
		                            "2. Subtração\n" +
		                            "3. Multiplicação\n" +
		                            "4. Divisão\n" +
		                            "9. Sair do Programa\n" +
		                            "Digite o número da opção desejada:"
		            );
		            opcao = Integer.parseInt(escolha);

		            switch (opcao) {
		                case 1:
		                    JOptionPane.showMessageDialog(null, "Resultado da Adição: " + (num1 + num2));
		                    break;
		                case 2:
		                    JOptionPane.showMessageDialog(null, "Resultado da Subtração: " + (num1 - num2));
		                    break;
		                case 3:
		                    JOptionPane.showMessageDialog(null, "Resultado da Multiplicação: " + (num1 * num2));
		                    break;
		                case 4:
		                    if (num2 != 0) {
		                        JOptionPane.showMessageDialog(null, "Resultado da Divisão: " + (num1 / num2));
		                    } else {
		                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero.");
		                    }
		                    break;
		                case 9:
		                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
		                    break;
		                default:
		                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
		                    break;
		            }
		        } while (opcao != 9);
		    }
		}

