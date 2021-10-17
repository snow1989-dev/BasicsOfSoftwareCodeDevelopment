package by.introductiontojava.topic01.additional1;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		char a = 'Д';
		char b = 'М';
		char d;
		String c;

		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);

		System.out.println("Кто ты: мальчик или девочка? Введи Д или М >>");
		
		while (!var.hasNext("[МД]")){
			var.nextLine();
			System.out.println("Кто ты: мальчик или девочка? Введи Д или М >>");
		}
		c = var.next();
		d = c.charAt(0);
		if (d == a)
			System.out.println("Мне нравятся мальчики ,)");
		else if (d == b)
			System.out.println("Мне нравятся девочки ,)");
	}

}

