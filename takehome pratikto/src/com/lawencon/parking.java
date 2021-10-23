package com.lawencon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class parking {

	LocalDateTime myDateObj = LocalDateTime.now();

	public static List<Integer> jenisKendaraanArr = new ArrayList<Integer>();
	public static List<String> platNoArr = new ArrayList<String>();
	public static List<String> timeCheckInArr = new ArrayList<String>();
	public static List<String> dateCheckInArr = new ArrayList<String>();
	public static List<String> timeCheckOutArr = new ArrayList<String>();
	public static List<String> dateCheckOutArr = new ArrayList<String>();
	public static List<Integer> BiayaArr = new ArrayList<Integer>();

	public static void main(String[] args) {
		parking app = new parking();
		Scanner scan = new Scanner(System.in);
		app.menu();
		System.exit(0);
	}

	public void menu() {
		parking app = new parking();
		Scanner scan = new Scanner(System.in);
		boolean params = true;
		
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dateOn = myDateObj.format(dateTime);
		Integer numDateOn = Integer.parseInt(dateOn);
		
		app.tampilanMain();
		try {
			while (true) {
				
				dateOn = myDateObj.format(dateTime);
				String dateNow = dateOn.substring(0, 2);
				Integer numDateNow = Integer.parseInt(dateNow);
//				if(numDateOn != numDateNow) {
//					jenisKendaraanArr.clear();
//					platNoArr.clear();
//					timeCheckInArr.clear();
//					dateCheckInArr.clear();
//					timeCheckOutArr.clear();
//					dateCheckOutArr.clear();
//				}
				
				int pilihan = scan.nextInt();
				switch (pilihan) {
				case 1:
					app.kendaraanMasuk();
					menu();
					break;
				case 2:
					app.listKendaraan();
					menu();
					break;
				case 3:
					app.keluar();
					menu();
					break;
				case 4:
					break;
				default:
					System.out.println("pilihan yang anda masukan salah");
					break;
				}
			}
		} catch (Exception err) {
			System.out.println("Maaf Inputan menu anda salah !");
			menu();
		}
	}

	public void tampilanMain() {
		System.out.println("===============  parkir  ===============");
		System.out.println("1. Kendaraan Masuk");
		System.out.println("2. List kendaraan yang terdaftar");
		System.out.println("3. Kendaraan Keluar");
		System.out.println("4. Keluar");
		System.out.println("========================================");
		System.out.print("   Pilihan : ");
	}

	public boolean validasi(String plat) {
		plat = plat.toUpperCase();
		int i = 0;
		Character a;
		Boolean keputusan = null;
		if(platNoArr.contains(plat.toLowerCase())) {
			System.out.println("\nmaaf kendaraan anda tidak bisa parkir kembali");
			menu();
		}
		
		if (plat.length() <= 8) {
			a = plat.charAt(0);
			if (a != 'B') {
				System.out.println("Maaf tidak bisa parkir");
				keputusan = false;
			} else {
				for (i = 1; i <= 4; i++) {
					a = plat.charAt(i);
					if (!Character.isDigit(a)) {
						System.out.println("Maaf input plat salah");
						keputusan = false;
						break;
					} else {
						keputusan = true;
					}
				}
				for (i = 5; i < plat.length(); i++) {
					a = plat.charAt(i);
					if (!Character.isAlphabetic(a)) {
						System.out.println("Maaf input plat salah");
						keputusan = false;
						break;
					} else {
						keputusan = true;
					}
				}
			}
		} else if (plat.length() < 6 || plat.length() > 8) {
			System.out.println("maaf yang anda input kelebihan atau kekurangan");
			keputusan = false;
		} else if (platNoArr.contains(plat.toLowerCase())) {

		}
		return keputusan;
	}

	public void kendaraanMasuk() {
		Scanner scan = new Scanner(System.in);
		Integer tipe = 0;
		try {
			System.out.println("===========kendaraan masuk==============");
			System.out.println("	1. mobil");
			System.out.println("	2. motor");
			System.out.print("masukan tipe kendaraan :");
			tipe = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Maaf Pilihan anda salah !");
				menu();
		}
		if (tipe > 2 || tipe < 1) {
			System.out.println("maaf data yang anda masukan salah");
			kendaraanMasuk();
		} else {
			System.out.print("masukan plat :");
			String platNomor = scan.next();
			if (validasi(platNomor)) {
				insertArray(tipe, platNomor);
			} else {
				System.out.println("maaf kendaraan anda dilarang pakir");
			}
		}

	}

	public void insertArray(Integer tipe, String plat) {
		System.out.println("==============Insert array==============");
		DateTimeFormatter hourTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dataTime = myDateObj.format(dateTime);
		String dataDate = myDateObj.format(hourTime);
		System.out.println("Tipe kendaraan : " + tipe);
		System.out.println("Kode Plat      : " + plat);
		System.out.println("Jam masuk      : " + dataTime);
		System.out.println("Tanggal masuk  : " + dataDate);
		jenisKendaraanArr.add(tipe);
		platNoArr.add(plat);
		timeCheckInArr.add(dataTime);
		dateCheckInArr.add(dataDate);
		timeCheckOutArr.add(null);
		dateCheckOutArr.add(null);
	}

	public void keluar() {
		try {
			Scanner scan = new Scanner(System.in);
			listKendaraan();
			System.out.print("masukan record yang ingin keluar : ");
			int pilihan = scan.nextInt();
			pilihan -= 1;
			if (pilihan >= platNoArr.size() || pilihan < 0) {
				System.out.println("pilihan yang anda masukan tidak ada pada list");
				menu();
			}
			DateTimeFormatter hourTime = DateTimeFormatter.ofPattern("HH:mm:ss");
			DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String dataTimeCheckOut = myDateObj.format(dateTime);
			String dataDateCheckOut = myDateObj.format(hourTime);
			timeCheckOutArr.set(pilihan, dataTimeCheckOut);
			dateCheckOutArr.set(pilihan, dataDateCheckOut);
			Integer tipeKendaraan = jenisKendaraanArr.get(pilihan);
			String platNomor = platNoArr.get(pilihan);
			String timeCheckIn = timeCheckInArr.get(pilihan);
			String dateCheckIn = dateCheckInArr.get(pilihan);

			int total = biaya(timeCheckIn, dateCheckIn, tipeKendaraan, platNomor, dataTimeCheckOut, dataDateCheckOut);

			System.out.println("tipe kendaraan  : " + tipeKendaraan);
			System.out.println("nomor plat      : " + platNomor);
			System.out.println("jam masuk       : " + timeCheckIn);
			System.out.println("tanggal masuk   : " + dateCheckIn);
			System.out.println("jam keluar      : " + dataTimeCheckOut);
			System.out.println("tangggal keluar : " + dataDateCheckOut);
			System.out.println("biaya           : " + total);
		} catch (Exception e) {
			System.out.println("maaf pilihan anda salah");
			menu();
		}
	}

	public int biaya(String timeCheckIn, String dateCheckIn, Integer tipe, String plat, String timeCheckOut,
			String dateCheckOut) {
		Integer selisihWaktu = 0;
		Integer selisihTanggal = 0;
		Integer harga = 0;
		String timeCheckInNew = timeCheckIn.substring(0, 2);
		String dateCheckInNew = dateCheckIn.substring(0, 2);
		String timeCheckOutNew = timeCheckOut.substring(0, 2);
		String dateCheckOutNew = dateCheckOut.substring(0, 2);

		Integer numTimeCheckinNew = Integer.parseInt(timeCheckInNew);
		Integer numDateCheckinNew = Integer.parseInt(dateCheckInNew);

		Integer numTimeCheckoutNew = Integer.parseInt(timeCheckOutNew);
		Integer numDateCheckoutNew = Integer.parseInt(dateCheckOutNew);

		selisihTanggal = numDateCheckoutNew - numDateCheckinNew;
		selisihWaktu = numTimeCheckoutNew - numTimeCheckinNew;

		if (tipe == tipeKendaraan.MOBIL.indexKendaraan) {
			harga = tipeKendaraan.MOBIL.biayaParkir;
		} else if (tipe == tipeKendaraan.MOTOR.indexKendaraan) {
			harga = tipeKendaraan.MOTOR.biayaParkir;
		}

		int biaya = harga * (selisihTanggal * 24 + selisihWaktu);
		if (biaya == 0) {
			biaya += harga;
		}
		return biaya;
	}

	public void listKendaraan() {
		String kendaraan = "";
		System.out.println("==============ListKendaraan==============");
		for (int i = 0; i < jenisKendaraanArr.size(); i++) {
			System.out.print((i + 1) + ". ");
			if (jenisKendaraanArr.get(i) == tipeKendaraan.MOBIL.indexKendaraan) {
				kendaraan = tipeKendaraan.MOBIL.namaKendaraan;
				System.out.print(kendaraan + " ");
			} else if (jenisKendaraanArr.get(i) == tipeKendaraan.MOTOR.indexKendaraan) {
				kendaraan = tipeKendaraan.MOTOR.namaKendaraan;
				System.out.print(kendaraan + " ");
			}
			System.out.print(platNoArr.get(i) + " ");
			System.out.print("jam masuk : " + timeCheckInArr.get(i) + " ");
			System.out.print("tgl masuk : " + dateCheckInArr.get(i) + " ");
			System.out.print("jam keluar : " + timeCheckOutArr.get(i) + " ");
			System.out.println("tgl masuk : " + dateCheckOutArr.get(i));
		}
	}

}
