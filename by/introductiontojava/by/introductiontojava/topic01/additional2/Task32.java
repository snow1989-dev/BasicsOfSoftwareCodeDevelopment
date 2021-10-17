package by.introductiontojava.topic01.additional2;

import java.util.Scanner;

/**
 * Проверить введенную пользовательскую строку на наличие недопустимых символов.
 * В качестве первого символа бопустимы только буквы и знак подчеркивания.
 * Остальные символы могут быть буквами, цифрами и знаком подчеркивани
 */

public class Task32 {

	public static void main(String[] args) {

		String stroka;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите строку: ");
		stroka = sc.nextLine();
		char[] ch = stroka.toCharArray();

		for (int i = 0; i < ch.length; i++)
			System.out.println("Element [" + i + "]: " + ch[i]);

	}

}
