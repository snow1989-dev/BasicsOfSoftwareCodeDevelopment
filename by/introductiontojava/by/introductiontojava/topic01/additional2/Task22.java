package by.introductiontojava.topic01.additional2;

/**
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
 * шагом h. Результат представить в виде таблицы, первый столбец которой –
 * значения аргумента, второй - соответствующие значения функции F(x) = sin^2(x)
 */

public class Task22 {

	public static void main(String[] args) {
		double a = 0.5;
		double b = 3.0;
		double h = 0.1;
		double F = 0.0;

		System.out.println("---------------");
		System.out.println("|  x   |   F  |");
		System.out.println("---------------");

		for (double x = a; x <= b; x += h) {
			F = x - Math.sin(x) * Math.sin(x);

			System.out.printf("|%-6.2f|%-6.2f|\n", x, F);
			System.out.println("---------------");
		}

	}

}

