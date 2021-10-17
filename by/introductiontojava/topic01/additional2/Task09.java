package by.introductiontojava.topic01.additional2;

//Найти сумму квадратов первых ста чисел.

public class Task09 {

	public static void main(String[] args) {

		int sum = 0;

		for (int x = 1; x <= 100; x++) {
			sum += (x * x);
		}
		System.out.println("Сумма = " + sum);

	}

}
