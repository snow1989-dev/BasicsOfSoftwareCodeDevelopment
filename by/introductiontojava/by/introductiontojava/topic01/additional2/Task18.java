package by.introductiontojava.topic01.additional2;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданному е. Общий член ряда имеет вид: an =
 * ((-1)^n-1)/n
 */

public class Task18 {

	public static void main(String[] args) {

		double e = 0.1;
		double an = 0.0;
		double min = 5;
		double max = 15;
		double sum = 0.0;

		for (double n = min; n <= max; n += 1.5) {
			an = Math.pow(-1, n - 1) / n;
			System.out.println(an);
			if (Math.abs(an) >= e)
				sum += an;
		}
		System.out.println("Сумма = " + sum);

	}
}
