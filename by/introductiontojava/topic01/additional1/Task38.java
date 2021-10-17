package by.introductiontojava.topic01.additional1;

//Вычислить значение функции: F(x) = x2, если x <= 3 и x >= 0, и 4, если x < 3.

public class Task38 {

	public static void main(String[] args) {
		double x = -3;
		double F = 0;

		if (x >= 0 && x <= 3) {
			F = Math.pow(x, 2);
			System.out.print("F = " + F);
		}
		if (x < 3 || x < 0) {
			F = 4;
			System.out.print("F = " + F);
		}

	}

}

