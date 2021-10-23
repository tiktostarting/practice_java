package com.lawencon.view;

import java.util.Scanner;
import java.util.List;

import com.lawencon.constant.ServiceType;
import com.lawencon.service.GoRideServiceImpl;

import com.lawencon.helper.OnDoneListener;

import com.lawencon.model.Drivers;
import com.lawencon.model.Histori;

public class GoRideView extends GoView {

	private Integer totalPrice;
	private Drivers driver;

	void show(List<Histori> listHistory, OnDoneListener listener) {
		Scanner scan = new Scanner(System.in);
		String source = "";
		String destination = "";
		try {
			System.out.print("Input posisi awal anda : ");
			source = scan.nextLine();

			System.out.print("Input posisi tujuan anda : ");
			destination = scan.nextLine();
		} catch (Exception e) {
			System.out.println("Maaf inputan anda salah");
			listener.done();
		}
		GoRideServiceImpl GoRideService = new GoRideServiceImpl();

		this.totalPrice = GoRideService.calculatePrice(source, destination);
		driver = GoRideService.getDriver();

		print();
		saveHistori(listHistory);
		listener.done();
		scan.close();
	}

	@Override
	protected void print() {
		System.out.println("===== goRide Details =====");
		System.out.println("Total Price : " + totalPrice);
		System.out.println("Pengemudi   : " + driver.getNama());
		System.out.println("Plat nomor  : " + driver.getPlatNo());
		System.out.println("Nomor HP    : " + driver.getNoHP());
	}

	@Override
	protected void saveHistori(List<Histori> listHistory) {

		Histori history = new Histori();
		history.setServiceType(ServiceType.GORIDE);
		history.setTotalPrice(totalPrice);

		listHistory.add(history);
	}
}