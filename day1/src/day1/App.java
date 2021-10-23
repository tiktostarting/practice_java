package day1;

import java.util.Scanner;

public class App {

	public String nama;
	// modifier tipe_data nama_variable

	public int jumlah = 100;
	// tipe data integer

	public static void main(String[] args) {
		// ini didalam method main

		int a = 100; // data tipe primitif (mempunyai nilai default)

		Integer b = a; // autoboxing Ini tipe data reference (defaultnya Null)

		int c = b; // unboxing

		long d = c; // upcasting
		int e = (int) d;// downcasting

		Scanner scan = new Scanner(System.in);

		System.out.print("Masukan nama anda: ");
		String nama = scan.nextLine();

		System.out.printf("Namamu adalah : %s \n", nama);

		System.out.print("\nMasukan skor anda: ");
		Integer skor = scan.nextInt();

		String hasil = penilaian(skor);

		System.out.printf("%s \n", hasil);
		
		App app1 = new App();
		app1.makan();
		

		// didalam method tidak boleh ada modifier
	}

	public static String penilaian(Integer skor) {

		String keterangan = skor >= 70 ? "Anda lulus" : "Anda gagal";
		return keterangan;

	}

// ================ dari sini ====================================

	public void makan() {
		System.out.println("Aku makan");
	}
	
	/**
	 * 
	 * Untuk makan
	 */

	public void makan(String makanan) {
		String nama = "apapun itu";
		String namaPenampung = nama;
	}

	public void makan(Integer makanan) {
		//
	}

// ================ method yang sama dinamakan overloading =======

	public String minum() {
		return "";
	}
}
