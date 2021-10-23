package day1latih;

public class Anak1 extends Induk implements AktivitasPagi{
	
	@Override
	public void lari() {
		
	}
	
	//Override adalah child class melakukan implementasi ulang dari induk
	
	@Override
	public void makan() {
		System.out.print("Minum super class : ");
		super.minum();
		System.out.print("Minum this class : ");
		this.minum();
	}
	
	@Override
	public void minum() {
		System.out.println("Minum Susu");
	}
}
