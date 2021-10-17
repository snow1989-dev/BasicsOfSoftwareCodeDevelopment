package by.introductiontojava.topic01.additional1;

import java.util.Scanner;

//Вычислить число и месяц в не высокосном году по номеру дня.

public class Task35 {

	public static void main(String[] args) {

		int day;

		day = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите номер дня от 1 до 365: ");

		while (!sc.hasNextInt()) {
			@SuppressWarnings("unused")
			String s = sc.nextLine();
			System.out.print("Введите номер дня от 1 до 365: ");
		}
		day = sc.nextInt();

		if (day < 0 || day > 365)
			System.out.println("Вами введен не верный номер дня");
		if (day > 0 && day <= 31)
			System.out.print(day + " января");
		if (day > 31 && day <= 59) {
			int day1 = day - 31;
			System.out.print(day1 + " февраля");
		}
		if (day > 59 && day <= 90) {
			int day1 = day - 59;
			System.out.print(day1 + " марта");
		}
		if (day > 90 && day <= 120) {
			int day1 = day - 90;
			System.out.print(day1 + " апреля");
		}
		if (day > 120 && day <= 151) {
			int day1 = day - 120;
			System.out.print(day1 + " мая");
		}
		if (day > 151 && day <= 181) {
			int day1 = day - 151;
			System.out.print(day1 + " июня");
		}
		if (day > 181 && day <= 212) {
			int day1 = day - 181;
			System.out.print(day1 + " июля");
		}
		if (day > 212 && day <= 243) {
			int day1 = day - 212;
			System.out.print(day1 + " августа");
		}
		if (day > 243 && day <= 273) {
			int day1 = day - 243;
			System.out.print(day1 + " сентября");
		}
		if (day > 273 && day <= 304) {
			int day1 = day - 273;
			System.out.print(day1 + " октября");
		}
		if (day > 304 && day <= 334) {
			int day1 = day - 304;
			System.out.print(day1 + " ноября");
		}
		if (day > 334 && day <= 365) {
			int day1 = day - 334;
			System.out.print(day1 + " декабря");

		}
	}
}

