package by.introductiontojava.topic01.additional1;

//Вычислить значение функции: F(x) = -x2 + 3x + 9, если x >= 3 и 1/(x3 - 6), если x<3.

public class Task37 {

	public static void main(String[] args) {
		double x = -3;
		double F = 0;

		if (x >= 3) {
			F = -Math.pow(x, 2) + 3 * x + 9;
			System.out.print("F = " + F);
		}
		if (x < 3) {
			F = 1 / (Math.pow(x, 3) - 6);
			System.out.print("F = " + F);
		}

	}

}
