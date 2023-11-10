package day5;

public class ConMeo extends DongVat {
	//Inheritance has - a
	ConCho conCho = new ConCho();

	public void chay() {
		
		System.out.println(conCho.tiengSua);
		System.out.println("chay");
	}
	
	public void tiengSua() {
		conCho.tiengSua = "Gâu Gâu";
		System.out.println(conCho.tiengSua);
	}

}
