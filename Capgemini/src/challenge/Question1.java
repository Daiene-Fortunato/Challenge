package challenge;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo ao Desafio!\nPara prosseguir insira um valor inteiro entre 1-99.\nPara encerrar digite qualquer valor acima de 100.");
		int n = 0;
		int check = 0;
		
		while (check !=100) {
			System.out.print("\nSua opção: ");
			int input = sc.nextInt();
			System.out.println();
			check = input;
			if (input > 0 && input < 100) {
				n = input;
				for (int i = 1; i <= n; i++)
					System.out.println(" ".repeat(n-i) + "*".repeat(i));
			} else {
				System.out.println("\nPrograma encerrado com sucesso!");
			} 
		}
		sc.close();
	}
	
}
