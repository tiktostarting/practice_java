package com.lawencon.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lawencon.model.Item;

public class AppMenuView {
	private List<Item> items = new ArrayList<Item>();
	private Scanner scan = new Scanner(System.in);
	private BarangView barangView = new BarangView();
	private KeranjangView keranjangView = new KeranjangView();

	public void show() {
		System.out.println("====== Pedagang Asongan =======");
		System.out.println("1. List barang");
		System.out.println("2. Keranjang belanja");
		System.out.println("3. Keluar");
		System.out.print("Masukan pilihan anda : ");
		try {
			int pilihan = scan.nextInt();
			switch (pilihan) {
			case 1:
				barangView.show(items);
				this.items = barangView.getBarang();
				show();
				break;
			case 2:
				keranjangView.show(items);
				show();
				break;
			case 3:
				System.out.println("Keluar");
				break;
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("maaf pilihan anda salah !");
		}
	}
}
