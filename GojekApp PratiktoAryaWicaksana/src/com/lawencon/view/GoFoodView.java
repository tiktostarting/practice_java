package com.lawencon.view;

import com.lawencon.constant.ServiceType;
import com.lawencon.constant.Restoran;

import com.lawencon.helper.OnDoneListener;

import com.lawencon.model.Drivers;
import com.lawencon.model.Histori;
import com.lawencon.model.Konsumsi;
import com.lawencon.service.GoFoodServiceImpl;

import java.util.List;
import java.util.Scanner;

public class GoFoodView extends GoView {

	Scanner scan = new Scanner(System.in);
	Konsumsi makanan = new Konsumsi();

	private Integer totalPrice;
	private Drivers driver;
	private String destinasi;

	void show(List<Histori> listHistory, OnDoneListener listener) {
		GoFoodServiceImpl GoFoodService = new GoFoodServiceImpl();
		System.out.println("\n=======   GoFood   =======");
		System.out.println("=======  ListMenu  =======");
		menu();
		System.out.println("==========================");
		System.out.print("Masukan tujuan antar : ");
		String dest = scan.next();
		this.destinasi = dest;
		this.totalPrice = GoFoodService.calculatePrice(makanan, dest);
		driver = GoFoodService.getDriver();
		print();
		saveHistori(listHistory);
		listener.done();
		scan.close();
	}

	@Override
	protected void print() {
		System.out.println("===== GoFood Details =====");
		System.out.println("Pengemudi      : " + driver.getNama());
		System.out.println("Plat nomor     : " + driver.getPlatNo());
		System.out.println("Tujuan         : " + destinasi);
		System.out.println("Nama Makanan   : " + makanan.getNamaMakanan());
		System.out.println("Nama restoran  : " + makanan.getNamaRestoran());
		System.out.println("Jumlah makanan : " + makanan.getJumlahMakanan());
		System.out.println("Total harga    : " + totalPrice);
		System.out.println("");
	}

	@Override
	protected void saveHistori(List<Histori> listHistory) {
		Histori history = new Histori();
		history.setServiceType(ServiceType.GOFOOD);
		history.setTotalPrice(totalPrice);
		listHistory.add(history);
	}

	private void menu() {
		int a = 1;
		try {
			for (Restoran i : Restoran.values()) {
				System.out.printf("%d.%s\n", a, i.getNamaRestoran());
				a++;
			}
			System.out.print("Pilih restoran yang anda pesankan : ");
			Integer pilihan = scan.nextInt();
			if (pilihan > Restoran.values().length || pilihan < 1) {
				System.out.println("Maaf pilihan anda salah");
				menu();
			}

			makanan.setNamaRestoran(Restoran.values()[pilihan - 1].getNamaRestoran());

			a = 1;

			System.out.println("\n==========================");

			for (Restoran i : Restoran.values()) {
				System.out.printf("%d.%s Harga %d\n", a, i.getMakanan(), i.getHarga());
				a++;
			}

			System.out.print("Menu makanan yang anda pilih : ");
			pilihan = scan.nextInt();
			if (pilihan > Restoran.values().length || pilihan < 1) {
				System.out.println("Maaf pilihan anda salah");
				menu();
			} else {
				makanan.setNamaMakanan(Restoran.values()[pilihan - 1].getMakanan());
				makanan.sethargaMakanan(Restoran.values()[pilihan - 1].getHarga());
			}
			System.out.print("Jumlah makanan yang anda Pesan : ");
			Integer qty = scan.nextInt();

			makanan.setJumlahMakanan(qty);
		} catch (Exception e) {
			System.out.println("Maaf pilihan anda salah");
			menu();
		}
	}
}
