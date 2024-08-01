package programacao_backend;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do raio do círculo? ");
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		
        double area = pi * raio * raio;
      
      System.out.printf("O valor da área do círculo é %.4f", area);
      
      sc.close();
	}

}
