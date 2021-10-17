package by.introductiontojava.topic01.additional1;

/**
 * Даны действительные числа x и y не равные друг другу. Меньшее из этих двух
 * чисел заменить половиной их суммы, а большее - их удвоенным произведением.
 */

public class Task15 {
	public static void main(String[] args) {

		double x;
		double y;
		double c;

		x = 18.9;
		y = 9.9;

		if (x > y) {
			c = (x + y) / 2;
			x = x * y * 2;
			y = c;
			System.out.print("x = " + x + "; " + "y = " + y);
		} else if (y > x) {
			c = (x + y) / 2;
			y = x * y * 2;
			x = c;
			System.out.print("x = " + x + "; " + "y = " + y);
		} else
			System.out.print("x = y");

	}
}
