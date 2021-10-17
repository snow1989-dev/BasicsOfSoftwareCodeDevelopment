package by.introductiontojava.topic01.additional1;

//Вычислить значение функции: F(x) = -x3 + 9, если x <= 13 и -(3/(x +1)), если  x > 13.

public class Task40 {

	public static void main(String[] args) {
		double x = 7;
		double F = 0;

		if (x <= 13) {
			F = -Math.pow(x, 3) + 9;
			System.out.print("F = " + F);
		}
		if (x > 13) {
			F = -(3 / x + 1);
			System.out.print("F = " + F);
		}

	}

}
