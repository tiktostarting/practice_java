package quiz2;

public class matrix {
	public static void main(String[] args) {
		
		int a = 100;
		Integer b = 5000;
		
		
		matrix akses = new matrix();
		akses.target();
		akses.target(a);
		akses.target(b);
		
	}
	
	public void target() {
		System.out.println("ini kosong");
	}
	
	public void target(int a) {
		System.out.println("int primitif => "+ a);
	}
	
	public void target(Integer a) {
		System.out.println("Integer referens => "+ a);
	}
}
