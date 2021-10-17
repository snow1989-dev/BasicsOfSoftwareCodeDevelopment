package by.introductiontojava.topic01.additional1;

//Определить, делителем каких чисел a, b, c является число k.

public class Task20 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int k;

		a = 9;
		b = 11;
		c = 7;
		k = 3;

		if (a % k == 0)
			System.out.println("k является делителем числа а");
		if (b % k == 0)
			System.out.println("k является делителем числа b");
		if (c % k == 0)
			System.out.println("k является делителем числа а");
		if ((a % k != 0) && (b % k != 0) && (c % k != 0))
			System.out.println("k не является делителем чисел а, b, c");

	}
}

