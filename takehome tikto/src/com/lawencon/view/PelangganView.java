package com.lawencon.view;

import java.util.Scanner;

public class PelangganView extends IndukView {

	private Scanner scan = new Scanner(System.in);
	private String User = "Pelanggan";

	public void show() {
		System.out.println("Pelanggan");
		System.out.println("1. Jenis item");
		System.out.println("2. List semua item");
		System.out.println("3. Kuantitas dan Harga");
		System.out.println("4. Keranjang Belanja");
		System.out.println("5. Ubah kuantitas");
		System.out.println("6. Hapus belanjaan");
		System.out.println("7. Log out");
		System.out.println("8. Keluar Aplikasi");
		int pilihan = scan.nextInt();
		switch (pilihan) {
		case 1:
			listJenisItem();
			break;
		case 2:
			listSemuaItem();
			break;
		case 3:
//			Kuantitas dan Harga
			break;
		case 4:
			// Hapus
			break;
		case 5:
			// Ubah
			break;
		case 6:
			// transaksi pembelian
			break;
		case 7:
			// log out
			break;
		case 8:
			keluar();
			break;
		default:
			System.out.println("pilihan anda salah");
			show();
		}
	}
}
