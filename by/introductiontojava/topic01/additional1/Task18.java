package by.introductiontojava.topic01.additional1;

//Подсчитать количество отрицательных среди чисел a, b, c.

public class Task18 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		int i;

		a = 3;
		b = -5;
		c = 5;
		i = 0;

		if (a < 0)
			i = i + 1;
		if (b < 0)
			i = i + 1;
		if (c < 0)
			i = i + 1;
		System.out.print(i);

	}
}
