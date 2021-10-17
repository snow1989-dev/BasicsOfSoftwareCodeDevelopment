package by.introductiontojava.topic01.additional1;

//Вычислить значение функции: F(x) = -x2 + x - 9, если x >= 8 и 1/(x4 - 6), если  < 8.

public class Task39 {

	public static void main(String[] args) {
		double x = 7;
		double F = 0;

		if (x >= 8) {
			F = -Math.pow(x, 2) + x - 9;
			System.out.print("F = " + F);
		}
		if (x < 8) {
			F = 1 / (Math.pow(x, 4) - 6);
			System.out.print("F = " + F);
		}

	}

}
