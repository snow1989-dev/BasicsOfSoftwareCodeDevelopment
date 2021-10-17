package by.introductiontojava.topic01.additional1;

/**
 * Напишите программу - модель анализа пожарного датчика в помещении, которая
 * выводит сообщение "Пожарная ситуация", если температура превышает 60 градусов
 * цельсия
 */

public class Task25 {

	public static void main(String[] args) {

		int t;
		t = 61;

		if (t <= 60)
			System.out.print("Все впорядке!");
		else
			System.out.print("Пожарная ситуация!");

	}

}
