package com.lawencon;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		App aplikasi = new App();
		aplikasi.menuUtama();
		System.exit(0);
	}

	public void menuUtama() {
		TokoBuku tokoBuku = new TokoBuku();
		Scanner scan = new Scanner(System.in);
		int pilihan = 0;
		try {
			tampilanMenuUtama();
			pilihan = scan.nextInt();
			switch (pilihan) {
			case 1:
				tokoBuku.tokoBuku();
				break;
			case 2:
				System.exit(0);
			default:
				System.out.println("Pilihan Anda salah");
			}
		} catch (Exception a) {
			System.out.println("Pilihan anda salah");
		}
		menuUtama();
	}

	public void tampilanMenuUtama() {
		System.out.println("=============== Menu ==================");
		System.out.println("    1. List Keranjang         ");
		System.out.println("   99. Keluar                 ");
		System.out.println("=======================================");
		System.out.print(" Pilihan anda : ");
	}
}
