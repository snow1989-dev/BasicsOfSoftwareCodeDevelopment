package by.introductiontojava.topic01.additional1;

// Составить программу, которая определит площадь какого круга меньше.

public class Task10 {

	public static void main(String[] args) {

		double r1;
		double r2;
		double s1;
		double s2;

		r1 = 9.0;
		r2 = 17.6;

		s1 = Math.PI * Math.pow(r1, 2);
		s2 = Math.PI * Math.pow(r2, 2);

		if (s1 > s2)
			System.out.print("Площадь втрого круга меньше ");
		else
			System.out.print("Площадь первого круга меньше ");

	}
}
