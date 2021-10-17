package by.introductiontojava.topic01.section01.task03;

/** Вычислить знаение выражения по формуле (все переменные принимают 
 *действительное значение): (sinx+cosy)/(cosx-siny)*tgxy.
 */

public class Expression2 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;

		x = 90.0;
		y = 90.0;

		z = Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y));
		z = z / Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y));
		z = z * Math.tan(Math.toRadians(x) * Math.toRadians(y));

		System.out.print(z);

	}

}
