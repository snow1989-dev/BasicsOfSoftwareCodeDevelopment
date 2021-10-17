package by.introductiontojava.topic01.additional2;

import java.util.Scanner;

/**
 * Написать программу, в которой вводится два операнда X и Y и знак операции
 * (+,-,*,/). Вычислить результат Z в зависимости от знака. Предусмотреть
 * реакции на возможный не верный знак операции, а также на ввод Y = 0 при
 * делении. Организовать возможность многократных вычислений без перегрузки
 * программы (тоесть построить цикл). В качестве символа прекращения вычисления
 * вычислений приять ‘0’.
 */

public class Task28 {

	public static void main(String[] args) {

		char sing;
		double operandX;
		double operandY;
		double resultZ;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите знак операции: ");
		sing = sc.next().charAt(0);

		if ((sing != '*') && (sing != '/') && (sing != '-') && (sing != '+')
				&& (sing != '0')) {
			@SuppressWarnings("unused")
			String s = sc.nextLine();
			System.out.println("Вы ввели не верный знк операции!");
			System.out.print("Введите знак операции: ");
			sing = sc.next().charAt(0);
		}

		while ((sing == '*') || (sing == '/') || (sing == '-') || (sing == '+')
				|| (sing == '0')) {
			System.out.print("Введите первый операнд: ");
			while (!sc.hasNextDouble()) {
				@SuppressWarnings("unused")
				String s = sc.nextLine();
				System.out.print("Введите первый операнд: ");
			}
			operandX = sc.nextDouble();

			System.out.print("Введите второй операнд: ");
			while (!sc.hasNextDouble()) {
				String s = sc.nextLine();
				System.out.print("Введите второй операнд: ");
			}
			operandY = sc.nextDouble();

			if (sing == '*') {
				resultZ = operandX * operandY;
				System.out.println("Результат умножения: " + resultZ);
				System.out.print("Введите знак операции: ");
				sing = sc.next().charAt(0);
				if ((sing != '*') && (sing != '/') && (sing != '-')
						&& (sing != '+') && (sing != '0')) {
					String s = sc.nextLine();
					System.out.println("Вы ввели не верный знк операции!");
					System.out.print("Введите знак операции: ");
					sing = sc.next().charAt(0);
				}
			} else if (sing == '/') {
				if (operandY != 0) {
					resultZ = operandX / operandY;
					System.out.println("Результат умножения: " + resultZ);
					System.out.print("Введите знак операции: ");
					sing = sc.next().charAt(0);
					if ((sing != '*') && (sing != '/') && (sing != '-')
							&& (sing != '+') && (sing != '0')) {
						String s = sc.nextLine();
						System.out.println("Вы ввели не верный знк операции!");
						System.out.print("Введите знак операции: ");
						sing = sc.next().charAt(0);
					}
				} else
					System.out.println("На 0 делить нельзя!!!!!");
				System.out.print("Введите знак операции: ");
				sing = sc.next().charAt(0);
				if ((sing != '*') && (sing != '/') && (sing != '-')
						&& (sing != '+') && (sing != '0')) {
					String s = sc.nextLine();
					System.out.println("Вы ввели не верный знк операции!");
					System.out.print("Введите знак операции: ");
					sing = sc.next().charAt(0);
				}
			} else if (sing == '+') {
				resultZ = operandX + operandY;
				System.out.println("Результат сложения: " + resultZ);
				System.out.print("Введите знак операции: ");
				sing = sc.next().charAt(0);
				if ((sing != '*') && (sing != '/') && (sing != '-')
						&& (sing != '+') && (sing != '0')) {
					String s = sc.nextLine();
					System.out.println("Вы ввели не верный знк операции!");
					System.out.print("Введите знак операции: ");
					sing = sc.next().charAt(0);
				}
			} else if (sing == '-') {
				resultZ = operandX - operandY;
				System.out.println("Результат разности: " + resultZ);
				System.out.print("Введите знак операции: ");
				sing = sc.next().charAt(0);
				if ((sing != '*') && (sing != '/') && (sing != '-')
						&& (sing != '+') && (sing != '0')) {
					String s = sc.nextLine();
					System.out.println("Вы ввели не верный знк операции!");
					System.out.print("Введите знак операции: ");
					sing = sc.next().charAt(0);
				}
			} else if (sing == '0') {
				System.out.println("Завершение программы!");
				break;

			}
		}
	}
}
