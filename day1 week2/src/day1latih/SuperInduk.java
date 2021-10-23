package day1latih;

public abstract class SuperInduk extends SuperDuperInduk{
	
	public abstract Integer makan(String makan);
	
	public Integer makan(Integer harga) {
		return null;
	}
	
	@Override
	public void minum() {
		super.minum();
	}

}
