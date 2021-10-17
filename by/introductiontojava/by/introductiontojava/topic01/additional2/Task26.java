package by.introductiontojava.topic01.additional2;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в
 * памяти компьютера (Таблицу ASCII).
 */

public class Task26 {

	public static void main(String[] args) {

		System.out.println("---------------");
		for (int i = 0; i <= 255; i++) {
			char ch = (char) i;
			System.out.printf("|%6d|%6s|\n", i, ch);
			System.out.println("---------------");
		}
	}
}
