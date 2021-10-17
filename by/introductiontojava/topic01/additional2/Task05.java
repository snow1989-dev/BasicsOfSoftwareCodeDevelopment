package by.introductiontojava.topic01.additional2;

/**
 * С помощю оператора while напишите программу определения суммы всех нечетных
 * чисел в диапазоне от 1 до 99 включительно
 */

public class Task05 {

	public static void main(String[] args) {
		int x = 1;
		int sum = 0;

		while (x <= 99) {
			if (x % 2 != 0) {
				sum += x;
			}
			x = x + 1;
		}
		System.out.println(sum);

	}

}
