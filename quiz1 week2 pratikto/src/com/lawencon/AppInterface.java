package com.lawencon;

import java.util.Scanner;

public class AppInterface {

	public void menu() {
		Scanner scan = new Scanner(System.in);

		try {
			while (true) {
				tampilanMenu();
				int pilihan = scan.nextInt();
				switch (pilihan) {
				case 1:
					System.out.println("Persegi");
					System.out.print("masukan nilai sisi persegi : ");
					Float sisi = scan.nextFloat();
					IsianBangunDatar hitungPersegi = new Persegi(sisi);
					System.out.printf("Luas : %.2f Keliling %.2f", hitungPersegi.luas(), hitungPersegi.keliling());
					break;
				case 2:
					System.out.println("PersegiPanjang");
					System.out.print("masukan nilai panjang : ");
					Float panjang = scan.nextFloat();
					System.out.print("masukan nilai lebar : ");
					Float lebar = scan.nextFloat();
					IsianBangunDatar hitungPersegiPanjang = new PersegiPanjang(panjang, lebar);
					System.out.printf("Luas : %.2f Keliling %.2f", hitungPersegiPanjang.luas(),
							hitungPersegiPanjang.keliling());
					break;
				case 3:
					System.out.println("Segitiga");
					System.out.print("masukan nilai tinggi : ");
					Float tinggi = scan.nextFloat();
					System.out.print("masukan nilai alas : ");
					Float alas = scan.nextFloat();
					IsianBangunDatar hitungSegitiga = new Segitiga(alas, tinggi);
					System.out.printf("Luas : %.2f Keliling %.2f", hitungSegitiga.luas(), hitungSegitiga.keliling());
					break;
				case 4:
					System.out.println("Lingkaran");
					System.out.print("masukan jari-jari : ");
					Float jarijari = scan.nextFloat();
					IsianBangunDatar hitungLingkaran = new Lingkaran(jarijari);
					System.out.printf("Luas : %.2f Keliling %.2f", hitungLingkaran.luas(), hitungLingkaran.keliling());
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("maaf input yang anda masukan itu salah\n" + e);
		}
	}

	public void tampilanMenu() {
		System.out.println("\nMenu");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Segitiga");
		System.out.println("4. Lingkaran");
		System.out.print("Pilihan anda : ");
	}

}
