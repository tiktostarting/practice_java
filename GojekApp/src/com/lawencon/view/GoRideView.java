package com.lawencon.view;

import java.util.List;
import java.util.Scanner;

import com.lawencon.constant.ServiceType;
import com.lawencon.model.Drivers;
import com.lawencon.model.History;
import com.lawencon.service.GoRideService;
import com.lawencon.service.GoRideServiceImpl;

public class GoRideView extends GoView {

	private GoRideService goRideService = new GoRideServiceImpl();
	private Integer totalPrice;
	private Drivers driver;

	void show(List<History> listHistory) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input posisi anda? ");
		String source = scan.nextLine();

		System.out.print("Input tujuan anda? ");
		String destination = scan.nextLine();

		totalPrice = goRideService.calculatePrice(source, destination);
		driver = goRideService.getDriver();				

		saveHistory(listHistory);
		print();
		scan.close();
	}
	
	@Override
	protected void saveHistory(List<History> listHistory) {
		History history = new History();
		history.setServiceType(ServiceType.GORIDE);
		history.setTotalPrice(totalPrice);
		
		listHistory.add(history);
	}

	@Override
	protected void print() {
		System.out.println("\n==== GoRide Details ====");
		System.out.println("Total Price : " + totalPrice);
		System.out.println("Driver : ");
		System.out.println("Name : " + driver.getNama());
		System.out.println("Plat No. : " + driver.getPlatNo());
	}
}
