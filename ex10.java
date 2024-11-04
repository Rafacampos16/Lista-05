import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas efetuadas: R$ ");
        double vendas = scanner.nextDouble();

        double comissao;
        if (vendas <= 1500) {
            comissao = vendas * 0.03; 
        } else {
            comissao = (1500 * 0.03) + ((vendas - 1500) * 0.05); 
        }

        double salarioTotal = salarioFixo + comissao;

        System.out.printf("O salario total do vendedor eh: R$ %.2f%n", salarioTotal);

    }
}
