package aplicacao;

import java.util.Scanner;

import servicos.PrintServicoString;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintServicoString ps = new PrintServicoString();
		
		System.out.print("quantos valores vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String valor = sc.next();
			ps.addValor(valor);
		}

		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

	}


