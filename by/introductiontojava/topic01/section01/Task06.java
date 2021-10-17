package by.introductiontojava.topic01.section01;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу,которая печатает true, если
 * точка с координатами (x, y) пренадлежит закрашенной области, и false - в
 * противном случае.
 */

public class Task06 {

	public static void main(String[] args) {

		Scanner var = new Scanner(System.in);

		double x;
		double y;
		boolean f;
		String str;

		System.out.print("x>>"); /*
								 * Ввод числа типа double: отделения целой части
								 * от дробной ",", НЕ "."!!!!!!
								 */

		while (var.hasNextDouble() == false) {
			str = var.nextLine();
			System.out.print("x>>");
		}
		x = var.nextDouble();

		System.out.print("y>>"); /*
								 * Ввод числа типа double: отделения целой части
								 * от дробной ",", НЕ "."!!!!!!
								 */
		while (var.hasNextDouble() == false) {
			str = var.nextLine();
			System.out.print("y>>");
		}
		y = var.nextDouble();

		f = ((x <= 4 & x >= -4) & (y <= 4 & y >= -3));
		System.out.println("f = " + f);
	}
}