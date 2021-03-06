package com.lawencon;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

public class TokoBuku {

	public static HashMap<Integer, Integer> listPesanan = new HashMap<Integer, Integer>();
	public static Scanner scan = new Scanner(System.in);

	public void tokoBuku() {
		tampilanListPesanan();
		System.out.println("=======================================");
		System.out.println("|           1. Tambah                 |");
		System.out.println("|           2. Edit                   |");
		System.out.println("|           3. Hapus                  |");
		System.out.println("|           4. Total Biaya            |");
		System.out.println("=======================================");
		System.out.print("Menu yang anda pilih : ");
		try {
			int pilihan = scan.nextInt();
			switch (pilihan) {
			case 1:
				listBuku();
				break;
			case 2:
				editBuku();
				break;
			case 3:
				listHapus();
				break;
			case 4:
				rincian();
				break;
			default:
				tokoBuku();
			}
		} catch (Exception e) {
			System.out.println("maaf pilihan yang anda masukan salah");
			scan.next();
			tokoBuku();
		}
	}

	public void editBuku() {
		tampilanListPesanan();
		System.out.print("pilih buku yang akan diubah : ");
		try {
			int buku = scan.nextInt();
			System.out.print("1. untuk ubah tipe \n 2. untuk ubah quantity \n masukan pilihan anda : ");
			int pilihan = scan.nextInt();
			if(pilihan == 1) {
				ubahTipe(buku);
			}else if(pilihan == 2) {
				ubahQty(buku);
			}
		} catch (Exception e) {
			scan.next();
			editBuku();
		}
	}

	public void ubahTipe(int buku) {
		Integer penampung = 0;
		Integer target = buku;
		tampilanListBuku();
		System.out.print("buku pengganti : ");
		try {
			int indexData = scan.nextInt();
			if (listPesanan.containsKey(indexData) && indexData < 5) {
				penampung = listPesanan.get(indexData);
				penampung += listPesanan.get(buku);
				listPesanan.put(indexData, penampung);
			} else if(indexData < 5) {
				penampung = listPesanan.get(target);
				listPesanan.put(indexData, penampung);
			}		
			listPesanan.remove(target);
		} catch (Exception e) {
			System.out.println("Pilihan salah");
			scan.next();
			editBuku();
		}
	}
	
	public void ubahQty(int buku) {
		String namaBuku = "";
		Integer penampung = 0;
		Integer target = buku;
		if (target == DaftarBuku.JAVA.indexBuku) {
			namaBuku = DaftarBuku.JAVA.namaBuku;
		} else if (target == DaftarBuku.KOTLIN.indexBuku) {
			namaBuku = DaftarBuku.KOTLIN.namaBuku;
		} else if (target == DaftarBuku.SPRING.indexBuku) {
			namaBuku = DaftarBuku.SPRING.namaBuku;
		} else if (target == DaftarBuku.ANGULAR.indexBuku) {
			namaBuku = DaftarBuku.ANGULAR.namaBuku;
		}
		System.out.println("Buku " + namaBuku);
		System.out.print("masukan jumlah buku : ");
		try {
			int kuantitas = scan.nextInt();
			listPesanan.put(buku, kuantitas);
		} catch (Exception e) {
			System.out.println("Pilihan salah");
			scan.next();
			editBuku();
		}
	}
	
	public void listBuku() {
		tampilanListBuku();
		System.out.print("Pilih kuantitas buku yang akan ditambahkan: ");
		try {
			int pilihan = scan.nextInt();
			if (pilihan > 0 && pilihan < 5) {
				inputList(pilihan);
			} else if (pilihan == 99) {
				tokoBuku();
			} else {
				System.out.print("pilihan anda salah");
				listBuku();
			}
		} catch (Exception e) {
			System.out.println("Inputan yang anda masukan salah !");
			scan.next();
			listBuku();
		}
	}

	public void listHapus() {
		tampilanListPesanan();
		System.out.print("Pilih nomor buku yang akan dihapus : ");
		System.out.println("      99 . Keluar");
		try {
			int pilihan = scan.nextInt();
			if (pilihan > 0 && pilihan < 5) {
				listPesanan.remove(pilihan);
			} else if (pilihan == 99) {
				tokoBuku();
			} else {
				System.out.print("pilihan anda salah");
				scan.next();
				listHapus();
			}
		} catch (Exception e) {
			System.out.print("pilihan anda salah");
			scan.next();
			listHapus();
		}
	}

