package by.introductiontojava.topic01.section01.task05;

/** ���� ���������� ����� �, ������� ������������ ����������� ���������� �������
 * � ��������. ������ ������ �������� ������������ � �����, ������� � �������� 
 * � ��������� �����: ��� ����� SS�.*/
public class Time {

	public static void main(String[] args) {

		int T = 8200;
		int hour;
		int minute;
		int sec;

		sec = (T % 60); // 40 ������
		minute = T / 60 % 60; // 16 �����
		hour = T / 60 / 60; // 2 ����

		System.out.print(hour + "� " + minute + "��� " + sec + "�");

	}

}
