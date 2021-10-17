package by.introductiontojava.topic01.section03;

import java.math.*;

//Составить программу нехождения произедения квадратов первых двухсот чисел.

public class Task04 {

	public static void main(String[] args) {

		long s = 1;

		for (int x = 1; x <= 200; x++) {
			int w = (int) Math.pow(x, 2);
			s *= w;
		}
		System.out.println("Произведение = " + s);

		BigInteger x = BigInteger.valueOf(1);
		for(int i = 2; i <= 200; i++) {
		    x = x.multiply(BigInteger.valueOf((long) i * i));
		}
		System.out.println("Произведение = " + x);
		
	}

}

