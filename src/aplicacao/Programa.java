package aplicacao;

import java.util.Scanner;
import java.text.ParseException;

import entidades.Pousada;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Pousada[] vect = new Pousada[10];

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Alugue #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Pousada(nome, email);
		}

		System.out.println();
		System.out.println("Quartos ocupadas:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
