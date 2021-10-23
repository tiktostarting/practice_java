package com.lawencon;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		
		System.out.println("=======| Menu |=======");
		System.out.println(" 1. Persegi ");
		System.out.println(" 2. Persegi panjang ");
		System.out.println(" 3. Segitiga ");
		System.out.println(" 4. Lingkaran ");
		System.out.println("======================");
		
		Scanner scan = new Scanner(System.in);
		app fungsi = new app();
		
		System.out.print("pilihan : ");
		int pilihan = scan.nextInt();
		
		if(pilihan == 1) {
			fungsi.persegi();
		}else if(pilihan == 2) {
			fungsi.persegiPanjang();
		}else if(pilihan == 3) {
			fungsi.segitiga();
		}else if(pilihan == 4) {
			fungsi.lingkaran();
		}else {
			System.out.println("maaf pilihan anda tidak sesuai");
		}
	}
	
	public void persegi() {
		Scanner scan = new Scanner(System.in);
		System.out.print("masukan sisi : ");
		int sisi = scan.nextInt();
		int luas = sisi * sisi;
		System.out.printf("luas persegi adalah %d", luas);
	}
	
	public void persegiPanjang() {
		Scanner scan = new Scanner(System.in);
		System.out.print("masukan panjang : ");
		int panjang = scan.nextInt();
		System.out.print("masukan panjang : ");
		int lebar = scan.nextInt();
		int luas = panjang * lebar;
		System.out.printf("luas persegi panjang adalah %d", luas);
	}
	
	public void segitiga() {
		Scanner scan = new Scanner(System.in);
		System.out.print("masukan alas   : ");
		int alas = scan.nextInt();
		System.out.print("masukan tinggi : ");
		int tinggi = scan.nextInt();
		int luas = ((alas * tinggi) / 2);
		System.out.printf("luas segitiga adalah %d", luas);
	}
	
	public void lingkaran() {
		Scanner scan = new Scanner(System.in);
		System.out.print("masukan jari-jari : ");
		int jariJari = scan.nextInt();
		double luas = 3.14 * jariJari * jariJari;
		System.out.printf("luas lingkaran adalah %.2f", luas);
	}
	
}
