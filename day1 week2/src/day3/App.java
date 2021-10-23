package day3;

public class App {
	public static void main(String[] args) {
		App app = new App();
		app.printData(new String[] {"data1", "data2"});
		app.printData2("data1", "data2");

	}
	
	public void printData(String[] data) { //VarArgs
		for(int i = 0; i < data.length; i++) {
			//cara manual
		}
		
		for(String item : data) {
			//sejenis foreach
			System.out.println(item);
		}
	}
	
	public void printData2(String... data) {
		for(String item : data) {
			//sejenis foreach
			System.out.println(item);
		}
	}
	
	//OverLoading mencari yang non-VarArgs
}
