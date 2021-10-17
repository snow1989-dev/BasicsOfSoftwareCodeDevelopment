package by.introductiontojava.topic01.additional1;

/** Составит программу, которая определит по трем введенным сторонам, 
 * являяется ли данный треугольник равностороннним.
 */
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		 int a;
		 int b;
		 int c;
		 
		 System.out.print("a>>");
		 while (! scan.hasNextInt()){
			 @SuppressWarnings("unused")
			String str = scan.nextLine();
			 System.out.print("a>>");
		 }
		a = scan.nextInt();
		
		 System.out.print("b>>");
		 while (! scan.hasNextInt()){
			 @SuppressWarnings("unused")
			String str = scan.nextLine();
			 System.out.print("b>>");
		 }
		b = scan.nextInt();
		
		 System.out.print("c>>");
		 while (! scan.hasNextInt()){
			 @SuppressWarnings("unused")
			String str = scan.nextLine();
			 System.out.print("c>>");
		 }
		c = scan.nextInt();
		
		if ((a==b) && (b==c) && (c==a))
			System.out.println("Треугольник равносторонний");
		else
			System.out.println("Треугольник неравносторонний");
			
			

	}

}

