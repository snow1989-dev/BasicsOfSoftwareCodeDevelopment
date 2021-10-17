package by.introductiontojava.topic01.additional1;

//Составить программу нахождения наименьшего из квадратов двух чисел a и b.

public class Task08 {

	public static void main(String[] args) {

		double a;
		double b;
		double a2;
		double b2;

		a = 22.0;
		b = 32.8;

		a2 = Math.pow(a, 2);
		b2 = Math.pow(b, 2);

		if (a2 < b2)
			System.out.print("квадрат а наименьший");
		else
			System.out.print("квадрат b наименьший");

	}
}

