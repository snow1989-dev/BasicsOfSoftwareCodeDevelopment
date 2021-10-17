package by.introductiontojava.topic01.additional1;

/** На плосксти XOY задана свими координатами точка А. Узнать, где она расположена 
(на какой оси или в каком координатном угле). 
*/

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		double x;
		double y;
		@SuppressWarnings("unused")
		String str;

		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);

		System.out
				.println("Введите x отделив целую часть от дробной \",\" >> ");

		while (var.hasNextDouble() == false) {
			str = var.nextLine();
			System.out
					.println("Введите x отделив целую часть от дробной \",\" >> ");
		}
		x = var.nextDouble();

		System.out
				.println("Введите y отделив целую часть от дробной \",\" >> ");

		while (var.hasNextDouble() == false) {
			str = var.nextLine();
			System.out
					.println("Введите y отделив целую часть от дробной \",\" >> ");
		}
		y = var.nextDouble();

		if (x == 0 && y == 0)
			System.out.println("Точка нахдится в начале кординат");
		else if ((x == 0) && (y > 0 || y < 0))
			System.out.println("Точка нахдится на оси Х");
		else if ((y == 0) && (x > 0 || x < 0))
			System.out.println("Точка нахдится на оси Y");
		else if (x > 0 && y > 0)
			System.out.println("Точка нахдится в первом кординатном углу");
		else if (x < 0 && y > 0)
			System.out.println("Точка нахдится во втором кординатном углу");
		else if (x < 0 && y < 0)
			System.out.println("Точка нахдится в трейтьем кординатном углу");
		else
			System.out.println("Точка нахдится в четвертом кординатном углу");

	}

}

