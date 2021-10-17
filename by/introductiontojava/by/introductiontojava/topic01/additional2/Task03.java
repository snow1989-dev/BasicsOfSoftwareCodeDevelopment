package by.introductiontojava.topic01.additional2;

//Необходимо вывести на экран таблицу умножения на 3.

public class Task03 {
	public static void main(String[] args) {

		int x = 1;
		int znachenie = 0;

		while (x <= 10) {
			znachenie = x * 3;
			System.out.println(x + " * 3 = " + znachenie);
			x = x + 1;

		}

	}

}

