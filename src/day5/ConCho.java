package day5;

public class ConCho extends DongVat {
	String tiengSua;
//Overriding
	public void chay() {
		System.out.println("Gâu Gâu");
	}
	public void sua() {
		System.out.println("Gâu Gâu");
	}
	
//OverLoading
	public void chay(String tiengChay) {
		System.out.println("Gâu Gâu");
	}
}
