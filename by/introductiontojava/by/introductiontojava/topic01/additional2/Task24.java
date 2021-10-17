package by.introductiontojava.topic01.additional2;

import java.util.Scanner;

/**
 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
 * Преобразовать его в другое число, цифры которого будут следовать в обратном
 * порядке по сравнению с введенным числом.
 */

public class Task24 {

	public static void main(String[] args) {

		int number;
		int sum = 0;
		int revnumber = 0;

		System.out.print("Введите натуральное число: ");

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		while (!s.hasNextInt()) {
			@SuppressWarnings("unused")
			String str = s.nextLine();
			System.out.print("Введите натуральное число: ");
		}
		number = s.nextInt();

		int b = number;

		while (number > 0) {
			if (number % 2 == 0) {
				sum += (number % 10);
			}
			number /= 10;
		}
		System.out.println("Сумма четных цифр: " + sum);

		while (b > 0) {
			revnumber = revnumber * 10 + b % 10;
			b = b / 10;
		}
		System.out.println("Чосло в обратном порядке: " + revnumber);

	}
}

