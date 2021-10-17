package by.introductiontojava.topic01.additional1;

/**
 * Даны два угла треугольника (в градусах. Определить сущестует ли такой
 * треугольник, и если да, то будет ли он прямоугольным.
 */
public class Task14 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;

		a = 90;
		b = 45;

		if ((a + b) < 180) {
			System.out.print("Треугольник сущствует");
			c = 180 - (a + b);
			if (a == 90 || b == 90 || c == 90)
				System.out.println(" и он прямоугольный");
			else
				System.out.println(" и он не прямоугольный");
		} else
			System.out.println("Треугольник не сущствует");

	}
}

