package by.introductiontojava.topic01.additional1;

import java.util.Scanner;

/**
 * Сставить программу, определяющую результат гадания на ромашке -
 * "любт - не любит", взяв за исходное данное количеств лепестков n
 */

public class Task24 {

	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner c = new Scanner(System.in);

		System.out.print("Введите количество лепестков >>");

		while (!c.hasNextInt()) {
			@SuppressWarnings("unused")
			String s = c.nextLine();
			System.out.print("Введите количество лепестков >>");
		}
		n = c.nextInt();

		if (n % 2 == 0)
			System.out.print("Любит!!!");
		else
			System.out.print("Не любит!!!");

	}

}
