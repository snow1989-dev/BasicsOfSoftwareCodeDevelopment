package by.introductiontojava.topic01.additional2;

//Составить таблицу значений функции y = 5 - x^2 / 2 на отрезке [-5; 5] с шагом 0.5.

public class Task13 {

	public static void main(String[] args) {

		double y;

		for (double x = (-5); x <= 5; x += 0.5) {
			y = 5 - (x * x) / 2.0;
			System.out.println("При x = " + x + " y = " + y);
		}

	}

}
