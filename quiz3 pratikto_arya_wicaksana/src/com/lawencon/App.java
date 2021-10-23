package com.lawencon;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		App aplikasi = new App();
		aplikasi.menuUtama();
		System.exit(0);
	}
	
	public void menuUtama() {
		App aplikasi = new App();
		TokoBuku tokoBuku = new TokoBuku();
		Scanner scan = new Scanner(System.in);
		int pilihan = 0;
		while(true) {
			aplikasi.tampilanMenuUtama();
			pilihan = scan.nextInt();
			switch(pilihan) {
				case 1:
					tokoBuku.tokoBuku();
					break;
				case 2:
					System.exit(0);
			}
		}
	}
	
	public void tampilanMenuUtama() {
		System.out.println("=========== Menu ============");
		System.out.println("   1. List                   ");
		System.out.println("   2. Keluar                 ");
		System.out.println("=============================");
		System.out.print("pilihan anda : ");
	}
}
	

