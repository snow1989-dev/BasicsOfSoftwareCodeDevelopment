package by.introductiontojava.topic01.section01.task04;

/**���� �������������� ����� R ���� nnn.ddd (��� ����� ������� � ������� � ����� ������). 
 *������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
 */
public class Namber {

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
