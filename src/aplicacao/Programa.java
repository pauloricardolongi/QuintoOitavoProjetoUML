package aplicacao;

import java.util.Scanner;

import servicos.PrintServico;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintServico ps = new PrintServico();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int valor = sc.nextInt();
			ps.addValor(valor);
		}

		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

	}


