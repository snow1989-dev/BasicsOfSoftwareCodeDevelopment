package by.introductiontojava.topic01.additional2;

import java.util.Scanner;

/**
 * Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек
 * пытается их угадать. Программа должна вводить угаданные и не угаданные числа
 * из тех, что сгенеривовала программа, а также ошибочные числа пользователя.
 */

public class Task31 {

	public static void main(String[] args) {

		int[] numberProg = new int[5];
		int[] numberPers = new int[5];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Введите число от 1 до 15 включительно: ");
			while (!sc.hasNextInt()) {
				@SuppressWarnings("unused")
				String s = sc.nextLine();
				System.out.print("Введите число от 1 до 15 включительно: ");
			}
			numberPers[i] = sc.nextInt();
		}
		System.out.print("Игрок ввел следующие числа: ");
		for (int i = 0; i < 5; i++)
			System.out.print(numberPers[i] + " ");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			numberProg[i] = (int) (Math.random() * ((15 - 1) + 1)) + 1;
		}
		System.out.print("Программа сгенерировалла следующие числа: ");
		for (int i = 0; i < 5; i++)
			System.out.print(numberProg[i] + " ");
		System.out.println();

		for (int i = 0; i <= numberProg.length; i++) {
			if (numberProg[i] == numberPers[i])
				System.out.println(numberProg[i] + " = " + numberPers[i]
						+ " Угадал!!!");
			else
				System.out.println(numberProg[i] + " != " + numberPers[i]
						+ " Не угадал((");

		}

	}

}
