package by.introductiontojava.topic01.additional2;

//Составить программу нехождения разности кубов первых двухсот чисел.

import java.math.BigInteger;

@SuppressWarnings("unused")
public class Task11 {

	public static void main(String[] args) {

		long s = 1;

		for (int x = 1; x <= 200; x++) {
			long w = (long) Math.pow(x, 3);
			s -= w;
		}
		System.out.println("Разность = " + s);
	}

}
