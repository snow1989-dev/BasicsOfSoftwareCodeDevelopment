package by.introductiontojava.topic01.additional1;

/**
 * Даны три дейтвительных числа.Возвести в квадрат те из них, знаения которых
 * неотрицательны, и в четвертую степень - отрицательные.
 */
public class Task12 {
	public static void main(String[] args) {
		double x1;
		double x2;
		double x3;
		double degree1;
		double degree2;
		double degree3;

		x1 = -2.33;
		x2 = 4.0;
		x3 = -58.58;
		
		degree1 = x1 > 0 ? Math.pow(x1, 2) : Math.pow(x1, 4);
		degree2 = x2 > 0 ? Math.pow(x2, 2) : Math.pow(x2, 4);
		degree3 = x3 > 0 ? Math.pow(x3, 2) : Math.pow(x3, 4);
		System.out.print(degree1 + ", " + degree2 + ", " + degree3);

	}

}
