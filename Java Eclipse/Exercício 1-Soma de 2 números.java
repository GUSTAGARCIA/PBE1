package programacao_backend;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor de x? ");
		int x = sc.nextInt();
		
		System.out.print("Qual o valor de y? ");
		int y = sc.nextInt();
		
		System.out.println("A soma de x + y é: " + (x+y));
		
		sc.close();
	}

}
