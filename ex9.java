import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero total de horas trabalhadas no mes: ");
        int horasTrabalhadasNoMes = scanner.nextInt();

        System.out.print("Digite o salario por hora: ");
        double salarioPorHora = scanner.nextDouble();

        if (horasTrabalhadasNoMes <= 0) {
            System.out.println("O salario total do funcionario eh: R$ 0.00");
        } else {

            int horasPorSemana = 40;
            int semanasNoMes = 4;

            double salarioBase = salarioPorHora * horasPorSemana * semanasNoMes;
            double horasExtras = Math.max(0, horasTrabalhadasNoMes - (horasPorSemana * semanasNoMes));
            double valorHoraExtra = salarioPorHora * 1.5; 
            double salarioTotal = salarioBase + (horasExtras * valorHoraExtra);

            System.out.printf("O salario total do funcionario eh: R$ %.2f%n", salarioTotal);
        }

    }
}
