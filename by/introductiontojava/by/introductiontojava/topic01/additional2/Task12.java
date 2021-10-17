package by.introductiontojava.topic01.additional2;

/**
 * Последовательность аn строится так: а1 = 1, an =6 + аn-1 , для каждого n > 1.
 * Составьте программу нахождения произведения первых 10 членов этой
 * последовательности.
 */

public class Task12 {

	public static void main(String[] args) {

		int a = 1;
		double p = 1;

		for (int i = 2; i <= 10; i++) {
			a = a + 6;
			p = p * a;
		}
		System.out.println("Произведение = " + p);

	}

}
