package by.introductiontojava.topic01.additional1;

/**
 * Даны целые числа m, n. Если числа не равны, то заменить каждое из них oдним и
 * тем же числом, равным большему из исходных, а если равны, то заменить числа
 * нулями.
 */

public class Task17 {

	public static void main(String[] args) {

		int m;
		int n;

		m = 5;
		n = 9;

		if (m != n) {
			if (m > n) {
				n = m;
				System.out.println("m = " + m + ";" + "n = " + n);
			} else {
				m = n;
				System.out.println("m = " + m + "; " + "n = " + n + ".");
			}
		} else {
			m = 0;
			n = 0;
			System.out.println("m = " + m + "; " + "n = " + n + ".");
		}

	}
}
