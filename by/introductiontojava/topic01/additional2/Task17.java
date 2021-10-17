package by.introductiontojava.topic01.additional2;

//Даны действительное а и натуральное n. вычислить: a(a+1)...(a+n-1).

public class Task17 {

	public static void main(String[] args) {

		double a = 3.5;
		int n = 10;
		double com = 1;

		for (int i = 0; i < n; i++) {
			double d = a + i;
			System.out.println(d);
			com *= d; 
		}
		System.out.println("Произведение = " + com);

	}

}

