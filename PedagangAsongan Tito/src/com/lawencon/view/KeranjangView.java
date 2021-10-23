package com.lawencon.view;

import java.util.List;
import java.util.Scanner;

import com.lawencon.constant.AirMineral;
import com.lawencon.constant.Buah;
import com.lawencon.constant.Mie;
import com.lawencon.constant.Sayuran;
import com.lawencon.model.Item;
import com.lawencon.service.BarangServiceImpl;
import com.lawencon.service.KeranjangServiceImpl;

public class KeranjangView {

	private List<Item> items;
	private KeranjangServiceImpl keranjangService = new KeranjangServiceImpl();
	private BarangServiceImpl BarangService = new BarangServiceImpl();
	private Scanner scan = new Scanner(System.in);

	void show(List<Item> items) {
		this.items = items;
		int pilihan;
		Boolean checker = items.isEmpty();
		Integer totalBiaya = 0;
		totalBiaya = keranjangService.kalkulasi(items);
		this.items = keranjangService.getItems();
		System.out.println("======== Keranjang View =======");
		list();
		System.out.println("===============================");
		System.out.println("Total : " + totalBiaya);
		System.out.println("===============================");
		if (!checker) {
			System.out.println("1. Ubah");
			System.out.println("2. Hapus");
		}
		System.out.println("3. Keluar");
		System.out.print("Pilihan : ");
		try {
			pilihan = scan.nextInt();
			if (pilihan == 1 && !checker) {
				BarangService.inisialisasiList(items);
				ubah();
				this.items = BarangService.getImplementasi();
				show(items);
			} else if (pilihan == 2 && !checker) {
				BarangService.inisialisasiList(items);
				hapus();
				this.items = BarangService.getImplementasi();
				show(items);
			} else if (pilihan == 3) {
				System.out.println("Anda keluar");
			} else {
				System.out.println("Pilihan anda salah");
			}
		} catch (Exception e) {
			System.out.println("Pilihan anda tidak sesuai");
		}
	}

	void list() {
		int j = 1;
		for (Item i : items) {
			System.out.print(j + ". " + i.getNamaItem() + " Jumlah : ");
			System.out.print(i.getJumlahItem() + " Harga : ");
			System.out.println(i.getHargaItem() + " ");
			j++;
		}
	}

	protected List<Item> getKeranjang() {
		return this.items;
	}

	protected void setKeranjang(List<Item> items) {
		this.items = items;
	}

	public void ubah() {
		list();
		try {
			System.out.print("pilih item yang akan diUbah : ");
			int index = scan.nextInt();
			if (index > items.size() || index <= 0) {
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
			System.out.print("Tipe list yang anda pilih : ");
			int pilihan = scan.nextInt();
			if (pilihan > 4) {
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
				System.out.print("pilih sesuai list di AirMineral : ");
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
			BarangService.ubah(qty, namaItem, index);
			show(items);
		} catch (Exception e) {
			System.out.println("Maaf inputan anda salah" + e.getMessage());
			show(items);
		}
	}

	public void hapus() {
		list();
		System.out.print("pilih item yang akan diHapus : ");
		try {
			int pilihan = scan.nextInt();
			BarangService.hapus(pilihan);
			if (!BarangService.getImplementasi().isEmpty() || !BarangService.getImplementasi().equals(null)) {
				this.items = BarangService.getImplementasi();
			} else {
				items.clear();
			}
			show(items);
		} catch (Exception e) {
			System.out.println("Maaf pilihan anda salah\n" + e.getMessage());
			show(items);
		}
	}

}
