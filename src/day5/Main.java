package day5;

public class Main {

	public static void main(String[] args) {
		//practiceObject();
		//practiceInheritance();
		//ConCho conChoDom = new ConCho();
		//conChoDom.chay();
		ExerciseDay5 Exe = new ExerciseDay5();
		//Exe.printDayofWeek(3);
		//Exe.myMethod("id", "FisrtName");
		//Exe.printMang();
		//Exe.sumAndAverage();
		Exe.sumAndAverage2();
		
	}
	
	public static void practiceObject() {
		ConCho conChoDom = new ConCho(); //Khởi tạo đối tượng là con chó đốm
		conChoDom.mauLong = "Màu Đốm";
		//conChoDom.chay();
		System.out.println(conChoDom.mauLong);
		
		ConCho conChoDen = new ConCho(); //Khởi tạo đối tượng là con chó đốm
		conChoDen.mauLong = "Màu Đen";
		//conChoDom.chay();
		System.out.println(conChoDen.mauLong);
	}
	public static void practiceInheritance() {
		ConChim conChim = new ConChim();
		conChim.mauLong = "Màu lông chim";
		System.out.println(conChim.mauLong);
		ConMeo conMeo = new ConMeo();
		conMeo.mauLong = "Màu lông mèo";
		System.out.println(conMeo.mauLong);
	}


}
