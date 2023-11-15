package day5;

public class ExerciseDay5 {
//Exe A1
	public static void printDayofWeek(int n) {
		switch (n) {
		case 2:
			System.out.println("Thứ Hai");
			break;
		case 3:
			System.out.println("Thứ Ba");
			break;
		case 4:
			System.out.println("Thứ Tư");
			break;
		case 5:
			System.out.println("Thứ Năm");
			break;
		case 6:
			System.out.println("Thứ Sáu");
			break;
		case 7:
			System.out.println("Thứ Bảy");
			break;
		case 8:
			System.out.println("Chủ Nhật");
			break;
			default:
			System.out.println("Nhập lại n: ");
			break;
		}
	}
//Exe A2
//	public static void printLocator(String LocatorType, String LocatorValue) {
//		Object result;
//		
//		switch(LocatorType) {
//			case "id":
//				result = By.id(LocatorValue);
//				break;
//			default:
//				System.out.println("abc");
//		}
    
   static void myMethod(String LocatorType, String LocatorValue) {
        String result = "Ahihi";
        
        switch (LocatorType) {
            default:
                result = "By." + LocatorType + "(" + LocatorValue + ")";
                break;
        }
        
        System.out.println(result);
    }

	
	
//Exe B1
	public static void printMang() {
			int a[];
			a = new int[5];
			a[0]=1;
			a[1]=3;
			a[2]=5;
			a[3]=8;
			a[4]=9;
			for(int i=0; i<a.length; i++) {

				System.out.println("["+ i + "]" + a[i]);
			}
			}
		
//Exe B2
	public static void sumAndAverage() {
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum = sum+i;
		}
		System.out.println("The sum is " + sum);
		float average;
		average = (float)(sum/100);
		System.out.println("The average " + average);
}
	
//Exe B3
	public static void sumAndAverage2() {
		int sum = 0;
		int count = 0;
		for(int i = 111; i<=8899; i++) {
			sum = sum+i;
			count++;
		}
		System.out.println("The sum is " + sum);
		double average1 = (double)sum/(double)count;
		System.out.println("The average " + (double)Math.round(average1 * 100) / 100);
		//System.out.println("The average " + count);
	}
	
//Exe B4
	public static void sumAndAverageEx3() {
		int sum = 0;
		int count = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				sum = sum+i;
				count++;
			}
		}
		System.out.println("The sum is " + sum);
		double average1 = (double)sum/(double)count;
		System.out.println("The average " + (double)Math.round(average1 * 100) / 100);
	}
//Exe B5
	public static void sumAndAverageEx4() {
		int sum = 0;
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i%7==1) {
				sum = sum + i;
				count ++;
			}
		}
		System.out.println("The sum is " + sum);
		System.out.println("The sum is " + count);
		double average2 = (double)sum/(double)count;
		System.out.println("The average " + (double)Math.round(average2 *100)/100);
	}
//Exe B6
	public static void sumPow() {
		double sum = 0;
		double pow = 0;
		for(int i=1; i<=100; i++) {
			pow = Math.pow(i,2);
			sum = sum + pow;
		}
		System.out.println("The sum is " + sum);		
	}
	
//Exe B7
	public static void sumHarmonic() {
		double sum = 0;
		double harmonic = 0;
		int n = 50000;
		for(int i=1; i<=n; i++) {
			harmonic = (double) 1 / i;
			sum = sum + harmonic;
		}
		System.out.println("The sum is " + sum);
	}
	
//Exe B8
	public static void squareBoard(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
//Exe B9
	public static void checkerBoard(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				System.out.print(" #");
			}
			System.out.println("");
		}
	}
	
//Exe B10
	public static void printString() {
		float result = -1;
		String keyword = "r";
		String input = "Hello Wordl";
		char[] catChuoi = input.toCharArray();
		//System.out.println(catChuoi[0]);
		int index = 0;
		while(index < catChuoi.length) {
			if(catChuoi[index] == keyword.charAt(0)) {
				result = index;
			}
			index++;
		}
		
		if (result == -1) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println((int)result);
		}
	}
	
//C1
	public static void isOdd(int number) {
		if (number%2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}
	
//C2
	public static void hasEight(int number) {
		String input = Integer.toString(number);
		if (input.contains("8")) {
			System.out.println(number + " is True");
		} else {
			System.out.println(number + " is False");
		}
	}
	
//C3
	public static void magicSum(int number) {
		String input = Integer.toString(number);
		int a = -1;
		System.out.println("Enter a positive integer or -1 to exit:");
		while (a == -1) {
			System.out.println("Enter a positive integer or -1 to exit:");
			break;
		}
		System.out.println(a);
	}
}
