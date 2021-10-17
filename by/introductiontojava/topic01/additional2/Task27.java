package by.introductiontojava.topic01.additional2;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме еденицы и самого числа.n и m вводятся с клавиатуры.
 */

public class Task27 {

	public static void main(String[] args) {

		int n;
		int m;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число m: ");
		while (!sc.hasNextInt()) {
			@SuppressWarnings("unused")
			String s = sc.nextLine();
			System.out.print("Введите число m: ");
		}
		m = sc.nextInt();

		System.out.print("Введите число n: ");
		while (!sc.hasNextInt()) {
			@SuppressWarnings("unused")
			String s = sc.nextLine();
			System.out.print("Введите число n: ");
		}
		n = sc.nextInt();

		for (int i = m; i <= n; i++) {
			System.out.print("число - " + i + ", делители: ");
			for (int x = 2; x < i; x++) {
				if (i % x == 0)
					System.out.print(x + " ");

			}
			System.out.println("");
		}

	}
}

