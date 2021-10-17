package by.introductiontojava.topic01.additional2;

/**
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
 * шагом h. Результат представить в виде таблицы, первый столбец которой –
 * значения аргумента, второй - соответствующие значения функции F(x) = ctg(x/3)
 * + sin(x)/2
 */

public class Task23 {

	public static void main(String[] args) {
		double a = 0.0;
		double b = 6.0;
		double h = 0.5;
		double F = 0.0;

		System.out.println("---------------");
		System.out.println("|  x   |   F  |");
		System.out.println("---------------");

		for (double x = a; x <= b; x += h) {
			F = 1 / Math.tan(x / 3) + Math.sin(x) / 2;

			System.out.printf("|%-6.2f|%-6.4f|\n", x, F);
			System.out.println("---------------");
		}

	}

}

