package by.introductiontojava.topic01.section03;

/**
 * Вычислить значение функции на отрезке [a, b] с шагом h: y = x, если x > 2, и
 * y = -x, если x<=2.
 */

public class Task02 {

	public static void main(String[] args) {

		double a = -10;
		double b = 10;
		double h = 1.5;
		double y = 0;

		for (double x = a; x <= b; x += h) {
			if (x <= 2)
				y = x;
			else if (x > 2)
				y = -x;
			System.out.println("x = " + x + " y = " + y);

		}

	}

}
