package by.introductiontojava.topic01.additional2;

import java.util.Scanner;

/**
 * Напишите прозрамму, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользоателем числа.
 */

public class Task06 {

	public static void main(String[] args) {

		long n = 0;
		long sum = 0;

		@SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);

		System.out.println("Введите число: ");

		while (!x.hasNextLong()) {
			@SuppressWarnings("unused")
			String s = x.nextLine();
			System.out.println("Введите число: ");
		}

		n = x.nextLong();

		if (n > 0) {
			for (long i = 1; i <= n; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		} else if (n <= 0)
			System.out
					.println("Вы ввели 0 либо отрицательное число. Попрбуйте еще раз!");

	}

}

