package by.introductiontojava.topic01.additional1;

/**
 * Перераспределить значения переменных x и y так, чтобы в x осталось большее из
 * этих значений, а в y - меньшее.
 */

public class Task22 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;

		x = 7;
		y = 17;

		if (x > y)
			System.out.print("x > y, x = " + x + "; y = " + y + ".");
		else {
			z = x;
			x = y;
			y = z;
			System.out.print("x > y, x = " + x + "; y = " + y + ".");
		}

	}

}
