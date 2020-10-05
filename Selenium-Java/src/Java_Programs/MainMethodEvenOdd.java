package Java_Programs;

import java.util.Scanner;

public class MainMethodEvenOdd {

	public static void main(String[] args) {
		
		//Creating Scanner Class Object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num");
		
		//Reading value from user
		int num = sc.nextInt();
		
		//method calling
		FindEvenOdd.findEvenOdd(num);
		

	}
}
