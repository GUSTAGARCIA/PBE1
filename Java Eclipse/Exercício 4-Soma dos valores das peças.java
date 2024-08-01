package programacao_backend;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código da peça 1: ");
		int codigo1 = sc.nextInt();
		
		System.out.print("Quantidade de peças 1: ");
		int quantidade1 = sc.nextInt();
		
		System.out.print("Valor unitário da primeira peça: ");
		double valorpeca1 = sc.nextDouble();
		
		System.out.print("Código da peça 2: ");
		int codigo2 = sc.nextInt();
		
		System.out.print("Quantidade de peças 2: ");
		int quantidade2 = sc.nextInt();
		
		System.out.print("Valor unitário da segunda peça: ");
		double valorpeca2 = sc.nextDouble();
		
		double valor1 = quantidade1 * valorpeca1;
		double valor2 = quantidade2 * valorpeca2;
		double valortotal = valor1 + valor2;
		
		System.out.printf("Código da primeira peça: %d %nCódigo da segunda peça: %d %nValor total ser pago juntando o valor pago das duas peças são: %.2f",codigo1,codigo2, valortotal);
	
		sc.close();
	}

}
