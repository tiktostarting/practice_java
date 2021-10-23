package com.lawencon.view;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import com.lawencon.model.Histori;

public class AppView {

	public List<Histori> listHistory = new ArrayList<>();

	public void show() {

		int input = 0;
		GoRideView GoRide = new GoRideView();
		GoSendView GoSend = new GoSendView();
		GoFoodView GoFood = new GoFoodView();
		HistoriView historyView = new HistoriView();
		Scanner scan = new Scanner(System.in);

		System.out.println("=====|  GoJek Menu  |=====");
		System.out.println("1. Go-Ride");
		System.out.println("2. Go-Send");
		System.out.println("3. Go-Food");
		System.out.println("4. XGo-Pulsa");
		System.out.println("5. Histori");
		System.out.println("6. Exit");
		try {
			System.out.print("Pilih Menu? ");
			input = scan.nextInt();
			switch (input) {

			case 1:
				GoRide.show(listHistory, () -> show());
				break;

			case 2:
				GoSend.show(listHistory, () -> show());
				break;

			case 3:
				GoFood.show(listHistory, () -> show());
				break;

			case 5:
				historyView.show(listHistory, () -> show());
				break;

			default:
				System.out.println("Maaf pilihan anda salah");
				show();
				break;
			}
		} catch (Exception e) {
			System.out.println("Maaf pilihan anda salah");
		}
	}
}
