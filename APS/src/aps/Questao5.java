package aps;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua renda anual: ");
        double rendaAnual = scanner.nextDouble();

        System.out.print("Informe suas despesas médicas: ");
        double despesasMedicas = scanner.nextDouble();

        System.out.print("Informe suas despesas educacionais: ");
        double despesasEducacionais = scanner.nextDouble();

        double rendaMensal = rendaAnual / 12;
        double despesasTotais = despesasMedicas + despesasEducacionais;
        double impostoDevido = calcularImposto(rendaMensal, despesasTotais);

        System.out.println("\nRelatório de Imposto de Renda:");
        System.out.println("Renda Anual: R$" + rendaAnual);
        System.out.println("Renda Mensal: R$" + rendaMensal);
        System.out.println("Despesas Médicas: R$" + despesasMedicas);
        System.out.println("Despesas Educacionais: R$" + despesasEducacionais);
        System.out.println("Despesas Totais: R$" + despesasTotais);
        System.out.println("Imposto Devido: R$" + impostoDevido);
    }

    public static double calcularImposto(double rendaMensal, double despesasTotais) {
        double rendaAnual = rendaMensal * 12;
        double rendaTaxavel = rendaAnual - despesasTotais;
        double impostoDevido = 0;

        if (rendaTaxavel <= 20000) {
            impostoDevido = 0.05 * rendaTaxavel;
        } else if (rendaTaxavel <= 50000) {
            impostoDevido = 0.1 * rendaTaxavel;
        } else {
            impostoDevido = 0.2 * rendaTaxavel;
        }

        return impostoDevido;
	
	}
	

}