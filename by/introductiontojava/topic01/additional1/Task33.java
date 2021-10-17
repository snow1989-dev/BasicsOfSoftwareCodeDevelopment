package by.introductiontojava.topic01.additional1;

import java.util.Scanner;

/**
 * Написат программу, которая по паролю будет определять ровень доступа
 * сотрудника к секретной информации в базе данных. Доступ к базе имеют только 6
 * человек, разбитые на 3 группы по степени доступа. Они имеют следующие пароли:
 * 9583, 1747 - доступны модули баз A, B, C; 3331, 7922 - дступны модули баз -
 * B, C: 9455, 8997 - доступен модуль базы C.
 */

public class Task33 {

	public static void main(String[] args) {
		int password;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите пароль: ");

		while (!sc.hasNextInt()) {
			@SuppressWarnings("unused")
			String s = sc.nextLine();
			System.out.println("Введите пароль: ");

		}

		password = sc.nextInt();

		if (password == 9583 || password == 1747)
			System.out.println("Вам доступны модули баз данных: A, B, C");
		else if (password == 3331 || password == 7922)
			System.out.println("Вам доступны модули баз данных: B, C");
		else if (password == 9455 || password == 8997)
			System.out.println("Вам доступны модулm базs данных: C");
		else
			System.out.println("Вами введен не верный пароль");

	}

}
