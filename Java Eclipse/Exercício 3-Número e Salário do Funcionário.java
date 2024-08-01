package programacao_backend;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu número de funcionário? ");
		int numero = sc.nextInt();
		
		System.out.print("Quantas horas você trabalha? ");
		int hora = sc.nextInt();
		
		System.out.print("Quanto recebe por hora? ");
		double renda = sc.nextDouble();
		
		double salariodia = hora * renda;
	    double salario = hora * renda * 30;
		
		System.out.printf("O número do funcionário é %d %nSalário diário de %.2f %nSalário mensal é %.2f ", numero,salariodia, salario);
		
        sc.close();
	}

}
