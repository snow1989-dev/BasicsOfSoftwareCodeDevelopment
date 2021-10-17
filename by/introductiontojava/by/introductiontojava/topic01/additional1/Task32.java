package by.introductiontojava.topic01.additional1;

/**
 * Написать программу, которая по заданным трем числам определяет, является ли
 * сумма каких-либо двух чиз них положительной.
 */

public class Task32 {

	public static void main(String[] args) {

		double x1;
		double x2;
		double x3;

		x1 = 7;
		x2 = 77;
		x3 = -6;

		if ((x1 + x2) > 0)
			System.out.println("(x1 + x2) > 0");
		if ((x1 + x3) > 0)
			System.out.println("(x1 + x3) > 0");
		if ((x1 + x3) > 0)
			System.out.println("(x2 + x3) > 0");
		else
			System.out.println("Ни одна из сумм не является положительной");

	}

}

