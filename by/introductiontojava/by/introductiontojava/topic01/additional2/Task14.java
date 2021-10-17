package by.introductiontojava.topic01.additional2;

public class Task14 {

	public static void main(String[] args) {

		int n = 15;
		double sum = 0;

		for (double i = 1; i <= n; i++) {
			double d = 1 / i;
			sum += d;
		}
		System.out.println("Сумма = " + sum);

	}

}
