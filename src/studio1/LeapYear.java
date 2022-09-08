package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What year is it?");
		int year = in.nextInt();
		int modul = year%4;
		int hundred = year%100;
		int four = year%400;
		
		boolean isOrdered = (modul == 0) && (hundred != 0 ) || (four == 0);																												
		System.out.println(year + " is a leap year: " + isOrdered);
	}

}
