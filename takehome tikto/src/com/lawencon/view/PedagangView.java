package com.lawencon.view;

import com.lawencon.model.Barang;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedagangView extends IndukView {

	private Scanner scan = new Scanner(System.in);
	private String User = "Pedagang";

	public void show() {
		System.out.println("Pedagang");
		System.out.println("1. Jenis item");
		System.out.println("2. List semua item");
		System.out.println("3. Tambah");
		System.out.println("4. Hapus");
		System.out.println("5. Ubah");
		System.out.println("6. Transaksi pembeli");
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
			tambahItem(User);
			break;
		case 4:
			hapusItem(User);
			break;
		case 5:
			ubahItem(User);
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
