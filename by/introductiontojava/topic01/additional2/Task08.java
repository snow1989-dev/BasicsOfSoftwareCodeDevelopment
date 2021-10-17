package by.introductiontojava.topic01.additional2;

/**
 * Вычислить значение функции на отрезке [a, b] с шагом h: y = (x + c)*2, если x
 * = 15, и y = (x - c) + 6 если x != 15.
 */

public class Task08 {

	public static void main(String[] args) {
		int a = 0;
		int b = 21;
		int c = 6;
		int h = 3;
		int y = 0;

		for (int x = a; x <= b; x += h) {
			if (x == 15)
				y = (x + c) * 2;
			else if (x != 15)
				y = (x - c) + 6;
			System.out.println("x = " + x + " y = " + y);

		}

	}

}
