package by.introductiontojava.topic01.section01;

/**
 * Дано натуральне число Т, которое представляет длительнсть прошедшего времени
 * в секундах. Вывети данное значение длительности в часах, минутах и секундах в
 * следующей форме: ННч ММмин SSс.
 */

public class Task05 {

	public static void main(String[] args) {
		int T = 8200;
		int hour;
		int minute;
		int sec;

		sec = (T % 60); // 40 секунд
		minute = T / 60 % 60; // 16 минут
		hour = T / 60 / 60; // 2 часа

		System.out.print(hour + "ч " + minute + " мин " + sec + "с");

	}

}


	