package vechile_oops;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the vechile Model");
		int m=sc.nextInt();
		System.out.println("enter the Vechile engine");
		int e=sc.nextInt();
		System.out.println("enter the vechile color");
		String s=sc.next();
		System.out.println("enter the vechile type");
		String t=sc.next();
		System.out.println("enter the no.of passengers");
		int p=sc.nextInt();
		System.out.println("enter the fuel type");
		String z=sc.next();
		bike b=new bike(m,e,s,t);
		b.bikeOutput();
		
		
	}
}
