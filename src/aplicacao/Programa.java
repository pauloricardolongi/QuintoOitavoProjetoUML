package aplicacao;

import java.util.Scanner;

import servicos.PrintServico;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintServico<String> ps = new PrintServico<>();
		
		System.out.print("quantos valores vai digitar? ");
		int n = sc.nextInt();
		
		
				
		for (int i = 0; i < n; i++) {
			String valor = sc.next();
			ps.addValor(valor);
		}

		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}

	}


