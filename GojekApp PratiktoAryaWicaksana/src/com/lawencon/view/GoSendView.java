package com.lawencon.view;

import java.util.Scanner;

import java.util.List;

import com.lawencon.constant.ServiceType;
import com.lawencon.constant.BarangType;

import com.lawencon.service.GoSendServiceImpl;

import com.lawencon.model.Histori;
import com.lawencon.model.Drivers;

import com.lawencon.helper.OnDoneListener;

public class GoSendView extends GoView {

	private Integer totalPrice, beban, qty;
	private Drivers driver;
	private String asal, tujuan, penerima, type;

	void show(List<Histori> listHistory, OnDoneListener listener) {
		System.out.println("\n========= GoSend =========");
		Scanner scan = new Scanner(System.in);

		System.out.print("Input posisi awal anda : ");
		String source = scan.nextLine();
		System.out.print("Input posisi tujuan anda : ");
		String destination = scan.nextLine();
		System.out.print("Orang penerima tujuan anda : ");
		String receiver = scan.nextLine();
		System.out.print("Beban paket yang dibawa : ");
		Integer weight = scan.nextInt();
		System.out.print("Jumlah paket yang dibawa : ");
		Integer qty = scan.nextInt();

		String type = "";
		System.out.println("======= Tipe paket =======");
		int a = 1;
		for (BarangType i : BarangType.values()) {
			System.out.printf("%d. %s\n", a, i);
			a++;
		}

		System.out.print("Tipe paket yang dibawa : ");
		Integer typeCode = scan.nextInt();
		if (typeCode == 1) {
			type = BarangType.LAINLAIN.toString();
		} else if (typeCode == 2) {
			type = BarangType.ELEKTRONIK.toString();
		} else if (typeCode == 3) {
			type = BarangType.PECAHBELAH.toString();
		} else if (typeCode == 4) {
			type = BarangType.DOKUMEN.toString();
		} else {
			System.out.println("maaf pilihan anda salah");
		}
		GoSendServiceImpl GoSendService = new GoSendServiceImpl();

		this.totalPrice = GoSendService.calculatePrice(source, destination, receiver, weight, qty, type);
		this.driver = GoSendService.getDriver();

		this.asal = source;
		this.tujuan = destination;
		this.penerima = receiver;
		this.beban = weight;
		this.qty = qty;
		this.type = type;

		print();
		saveHistori(listHistory);
		listener.done();
		scan.close();
	}

	@Override
	protected void print() {
		System.out.println("\n===== goSend Details =====");
		System.out.println("Total Price   : " + totalPrice);
		System.out.println("Pengemudi     : " + driver.getNama());
		System.out.println("Plat nomor    : " + driver.getPlatNo());
		System.out.println("===== goSend Barang  =====");
		System.out.println("Asal          : " + asal);
		System.out.println("Tujuan        : " + tujuan);
		System.out.println("Nama Penerima : " + penerima);
		System.out.println("Tipe barang   : " + type);
		System.out.println("Beban barang  : " + beban);
		System.out.println("Jumlah barang : " + qty + "\n");
	}

	@Override
	protected void saveHistori(List<Histori> listHistory) {

		Histori history = new Histori();
		history.setServiceType(ServiceType.GOSEND);
		history.setTotalPrice(totalPrice);

		listHistory.add(history);
	}
}