	public void rincian() {
		int biaya = 0;
		int hargaBuku = 0;
		int kuantitas = 0;
		for (Integer i : listPesanan.keySet()) {
			if (i == DaftarBuku.JAVA.indexBuku) {
				hargaBuku = DaftarBuku.JAVA.hargaBuku;
				kuantitas = listPesanan.get(i);
			} else if (i == DaftarBuku.KOTLIN.indexBuku) {
				hargaBuku = DaftarBuku.KOTLIN.hargaBuku;
				kuantitas = listPesanan.get(i);
			} else if (i == DaftarBuku.SPRING.indexBuku) {
				hargaBuku = DaftarBuku.SPRING.hargaBuku;
				kuantitas = listPesanan.get(i);
			} else if (i == DaftarBuku.ANGULAR.indexBuku) {
				hargaBuku = DaftarBuku.ANGULAR.hargaBuku;
				kuantitas = listPesanan.get(i);
			}
			biaya = biaya + (kuantitas * hargaBuku);
		}
		System.out.println("Biaya : " + biaya);
	}

	public void inputList(int pilihan) {
		String namaBuku = "";
		Integer penampung = 0;
		Integer target = pilihan;
		if (target == DaftarBuku.JAVA.indexBuku) {
			namaBuku = DaftarBuku.JAVA.namaBuku;
		} else if (target == DaftarBuku.KOTLIN.indexBuku) {
			namaBuku = DaftarBuku.KOTLIN.namaBuku;
		} else if (target == DaftarBuku.SPRING.indexBuku) {
			namaBuku = DaftarBuku.SPRING.namaBuku;
		} else if (target == DaftarBuku.ANGULAR.indexBuku) {
			namaBuku = DaftarBuku.ANGULAR.namaBuku;
		}
		System.out.println("Buku " + namaBuku);
		System.out.print("masukan jumlah buku : ");
		try {
			int kuantitas = scan.nextInt();
			if (listPesanan.containsKey(target)) {
				penampung = listPesanan.get(target);
				penampung += kuantitas;
				listPesanan.put(pilihan, penampung);
			} else {
				listPesanan.put(pilihan, kuantitas);
			}
		} catch (Exception e) {
			System.out.println("Pilihan salah");
			scan.next();
		}
	}

	public void tampilanListPesanan() {
		System.out.println("=============|Keranjang|===============");
		String namaBuku = "";
		for (Integer i : listPesanan.keySet()) {
			if (i == DaftarBuku.JAVA.indexBuku) {
				namaBuku = DaftarBuku.JAVA.namaBuku;
			} else if (i == DaftarBuku.KOTLIN.indexBuku) {
				namaBuku = DaftarBuku.KOTLIN.namaBuku;
			} else if (i == DaftarBuku.SPRING.indexBuku) {
				namaBuku = DaftarBuku.SPRING.namaBuku;
			} else if (i == DaftarBuku.ANGULAR.indexBuku) {
				namaBuku = DaftarBuku.ANGULAR.namaBuku;
			}
			System.out.println(i + ". " + namaBuku + " : " + listPesanan.get(i));
			if (namaBuku == "") {
				System.out.println("           KeranjangKosong            ");
			}
		}
	}

	public void tampilanListBuku() {
		System.out.println("\n================ List =================");
		System.out.printf("  %d . %s. harga %d\n", DaftarBuku.JAVA.indexBuku, DaftarBuku.JAVA.namaBuku,
				DaftarBuku.JAVA.hargaBuku);
		System.out.printf("  %d . %s. harga %d\n", DaftarBuku.KOTLIN.indexBuku, DaftarBuku.KOTLIN.namaBuku,
				DaftarBuku.KOTLIN.hargaBuku);
		System.out.printf("  %d . %s. harga %d\n", DaftarBuku.SPRING.indexBuku, DaftarBuku.SPRING.namaBuku,
				DaftarBuku.SPRING.hargaBuku);
		System.out.printf("  %d . %s. harga %d\n", DaftarBuku.ANGULAR.indexBuku, DaftarBuku.ANGULAR.namaBuku,
				DaftarBuku.ANGULAR.hargaBuku);
		System.out.printf(" 99 . Keluar. \n");
		System.out.println("=======================================");
	}
}
