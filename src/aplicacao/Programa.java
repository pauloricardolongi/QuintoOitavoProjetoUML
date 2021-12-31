package aplicacao;

import java.util.Scanner;

import servicos.PrintServico;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintServico ps = new PrintServico();
		
		System.out.print("quantos valores vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer valor = sc.nextInt();
			ps.addValor(valor);
		}

		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

	}


