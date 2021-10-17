package by.introductiontojava.topic01.additional1;

//Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task26 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int max;
		int min;
		int sum;

		x = 1;
		y = 2;
		z = 3;

		System.out.println("x = " + x + " y = " + y + " z = " + z);

		if (x > y)
			max = x;
		else
			max = y;
		if (z > max)
			max = z;

		if (x < y)
			min = x;
		else
			min = y;
		if (z < min)
			min = z;

		sum = min + max;

		System.out.println("Сумма = " + sum);

	}

}


