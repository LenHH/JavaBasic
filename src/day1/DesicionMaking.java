package day1;
import java.util.Scanner;

public class DesicionMaking {
////Exe 1
//	public static void testSum(String[] Strings) {
//		 Scanner input = new Scanner(System.in);
//
//	        System.out.print("Input an integer between 0 and 1000: ");
//	        int num = input.nextInt();
//	        int munber1 = num % 10;
//	        int sumNumber = num / 10;
//	        int number2 = sumNumber % 10;
//	        sumNumber = sumNumber / 10;
//	        int number3 = sumNumber % 10;
//	        sumNumber = sumNumber / 10;
//	        int number4 = sumNumber % 10;
//	        int sum = number3 + number2 + munber1 + number4;
//	        System.out.println("The sum of all digits in " + num + " is " + sum);
//
//	}
//	
////Exe 2
//	public static void testMin(String[] Strings) {
//		 Scanner input1 = new Scanner(System.in);
//		 int numMin = 60 * 24 * 365;
//
//	        System.out.print("Input the number of minutes: ");
//
//	        double min = input1.nextDouble();
//
//	        long years = (long) (min / numMin);
//	        int days = (int) (min / 60 / 24) % 365;
//
//	        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
//	}

//	}
	public void testSum(int n1) {
		int n = 565;
		String nstring = Integer.toString(n);
		int sum = 0; 
		for(int i=0; i< nstring.length(); i++) {
			char x = nstring.charAt(i);
			int convertX = Character.getNumericValue(x);
			sum = sum + convertX;
		}
		System.out.println(nstring);
		System.out.println(sum);
		
	}
}
