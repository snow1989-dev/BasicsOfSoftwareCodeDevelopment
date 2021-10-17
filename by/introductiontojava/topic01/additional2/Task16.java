package by.introductiontojava.topic01.additional2;

//Вычислить : (1+2)*(1+2+3)*...*(1+2+3+...+10).

public class Task16 {

	public static void main(String[] args) {

		long t = 1L;
		int t1 = 0;
		for (int i = 1; i <= 10; i++) {
			t1 += i;
			System.out.println(t1);
			t *= t1;
		}
		System.out.println("Произведение = " + t);

	}

}

