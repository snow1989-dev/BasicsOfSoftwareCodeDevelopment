package by.introductiontojava.topic01.section01;

/**
 * Вычислить знаение выражения по формуле (все переменные принимают
 * действительное значение): (b + √(b^2+4ac))/2a)-a^3c + b^-2.
 */

public class Task02 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		a = 6.5;
		b = 8.7;
		c = 16.0;
		z = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		z = z / 2 * a;
		z = z - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.print(z);
	}

}
