package com.lawencon;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		App aplikasi = new App();
		aplikasi.menuUtama();
		System.exit(0);
	}
	
	public void menuUtama() {
		App aplikasi = new App();
		Scanner scan = new Scanner(System.in);
		int pilihan = 0;
		while(true) {
			aplikasi.tampilanMenu();
			pilihan = scan.nextInt();
			if(pilihan == 1) {
				aplikasi.menuList();
			}else if(pilihan == 2) {
				break;
			}
		}
	}
	
	public void tampilanMenu() {
		System.out.println("=========== Menu ============");
		System.out.println("   1. List                   ");
		System.out.println("   2. Keluar                 ");
		System.out.println("=============================");
		System.out.print("pilihan anda : ");
	}
	
	public void menuList() {
		App aplikasi = new App();
		Scanner scan = new Scanner(System.in);
		while(true) {
			aplikasi.menu();
			int pilihan = scan.nextInt();
			if(pilihan == DaftarBuku.JAVA.indexBuku) {
				aplikasi.beli(DaftarBuku.JAVA.indexBuku);
			}else if(pilihan == DaftarBuku.KOTLIN.indexBuku) {
				aplikasi.beli(DaftarBuku.KOTLIN.indexBuku);
			}else if(pilihan == DaftarBuku.SPRING.indexBuku) {
				aplikasi.beli(DaftarBuku.SPRING.indexBuku);
			}else if(pilihan == DaftarBuku.ANGULAR.indexBuku) {
				aplikasi.beli(DaftarBuku.ANGULAR.indexBuku);
			}else if(pilihan == 5) {
				aplikasi.menuUtama();
			}
		}
	}
	
	public void menu() {
		System.out.println("\n=========== List ============");
		System.out.printf("       %d . %s. \n", DaftarBuku.JAVA.indexBuku, DaftarBuku.JAVA.namaBuku);
		System.out.printf("       %d . %s. \n", DaftarBuku.KOTLIN.indexBuku, DaftarBuku.KOTLIN.namaBuku);
		System.out.printf("       %d . %s. \n", DaftarBuku.SPRING.indexBuku, DaftarBuku.SPRING.namaBuku);
		System.out.printf("       %d . %s. \n", DaftarBuku.ANGULAR.indexBuku, DaftarBuku.ANGULAR.namaBuku);
		System.out.printf("       5 . Keluar. \n");
		System.out.println("=============================");
		System.out.printf("pilihan anda : ");
	}
	
	public void beli(int pilihan) {	
		
		String namaBuku = "";
		int hargaBuku = 0;
		
		if(pilihan == DaftarBuku.JAVA.indexBuku) {
			 namaBuku = DaftarBuku.JAVA.namaBuku;
			 hargaBuku = DaftarBuku.JAVA.hargaBuku;
		}else if(pilihan == DaftarBuku.KOTLIN.indexBuku) {
			 namaBuku = DaftarBuku.KOTLIN.namaBuku;
			 hargaBuku = DaftarBuku.KOTLIN.hargaBuku;			
		}else if(pilihan == DaftarBuku.SPRING.indexBuku) {
			 namaBuku = DaftarBuku.SPRING.namaBuku;
			 hargaBuku = DaftarBuku.SPRING.hargaBuku;			
		}else if(pilihan == DaftarBuku.ANGULAR.indexBuku) {
			 namaBuku = DaftarBuku.ANGULAR.namaBuku;
			 hargaBuku = DaftarBuku.ANGULAR.hargaBuku;			
		}		
		
		System.out.println("\n========== Rincian ==========");
		Scanner scan = new Scanner(System.in);
		System.out.print("Jumlah buku yang diminta :");
		int jumlahPermintaan = scan.nextInt();
		
		int biaya = hargaBuku * jumlahPermintaan;
	
		System.out.println("\n=============================");
		System.out.printf("Nama  buku : %s", namaBuku);
		System.out.printf("\nHarga buku : %d", hargaBuku);		
		System.out.printf("\nTotal      : %d", biaya);
		System.out.println("\n=============================");
	}
}

