package by.introductiontojava.topic01.additional1;

import java.util.Scanner;

/**
 * Определить правельность даты, введенной с клавиатуры (число - от 1 до 31,
 * месяц - от 1 до 12). Если введены некорректные данные, то сообщить об этом.
 */

public class Task23 {

	public static void main(String[] args) {
		int day;
		int month;

		@SuppressWarnings("resource")
		Scanner c = new Scanner(System.in);

		System.out.print("Введите число от 1 до 31 >>" + "");
		while (!c.hasNextInt()) {
			@SuppressWarnings("unused")
			String s = c.nextLine();
			System.out.print("Введите число от 1 до 31 >>");
		}
		day = c.nextInt();

		if ((day >= 1) && (day <= 31))
			System.out.println("day = " + day);
		else
			System.out.println("Вы ввели не верную дату");

		System.out.print("Введите месяц от 1 до 12 >>");
		while (!c.hasNextInt()) {
			@SuppressWarnings("unused")
			String s = c.nextLine();
			System.out.print("Введите месяц от 1 до 12 >>");
		}
		month = c.nextInt();

		if ((month >= 1) && (month <= 12))
			System.out.println("month = " + month);
		else
			System.out.println("Вы ввели не верный месяц");

	}

}

