package by.introductiontojava.topic01.section01.task06;

import java.util.Scanner;

/** ��� ������ ������� ��������� �������� ���������,������� �������� true, 
 * ���� ����� � ������������ (x, y) ����������� ����������� �������,
 *  � false -  � ��������� ������. 
*/

public class LinearProgram {

	public static void main(String[] args) {

		Scanner var = new Scanner(System.in);

		double x;
		double y;
		boolean f;
		String str;

		System.out.print("x>>"); /*
								 * ���� ����� ���� double: ��������� ����� �����
								 * �� ������� ",", �� "."!!!!!!
								 */

		while (var.hasNextDouble() == false) {
			str = var.nextLine();
			System.out.print("x>>");
		}
		x = var.nextDouble();

		System.out.print("y>>"); /*
								 * ���� ����� ���� double: ��������� ����� �����
								 * �� ������� ",", �� "."!!!!!!
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
