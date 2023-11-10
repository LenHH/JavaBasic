package day4;

import java.util.ArrayList;

public class ArrayExample {
	public static void printArray() {
		int a[];
		a = new int[6];
		a[0]=7;
		a[1]=8;
		a[2]=9;
		a[3]=4;
		a[4]=3;
		a[5]=2;
		for(int i=0; i<a.length; i++) {

			System.out.println("["+ i + "]" + a[i]);
		}
		
		}
	public static void printString() {
		String name[];
		name = new String[3];
		name[0] = "Lan";
		name[1]= "Mai";
		name[2] = "Nga";
			System.out.println("name = " + name[name.length-1]);
		}
	
	public static void printArray2D() {
		int a[][] = new int[3][4];
		a[0][0] = 4;
		a[0][1] = 5;
		a[0][2] = 4;
		a[0][3] = 3;
		a[1][0] = 7;
		a[1][1] = 4;
		a[1][2] = 1;
		a[1][3] = 4;
		a[2][0] = 6;
		a[2][1] = 3;
		a[2][2] = 3;
		a[2][3] = 5;
		for(int i=0; i< a.length;i++) {
			for(int j=0; j< a[0].length; j++) {
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
	}
	
	public static void printNameList() {
//		ArrayList<Integer> diems = new ArrayList<Integer>();
//		//Thêm phần tử vào mảng
//		diems.add(3); // gán giá trị 3 vào mảng
		
		ArrayList<String> diems = new ArrayList<String>();
		diems.add("Lan"); 
		diems.add("Lan1");
		diems.add("Lan2"); 
		diems.add("Lan3"); 
		
//		for( int i= 0; i< diems.size(); i++) {
//			System.out.println();
//		}
//		
//		for (String s: diems) {
//			System.out.println(s);
//		}
		
		diems.get(diems.size()-1);
		//System.out.println(s);
	}
}
	

