package day1;

public class Operators {
	//Exe 1
//	 public static void printTest(String [] args) 
//	    {
//	        int x=20;
//	        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
//	        System.out.println(sup);
//	    }

//Exe 2
	public void testData(String[] args) {
		int inputDistance = 2500;
		int inputHour = 5;
		int inputMin = 56;
		int inputSecond = 23;
		int time = inputHour*3600 + inputMin*60 +inputSecond;
		int timeHour = inputHour + inputMin/60 + inputSecond/3600;
		double result = Math.round((double)inputDistance/(double)time* 100000000d) / 100000000d;
		System.out.println("Your speed in meters/second is " + result );
		int inputKilometer = inputDistance/1000;
		double result2 = Math.round((double)inputKilometer/(double)timeHour* 100000000d) / 100000000d;
		System.out.println("Your speed in meters/second is " + result2 );
		int inputMiles = inputDistance/1609;
		double result3 = Math.round((double)inputMiles/(double)timeHour* 100000000d) / 100000000d;
		System.out.println("Your speed in meters/second is " + result3 );
		
	}
	
//Exe 3
	public void testData2(String[] args) {
		int inputNumber1 = 25;
		int inputNumber2 = 5;
		int inputSum = inputNumber1 + inputNumber2;
		System.out.println("Sum of two integers: " + inputSum);
		int inputDifference = inputNumber1 - inputNumber2;
		System.out.println("Difference of two integers: " + inputDifference);
		int inputProduct = inputNumber1 * inputNumber2;
		System.out.println("Product of two integers: " + inputProduct);
		double inputAverage = Math.round(((((double)inputNumber1 + (double)inputNumber2)/2)* 100) / 100);
		System.out.println("Average of two integers: " + inputAverage);
		int inputMax = Math.max(inputNumber1, inputNumber2);
		System.out.println("Max integer: " + inputMax);
		int inputMin = Math.min(inputNumber1, inputNumber2);
		System.out.println("Min integer: " + inputMin);

		}
//Exe 4
	public void testBreak(String[] args) {
		int input = 123456;
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
      System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
	}

}