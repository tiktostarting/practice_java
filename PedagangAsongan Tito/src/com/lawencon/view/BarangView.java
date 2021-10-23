package com.lawencon.view;

import com.lawencon.model.Item;
import com.lawencon.service.BarangServiceImpl;
import java.util.List;
import java.util.Scanner;
import com.lawencon.constant.*;

public class BarangView {
	private Scanner scan = new Scanner(System.in);
	private BarangServiceImpl barangService = new BarangServiceImpl();
	private List<Item> items;

	void show(List<Item> items) {
		int pilihan = 0;
		barangService.inisialisasiList(items);
		this.items = items;
		System.out.println("========= Barang View =========");
		list();
		System.out.println("Masukan 1 jika tambah");
		System.out.println("Masukan 2 jika keluar");
		System.out.print("Pilihan : ");
		try {
			pilihan = scan.nextInt();
		} catch (Exception e) {
			System.out.println("maaf pilihan anda salah !");
			show(items);
		}
		switch (pilihan) {
		case 1:
			tambah();
			this.items = barangService.getImplementasi();
			break;
		case 2:
			System.out.println("Anda keluar !");
			break;
		default:
			break;
		}
	}

	private void list() {
		int j = 1;
		for (Item i : items) {
			System.out.print(j + ". " + i.getNamaItem() + " ");
			System.out.println(i.getJumlahItem());
			j++;
		}
	}

	public void ubah() {
		list();
		try {
			System.out.print("pilih item yang akan diUbah : ");
			int index = scan.nextInt();
			if (index >= items.size() || index < 0) {
				System.out.println("Maaf Pilihan anda salah !");
				show(items);
			}

			int j = 1;
			int qty = 0;
			int pilihItem = 0;
			String tipe = "";
			String namaItem = "";

			System.out.println("1. AirMineral");
			System.out.println("2. Buah");
			System.out.println("3. Mie");
			System.out.println("4. Sayuran");
			System.out.print("Tipe list yang anda pilih");
			int pilihan = scan.nextInt();
			if (pilihan > 4 || pilihan < 0) {
				System.out.println("pilihan anda salah !");
				show(items);
			}
			switch (pilihan) {
			case 1:
				tipe = "AirMineral";
				j = 1;
				for (AirMineral i : AirMineral.values()) {
					System.out.print(j + ". " + i + " \n");
					j++;
				}
				System.out.print("pilih sesuai list di Mie : ");
				pilihItem = scan.nextInt();
				namaItem = AirMineral.values()[pilihItem - 1].toString();
				System.out.print("banyak yang anda perlukan : ");
				qty = scan.nextInt();
				break;
			case 2:
				tipe = "Buah";
				j = 1;
				for (Buah i : Buah.values()) {
					System.out.print(j + ". " + i + " \n");
					j++;
				}
				System.out.print("pilih sesuai list di Buah : ");
				pilihItem = scan.nextInt();
				namaItem = Buah.values()[pilihItem - 1].toString();
				System.out.print("banyak yang anda perlukan : ");
				qty = scan.nextInt();
				break;
			case 3:
				tipe = "Mie";
				j = 1;
				for (Mie i : Mie.values()) {
					System.out.print(j + ". " + i + " \n");
					j++;
				}
				System.out.print("pilih sesuai list di Mie : ");
				pilihItem = scan.nextInt();
				namaItem = Mie.values()[pilihItem - 1].toString();
				System.out.print("banyak yang anda perlukan : ");
				qty = scan.nextInt();
				break;
			case 4:
				tipe = "Sayuran";
				j = 1;
				for (Sayuran i : Sayuran.values()) {
					System.out.print(j + ". " + i + " \n");
					j++;
				}
				System.out.print("pilih sesuai list di Sayuran : ");
				pilihItem = scan.nextInt();
				namaItem = Sayuran.values()[pilihItem - 1].toString();
				System.out.print("banyak yang anda perlukan : ");
				qty = scan.nextInt();
				break;
			default:
				break;
			}
			barangService.ubah(qty, namaItem, index);
			show(items);
		} catch (Exception e) {
			System.out.println("Maaf inputan anda salah");
			show(items);
		}
	}

	public void hapus() {
		list();
		System.out.print("pilih item yang akan diHapus : ");
		try {
			int pilihan = scan.nextInt();
			barangService.hapus(pilihan);
			show(items);
		} catch (Exception e) {
			System.out.println("Maaf pilihan anda salah");
			show(items);
		}
	}

	protected void tambah() {
		int j = 1;
		int qty = 0;
		int pilihItem = 0;
		int pilihan = 0;
		String tipe = "";
		String namaItem = "";
		System.out.println("1. AirMineral");
		System.out.println("2. Buah");
		System.out.println("3. Mie");
		System.out.println("4. Sayuran");
		System.out.print("Tipe list yang anda pilih : ");
		try {
			pilihan = scan.nextInt();
			if (pilihan > 4 || pilihan < 0) {
				System.out.println("pilihan anda salah !");
				show(items);
			}
		} catch (Exception e) {
			System.out.println("pilihan anda salah !");
			show(items);
		}
		switch (pilihan) {
		case 1:
			tipe = "AirMineral";
			j = 1;
			for (AirMineral i : AirMineral.values()) {
				System.out.print(j + ". " + i + " \n");
				j++;
			}
			System.out.print("pilih sesuai list di Mie : ");
			pilihItem = scan.nextInt();
			namaItem = AirMineral.values()[pilihItem - 1].toString();
			System.out.print("banyak yang anda perlukan : ");
			qty = scan.nextInt();
			break;
		case 2:
			tipe = "Buah";
			j = 1;
			for (Buah i : Buah.values()) {
				System.out.print(j + ". " + i + " \n");
				j++;
			}
			System.out.print("pilih sesuai list di Buah : ");
			pilihItem = scan.nextInt();
			namaItem = Buah.values()[pilihItem - 1].toString();
			System.out.print("banyak yang anda perlukan : ");
			qty = scan.nextInt();
			break;
		case 3:
			tipe = "Mie";
			j = 1;
			for (Mie i : Mie.values()) {
				System.out.print(j + ". " + i + " \n");
				j++;
			}
			System.out.print("pilih sesuai list di Mie : ");
			pilihItem = scan.nextInt();
			namaItem = Mie.values()[pilihItem - 1].toString();
			System.out.print("banyak yang anda perlukan : ");
			qty = scan.nextInt();
			break;
		case 4:
			tipe = "Sayuran";
			j = 1;
			for (Sayuran i : Sayuran.values()) {
				System.out.print(j + ". " + i + " \n");
				j++;
			}
			System.out.print("pilih sesuai list di Sayuran : ");
			pilihItem = scan.nextInt();
			namaItem = Sayuran.values()[pilihItem - 1].toString();
			System.out.print("banyak yang anda perlukan : ");
			qty = scan.nextInt();
			break;
		default:
			break;
		}
		try {
			barangService.tambah(qty, namaItem, tipe);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		show(items);
	}

	protected List<Item> getBarang() {
		return this.items;
	}

	protected void setBarang(List<Item> items) {
		this.items = items;
	}

}
