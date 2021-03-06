package com.lawencon;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

public class TokoBuku {
	
	public static HashMap<Integer, Integer> listPesanan = new HashMap<Integer, Integer>();
	public static Scanner scan = new Scanner(System.in);
	
	public void tokoBuku() {
		TokoBuku app = new TokoBuku();
		App aplikasi = new App();
		while(true) {
			app.tampilanListPesanan();
			System.out.println("=======================================");
			System.out.println("1. Tambah/Ubah");
			System.out.println("2. Hapus");
			System.out.println("3. Total Biaya");
			System.out.println("4. Keluar");
			System.out.println("=======================================");
			System.out.print("Menu yang anda pilih : ");
			int pilihan = scan.nextInt();
			switch(pilihan){
				case 1:
					app.listBuku();
					break;
				case 2:
					app.listHapus();	
					break;
				case 3:
					app.rincian();
					break;
				case 4:
					System.exit(0);
				default:
			}
		}
	}
	
	public void listBuku() {
		TokoBuku app = new TokoBuku();
		app.tampilanListBuku();
		System.out.print("Pilih kuantitas buku yang akan ditambah : ");
		int pilihan = scan.nextInt();
		switch(pilihan) {
		case 1:
			app.inputList(1);
			break;
		case 2:
			app.inputList(2);
			break;
		case 3:
			app.inputList(3);			
			break;
		case 4:
			app.inputList(4);
			break;
		}
	}
	
	public void listHapus() {
		TokoBuku app = new TokoBuku();
		app.tampilanListPesanan();
		System.out.print("Pilih nomor buku yang akan dihapus : ");
		int pilihan = scan.nextInt();
		switch(pilihan) {
		case 1:
			listPesanan.remove(pilihan);
			break;
		case 2:
			listPesanan.remove(pilihan);
			break;
		case 3:
			listPesanan.remove(pilihan);
			break;
		case 4:
			listPesanan.remove(pilihan);
			break;
		}
	}
	
	public void rincian() {
		int biaya = 0;
		int hargaBuku = 0;
		int kuantitas = 0;
		for(Integer i : listPesanan.keySet()) {
			if(i == DaftarBuku.JAVA.indexBuku) {
				hargaBuku = DaftarBuku.JAVA.hargaBuku;
				kuantitas = listPesanan.get(i);
			}else if(i == DaftarBuku.KOTLIN.indexBuku) {
				hargaBuku = DaftarBuku.KOTLIN.hargaBuku;
				kuantitas = listPesanan.get(i);
			}else if(i == DaftarBuku.SPRING.indexBuku) {
				hargaBuku = DaftarBuku.SPRING.hargaBuku;
				kuantitas = listPesanan.get(i);
			}else if(i == DaftarBuku.ANGULAR.indexBuku) {
				hargaBuku = DaftarBuku.ANGULAR.hargaBuku;
				kuantitas = listPesanan.get(i);
			}
			biaya = biaya + (kuantitas * hargaBuku);
		}
		System.out.println("Biaya : "+ biaya);
	}
	
	public void inputList(int pilihan) {
		TokoBuku app = new TokoBuku();
		String namaBuku = "";
		Integer penampung = 0;
		Integer target = pilihan;
		if(target == DaftarBuku.JAVA.indexBuku) {
			namaBuku = DaftarBuku.JAVA.namaBuku;
		}else if(target == DaftarBuku.KOTLIN.indexBuku) {
			namaBuku = DaftarBuku.KOTLIN.namaBuku;
		}else if(target == DaftarBuku.SPRING.indexBuku) {
			namaBuku = DaftarBuku.SPRING.namaBuku;
		}else if(target == DaftarBuku.ANGULAR.indexBuku) {
			namaBuku = DaftarBuku.ANGULAR.namaBuku;
		}
		System.out.println("Buku "+ namaBuku);
		System.out.print("masukan jumlah buku : ");
		int kuantitas = scan.nextInt();
		
		if(listPesanan.containsKey(target)) {
			penampung = listPesanan.get(target);
			penampung += kuantitas;
			listPesanan.put(pilihan, penampung);
		}else {
			listPesanan.put(pilihan, kuantitas);
		}
	}
	
	public void tampilanListPesanan() {
		System.out.println("=================LIST==================");
		String namaBuku = "";
		for(Integer i : listPesanan.keySet()) {
			if(i == DaftarBuku.JAVA.indexBuku) {
				namaBuku = DaftarBuku.JAVA.namaBuku;
			}else if(i == DaftarBuku.KOTLIN.indexBuku) {
				namaBuku = DaftarBuku.KOTLIN.namaBuku;
			}else if(i == DaftarBuku.SPRING.indexBuku) {
				namaBuku = DaftarBuku.SPRING.namaBuku;
			}else if(i == DaftarBuku.ANGULAR.indexBuku) {
				namaBuku = DaftarBuku.ANGULAR.namaBuku;
			}
			System.out.println(i +". "+ namaBuku + " : "+ listPesanan.get(i));
		}
	}	
	
	public void tampilanListBuku() {
		System.out.println("\n================ List =================");
		System.out.printf("  %d . %s. harga %d\n", DaftarBuku.JAVA.indexBuku, DaftarBuku.JAVA.namaBuku, DaftarBuku.JAVA.hargaBuku);
		System.out.printf("  %d . %s. harga %d\n", DaftarBuku.KOTLIN.indexBuku, DaftarBuku.KOTLIN.namaBuku, DaftarBuku.KOTLIN.hargaBuku);
		System.out.printf("  %d . %s. harga %d\n", DaftarBuku.SPRING.indexBuku, DaftarBuku.SPRING.namaBuku, DaftarBuku.SPRING.hargaBuku);
		System.out.printf("  %d . %s. harga %d\n", DaftarBuku.ANGULAR.indexBuku, DaftarBuku.ANGULAR.namaBuku, DaftarBuku.ANGULAR.hargaBuku);
		System.out.printf("  5 . Keluar. \n");
		System.out.println("=======================================");
	}
}
