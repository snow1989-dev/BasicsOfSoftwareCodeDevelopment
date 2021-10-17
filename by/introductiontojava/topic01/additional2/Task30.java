package by.introductiontojava.topic01.additional2;

import java.util.Scanner;

//Напишите программу, переводящую римские цифры в арабские.

public class Task30 {

	public static void main(String[] args) {

		String numberRome;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите римскую цифру: ");
		numberRome = sc.next();

		switch (numberRome) {
		case ("I"):
			System.out.print("Римское цифра: " + numberRome
					+ ", сответствует арабской цифре: 1.");
			break;
		case ("V"):
			System.out.print("Римское цифра: " + numberRome
					+ ", сответствует арабской цифре: 5.");
			break;
		case ("X"):
			System.out.print("Римское цифра: " + numberRome
					+ ", сответствует арабской цифре: 10.");
			break;
		case ("L"):
			System.out.print("Римское цифра: " + numberRome
					+ ", сответствует арабской цифре: 50.");
			break;
		case ("C"):
			System.out.print("Римское цифра: " + numberRome
					+ ", сответствует арабской цифре: 100.");
			break;
		case ("D"):
			System.out.print("Римское цифра: " + numberRome
					+ ", сответствует арабской цифре: 500.");
			break;
		case ("M"):
			System.out.print("Римское цифра: " + numberRome
					+ ", сответствует арабской цифре: 1000.");
			break;
		}

	}

}
