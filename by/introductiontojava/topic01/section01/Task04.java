package by.introductiontojava.topic01.section01;

/**
 * Дано действительное число R вида nnn.ddd (три цифры разряда в дробной и целой
 * частях). Поменят местами дробную и целую части числа и вывести полученное
 * значение числа.
 */

public class Task04 {

	public static void main(String[] args) {
		double R = 111.222;
		double temp1;
		double temp2;
		double rezult;

		temp1 = (R * 1000) % 1000; // 222.0
		temp2 = (int) R / 1000.0; // 0.111
		rezult = temp1 + temp2;

		System.out.print(rezult);

	}

}
