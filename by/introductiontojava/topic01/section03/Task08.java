package by.introductiontojava.topic01.section03;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task08 {

	public static void main(String[] args) {

		int number1 = 123;
		int number2 = 987;

		System.out.print("Число №1: " + number1
				+ ". Оно состоит из следующих цифр:");
		while (number1 > 0) {
			System.out.print(" " + number1 % 10);
			number1 /= 10;
		}
		System.out.println(".");

		System.out.print("Число №2: " + number2
				+ ". Оно состоит из следующих цифр:");
		while (number2 > 0) {
			System.out.print(" " + number2 % 10);
			number2 /= 10;
		}
		System.out.println(".");

	}

}


