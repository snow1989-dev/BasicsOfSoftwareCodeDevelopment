package by.introductiontojava.topic01.additional2;

/**
 * С помощю оператора while напишите программу вывода всех четных чисел в
 * диапазоне от от 2 до 100 включительно
 */

public class Task04 {

	public static void main(String[] args) {

		int x = 2;

		while (x <= 100) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
			x = x + 1;
		}
	}
}
