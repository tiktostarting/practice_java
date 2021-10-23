package com.lawencon.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lawencon.model.History;

public class AppView {
	
	private GoRideView goRideView = new GoRideView();
	private List<History> listHistory = new ArrayList<>();

	public void show() {
		System.out.println("==== GoJek====");
		System.out.println("1. Go-Ride");
		System.out.println("2. Go-Send");
		System.out.println("3. Go-Food");
		System.out.println("4. Go-Pulsa");
		System.out.println("5. History");
		System.out.println("6. Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Pilih menu? ");
		int input = scan.nextInt();
		
		if(input == 1) {
			goRideView.show(listHistory);
		}
		
		scan.close();
	}
}
