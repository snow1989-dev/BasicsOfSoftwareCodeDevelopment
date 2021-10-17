package by.introductiontojava.topic01.additional1;

/**
 * Даны две точки А(х1, у1) и В (х2, у2). Составьте алгортм определяющий,
 * которая из точек находится ближе к началу координат.
 */
public class Task13 {
	public static void main(String[] args) {
		double x1; // точка А.
		double x2; // точка В.
		double y1; // точка А.
		double y2; // точка В.
		double distance1;
		double distance2;

		x1 = 1.0;
		x2 = 2.0;
		y1 = 1.0;
		y2 = 2.0;

		distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		if (distance1 < distance2)
			System.out.print("точка А ближе");
		else
			System.out.print("точка В ближе");

	}

}
