package by.introductiontojava.topic01.additional1;

/**
 * Даны три точки А(х1, у1), В(х2, у2), С(х3. у3). Определить будут ли они
 * расположены на одной прямой.
 */

public class Task29 {

	public static void main(String[] args) {
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;

		x1 = 5;
		x2 = 7;
		x3 = 9;
		y1 = 4;
		y2 = 6;
		y3 = 8;

		if (((x3 - x1) / (x2 - x1) - (y3 - y1) / (y2 - y1)) == 0)
			System.out.println("Точки расположены на одной прямой");
		else
			System.out.println("Точки не расположены на одной прямой");
	}
}

