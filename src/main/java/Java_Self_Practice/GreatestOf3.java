package Java_Self_Practice;

import java.util.Scanner;

public class GreatestOf3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("num 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("num 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("num 3: ");
		int n3 = sc.nextInt();
		
		
		if(n1>n2 && n1>n3)
			System.out.println(n1 +" is greater");
		else if(n2>n3)
			System.out.println(n2 +" is greater");
		else
			System.out.println(n3 +" is greater");

	}

}
