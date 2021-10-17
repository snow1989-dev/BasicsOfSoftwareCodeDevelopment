package by.introductiontojava.topic01.additional1;

/** Составит программу сравнения двух чисел 1 и 2. Если 1 меньше 2 - вывести 
 на экран 7, в противном случае - цифру 8.
 */
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner var = new Scanner(System.in);

		int x1;
		int x2;

		System.out.print("x1 >>");

		while (!var.hasNextInt()) {
			String str = var.nextLine();
			System.out.println("x1 >>");
		}

		x1 = var.nextInt();

		System.out.print("x2 >>");

		while (!var.hasNextInt()) {
			String str = var.nextLine();
			System.out.println("x2 >>");
		}

		x2 = var.nextInt();
		if (x1 < x2)
			System.out.println("7");
		else
			System.out.println("8");

	}

}
