package by.introductiontojava.topic01.additional2;

import java.util.Scanner;

//Требуется определить факториал числа, которое ввел пользователь.

public class Task25 {

	public static void main(String[] args) {

		long number;
		int factorial = 1;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число: ");
		while (!scan.hasNextLong()) {
			@SuppressWarnings("unused")
			String s = scan.nextLine();
			System.out.print("Введите число: ");
		}
		number = scan.nextLong();

		for (long i = number; i > 0; i--) {
			factorial *= i;
		}
		System.out.print("Факториал числа: " + factorial);

	}

}

