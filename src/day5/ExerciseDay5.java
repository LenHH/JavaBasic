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
		int count =0;
		for(int i = 111; i<=8899; i++) {
			sum = sum+i;
		}
		System.out.println("The sum is " + sum);
		float average = 0;
		Double average1 = (double)sum/(double)count;
		System.out.println("The average " + Math.round(average1*100.0)/100.0);
	}
}
