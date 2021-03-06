package com.lawencon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	List<String> jenisBukuArr = new ArrayList<String>();
	List<Integer> kuantitiBukuArr = new ArrayList<Integer>();
	List<Integer> totalHargaBukuArr = new ArrayList<Integer>();

	Scanner scan = new Scanner(System.in);
	public Integer kuantitiBuku, hargaBuku, totalHargaBuku;
	public String jenisBuku;

	public static void main(String[] args) {
		Main utama = new Main();
		utama.menuUtama();
	}

	public void menuUtama() {
		System.out.println("\n");
		System.out.println("|---------------------------------- |");
		System.out.println("|Selamat Data di Bootcamp9 Bookstore|");
		System.out.println("|-----------------------------------|");
		System.out.println("|1. Daftar Buku                     |");
		System.out.println("|2. Keluar Bookstore                |");
		System.out.println("|-----------------------------------|");
		System.out.print(" Pilih menu (1/2) : ");
		try {
			Integer pilih = scan.nextInt();
			if (pilih == 1) {
				menuBuku();
			} else if (pilih == 2) {
				System.out.print(" Terimakasih telah berbelanja\n di Toko kami :)");
				System.exit(0);
			} else {
				System.out.print(" Pilihan tidak tersedia!");
				menuUtama();
			}
		} catch (Exception e) {
			System.out.println("Salah inputan, silahkan input menu lagi...");
			scan.next();
			menuUtama();
		}
	}

	public void menuBuku() {
		Boolean found = false;
		Integer index = 0;

		System.out.println("\n");
		System.out.println("|----------------------------------- |");
		System.out.println("|            Daftar Buku             |");
		System.out.println("|------------------------------------|");
		System.out.println("|1. " + DaftarBuku.JAVA.jenis + "    Rp. " + DaftarBuku.JAVA.harga + "                |");
		System.out.println("|2. " + DaftarBuku.KOTLIN.jenis + "  Rp. " + DaftarBuku.KOTLIN.harga + "                |");
		System.out.println("|3. " + DaftarBuku.SPRING.jenis + "  Rp. " + DaftarBuku.SPRING.harga + "                |");
		System.out.println("|4. " + DaftarBuku.ANGULAR.jenis + " Rp. " + DaftarBuku.ANGULAR.harga + "                |");
		System.out.println("|5. Menu Keranjang Belanja           |");
		System.out.println("|6. Kembali ke Menu utama            |");
		System.out.println("|------------------------------------|");
		System.out.print(" Pilih Buku (1/2/3/4/5)   : ");

		try {
			Integer pilihBuku = scan.nextInt();

			if (pilihBuku == 6) {
				menuUtama();
			} else if (pilihBuku == 5) {
				menuKeranjang();
			} else if (pilihBuku == 1 || pilihBuku == 2 || pilihBuku == 3 || pilihBuku == 4) {

				System.out.print(" Masukkan Kuantiti Buku   : ");

				kuantitiBuku = scan.nextInt();
				System.out.println("|-----------------------------------|");

				try {
					if (pilihBuku == 1) {
						if (jenisBukuArr.size() == 0) {
							jenisBuku = DaftarBuku.JAVA.jenis;
							jenisBukuArr.add(jenisBuku);
							kuantitiBukuArr.add(kuantitiBuku);
							totalHargaBuku = DaftarBuku.JAVA.harga * kuantitiBuku;
							totalHargaBukuArr.add(totalHargaBuku);
						} else {
							for (int i = 0; i < jenisBukuArr.size(); i++) {
								if (jenisBukuArr.get(i) == DaftarBuku.JAVA.jenis) {
									found = true;
									index = i;
								}
							}
							if (found) {
								Integer qtyBukuLama = kuantitiBukuArr.get(index);
								Integer qtyBukuBaru = qtyBukuLama + kuantitiBuku;
								kuantitiBukuArr.set(index, qtyBukuBaru);
								totalHargaBuku = DaftarBuku.JAVA.harga * qtyBukuBaru;
								totalHargaBukuArr.set(index, totalHargaBuku);
							} else {
								jenisBuku = DaftarBuku.JAVA.jenis;
								jenisBukuArr.add(jenisBuku);
								kuantitiBukuArr.add(kuantitiBuku);
								totalHargaBuku = DaftarBuku.JAVA.harga * kuantitiBuku;
								totalHargaBukuArr.add(totalHargaBuku);
							}
						}
						menuBuku();
					} else if (pilihBuku == 2) {
						if (jenisBukuArr.size() == 0) {
							jenisBuku = DaftarBuku.KOTLIN.jenis;
							jenisBukuArr.add(jenisBuku);
							kuantitiBukuArr.add(kuantitiBuku);
							totalHargaBuku = DaftarBuku.KOTLIN.harga * kuantitiBuku;
							totalHargaBukuArr.add(totalHargaBuku);
						} else {
							for (int i = 0; i < jenisBukuArr.size(); i++) {
								if (jenisBukuArr.get(i) == DaftarBuku.KOTLIN.jenis) {
									found = true;
									index = i;
								}
							}
							if (found) {
								Integer qtyBukuLama = kuantitiBukuArr.get(index);
								Integer qtyBukuBaru = qtyBukuLama + kuantitiBuku;
								kuantitiBukuArr.set(index, qtyBukuBaru);
								totalHargaBuku = DaftarBuku.KOTLIN.harga * qtyBukuBaru;
								totalHargaBukuArr.set(index, totalHargaBuku);
							} else {
								jenisBuku = DaftarBuku.KOTLIN.jenis;
								jenisBukuArr.add(jenisBuku);
								kuantitiBukuArr.add(kuantitiBuku);
								totalHargaBuku = DaftarBuku.KOTLIN.harga * kuantitiBuku;
								totalHargaBukuArr.add(totalHargaBuku);
							}
						}
						menuBuku();
					} else if (pilihBuku == 3) {
						if (jenisBukuArr.size() == 0) {
							jenisBuku = DaftarBuku.SPRING.jenis;
							jenisBukuArr.add(jenisBuku);
							kuantitiBukuArr.add(kuantitiBuku);
							totalHargaBuku = DaftarBuku.SPRING.harga * kuantitiBuku;
							totalHargaBukuArr.add(totalHargaBuku);
						} else {
							for (int i = 0; i < jenisBukuArr.size(); i++) {
								if (jenisBukuArr.get(i) == DaftarBuku.SPRING.jenis) {
									found = true;
									index = i;
								}
							}
							if (found) {
								Integer qtyBukuLama = kuantitiBukuArr.get(index);
								Integer qtyBukuBaru = qtyBukuLama + kuantitiBuku;
								kuantitiBukuArr.set(index, qtyBukuBaru);
								totalHargaBuku = DaftarBuku.SPRING.harga * qtyBukuBaru;
								totalHargaBukuArr.set(index, totalHargaBuku);
							} else {
								jenisBuku = DaftarBuku.SPRING.jenis;
								jenisBukuArr.add(jenisBuku);
								kuantitiBukuArr.add(kuantitiBuku);
								totalHargaBuku = DaftarBuku.SPRING.harga * kuantitiBuku;
								totalHargaBukuArr.add(totalHargaBuku);
							}
						}
						menuBuku();
					} else if (pilihBuku == 4) {
						if (jenisBukuArr.size() == 0) {
							jenisBuku = DaftarBuku.ANGULAR.jenis;
							jenisBukuArr.add(jenisBuku);
							kuantitiBukuArr.add(kuantitiBuku);
							totalHargaBuku = DaftarBuku.ANGULAR.harga * kuantitiBuku;
							totalHargaBukuArr.add(totalHargaBuku);
						} else {
							for (int i = 0; i < jenisBukuArr.size(); i++) {
								if (jenisBukuArr.get(i) == DaftarBuku.ANGULAR.jenis) {
									found = true;
									index = i;
								}
							}
							if (found) {
								Integer qtyBukuLama = kuantitiBukuArr.get(index);
								Integer qtyBukuBaru = qtyBukuLama + kuantitiBuku;
								kuantitiBukuArr.set(index, qtyBukuBaru);
								totalHargaBuku = DaftarBuku.ANGULAR.harga * qtyBukuBaru;
								totalHargaBukuArr.set(index, totalHargaBuku);
							} else {
								jenisBuku = DaftarBuku.ANGULAR.jenis;
								jenisBukuArr.add(jenisBuku);
								kuantitiBukuArr.add(kuantitiBuku);
								totalHargaBuku = DaftarBuku.ANGULAR.harga * kuantitiBuku;
								totalHargaBukuArr.add(totalHargaBuku);
							}
						}
						menuBuku();
					} else {
						System.out.print(" Pilihan tidak tersedia!");
						menuBuku();
					}
				} catch (Exception e) {
					System.out.println(" Salah inputan, silahkan input kuantiti Buku lagi...");
					scan.next();
					menuBuku();
				}
			} else {
				System.out.print(" Pilihan tidak tersedia!");
				menuBuku();
			}
		} catch (Exception e) {
			System.out.println(" Salah inputan, silahkan input Buku lagi...");
			scan.next();
			menuBuku();
		}
	}

	public void menuKeranjang() {
		System.out.println("\n");
		System.out.println("|---------------------------------- |");
		System.out.println("|         Keranjang Belanja         |");
		System.out.println("|-----------------------------------|");
		System.out.println("|1. Lihat Keranjang Belanja         |");
		System.out.println("|2. Edit Item Belanja               |");
		System.out.println("|3. Hapus Item Belanja              |");
		System.out.println("|4. Kembali ke Menu Buku            |");
		System.out.println("|-----------------------------------|");
		System.out.print(" Pilih menu (1/2/3)   : ");

		try {
			Integer pilihMenuKeranjang = scan.nextInt();

			if (pilihMenuKeranjang == 1) {
				lihatKeranjang();
				menuKeranjang();
			} else if (pilihMenuKeranjang == 2) {
				editKeranjang();
			} else if (pilihMenuKeranjang == 3) {
				hapusItemKeranjang();
				menuKeranjang();
			} else if (pilihMenuKeranjang == 4) {
				menuBuku();
			} else {
				System.out.print(" Pilihan tidak tersedia!");
				menuKeranjang();
			}
		} catch (Exception e) {
			System.out.println(" Salah inputan, silahkan input menu lagi...");
			scan.next();
			menuKeranjang();
		}
	}

	public void lihatKeranjang() {
		Integer totalHargaSeluruhBuku = 0;
		for (int i = 0; i < jenisBukuArr.size(); i++) {
			System.out.println(i + 1 + ". " + jenisBukuArr.get(i));
			System.out.println("   Kuantiti  : " + kuantitiBukuArr.get(i));
		}

		for (int j = 0; j < totalHargaBukuArr.size(); j++) {
			totalHargaSeluruhBuku += totalHargaBukuArr.get(j);
		}
		System.out.println("Total Harga Buku : " + totalHargaSeluruhBuku);
	}

	public void editKeranjang() {
		System.out.println("\n");
		System.out.println("|---------------------------------- |");
		System.out.println("|       Edit Keranjang Belanja      |");
		System.out.println("|-----------------------------------|");
		System.out.println("|1. Edit Jenis Buku                 |");
		System.out.println("|2. Edit Kuantiti Buku              |");
		System.out.println("|3. Kembali ke Menu Keranjang       |");
		System.out.println("|-----------------------------------|");
		System.out.print(" Pilih menu (1/2/3)   : ");

		try {
			Integer pilihEditKeranjang = scan.nextInt();

			if (pilihEditKeranjang == 1) {
				editJenisBuku();
			} else if (pilihEditKeranjang == 2) {
				editKuantitiBuku();
			} else if (pilihEditKeranjang == 3) {
				menuKeranjang();
			} else {
				System.out.print(" Pilihan tidak tersedia!");
				editKeranjang();
			}
		} catch (Exception e) {
			System.out.println(" Salah inputan, silahkan input menu lagi...");
			scan.next();
			editKeranjang();
		}
	}

	public void editJenisBuku() {
		String bukuBaru;
		int indexBuku = 0;
		int jumlahBuku = 0;
		int penampung = 0;

		System.out.println("\n");
		System.out.println("|---------------------------------- |");
		System.out.println("|          Edit Jenis Buku          |");
		System.out.println("|-----------------------------------|");
		System.out.println("|          Keranjang Buku           |");

		for (int i = 0; i < jenisBukuArr.size(); i++) {
			System.out.println(i + 1 + ". " + jenisBukuArr.get(i));
			System.out.println("   Kuantiti  : " + kuantitiBukuArr.get(i));
		}
		
		System.out.print(" Pilih buku yang ingin diganti : ");
		Integer pilihBuku = scan.nextInt();
		
		System.out.print(" Pilih buku baru : ");
		Integer pilihBukuBaru = scan.nextInt();
		switch (pilihBukuBaru) {
		
		case 1:
			if(kuantitiBukuArr.get(pilihBukuBaru-1) != null) {
				penampung = kuantitiBukuArr.get(pilihBuku-1);
				penampung += kuantitiBukuArr.get(pilihBukuBaru-1); 
				kuantitiBukuArr.set(pilihBukuBaru - 1, penampung);
			} else {
				kuantitiBukuArr.set(pilihBukuBaru - 1, kuantitiBukuArr.get(pilihBuku - 1));
			}
			jenisBukuArr.set(pilihBuku - 1, DaftarBuku.JAVA.jenis);
			
			jenisBukuArr.remove(pilihBuku - 1);
			kuantitiBukuArr.remove(pilihBuku - 1);
			totalHargaBukuArr.remove(pilihBuku - 1);
			
			menuKeranjang();
			break;
			
		case 2:			
			if(kuantitiBukuArr.get(pilihBukuBaru-1) != null) {
				penampung = kuantitiBukuArr.get(pilihBuku-1);
				penampung += kuantitiBukuArr.get(pilihBukuBaru-1); 
				kuantitiBukuArr.set(pilihBukuBaru - 1, penampung);
			} else {
				kuantitiBukuArr.set(pilihBukuBaru - 1, kuantitiBukuArr.get(pilihBuku - 1));
			}
			jenisBukuArr.set(pilihBuku - 1, DaftarBuku.KOTLIN.jenis);
			
			jenisBukuArr.remove(pilihBuku - 1);
			kuantitiBukuArr.remove(pilihBuku - 1);
			totalHargaBukuArr.remove(pilihBuku - 1);
			
			menuKeranjang();
			break;
			
		case 3:
			if(kuantitiBukuArr.get(pilihBukuBaru-1) != null) {
				penampung = kuantitiBukuArr.get(pilihBuku-1);
				penampung += kuantitiBukuArr.get(pilihBukuBaru-1); 
				kuantitiBukuArr.set(pilihBukuBaru - 1, penampung);
			} else {
				kuantitiBukuArr.set(pilihBukuBaru - 1, kuantitiBukuArr.get(pilihBuku - 1));
			}
			jenisBukuArr.set(pilihBuku - 1, DaftarBuku.SPRING.jenis);
			
			jenisBukuArr.remove(pilihBuku - 1);
			kuantitiBukuArr.remove(pilihBuku - 1);
			totalHargaBukuArr.remove(pilihBuku - 1);
			
			menuKeranjang();
			break;
			
		case 4:
			if(kuantitiBukuArr.get(pilihBukuBaru-1) != null) {
				penampung = kuantitiBukuArr.get(pilihBuku-1);
				penampung += kuantitiBukuArr.get(pilihBukuBaru-1); 
				kuantitiBukuArr.set(pilihBukuBaru - 1, penampung);
			} else {
				kuantitiBukuArr.set(pilihBukuBaru - 1, kuantitiBukuArr.get(pilihBuku - 1));
			}
			jenisBukuArr.set(pilihBuku - 1, DaftarBuku.ANGULAR.jenis);
			
			jenisBukuArr.remove(pilihBuku - 1);
			kuantitiBukuArr.remove(pilihBuku - 1);
			totalHargaBukuArr.remove(pilihBuku - 1);
			
			menuKeranjang();
			break;
			
		default:
			editJenisBuku();
			break;
		}
	}
	

	public void editKuantitiBuku() {
		System.out.println("\n");
		System.out.println("|---------------------------------- |");
		System.out.println("|        Edit Kuantiti Buku         |");
		System.out.println("|-----------------------------------|");
		System.out.println("|          Keranjang Buku           |");

		for (int i = 0; i < jenisBukuArr.size(); i++) {
			System.out.println(i + 1 + ". " + jenisBukuArr.get(i));
			System.out.println("   Kuantiti  : " + kuantitiBukuArr.get(i));
		}

		System.out.print(" Pilih buku  : ");

		try {
			Integer pilihBuku = scan.nextInt();
			jenisBukuArr.get(pilihBuku - 1);

			System.out.print(" Input qty buku baru  : ");
			Integer inputQty = scan.nextInt();

			if (jenisBukuArr.get(pilihBuku - 1) == DaftarBuku.JAVA.jenis) {
				totalHargaBuku = inputQty * DaftarBuku.JAVA.harga;
				totalHargaBukuArr.set(pilihBuku - 1, totalHargaBuku);
			} else if (jenisBukuArr.get(pilihBuku - 1) == DaftarBuku.KOTLIN.jenis) {
				totalHargaBuku = inputQty * DaftarBuku.KOTLIN.harga;
				totalHargaBukuArr.set(pilihBuku - 1, totalHargaBuku);
			} else if (jenisBukuArr.get(pilihBuku - 1) == DaftarBuku.SPRING.jenis) {
				totalHargaBuku = inputQty * DaftarBuku.SPRING.harga;
				totalHargaBukuArr.set(pilihBuku - 1, totalHargaBuku);
			} else if (jenisBukuArr.get(pilihBuku - 1) == DaftarBuku.ANGULAR.jenis) {
				totalHargaBuku = inputQty * DaftarBuku.ANGULAR.harga;
				totalHargaBukuArr.set(pilihBuku - 1, totalHargaBuku);
			} else {
				editKuantitiBuku();
			}

			kuantitiBukuArr.set(pilihBuku - 1, inputQty);
			menuKeranjang();
		} catch (Exception e) {
			System.out.println(" Salah inputan, silahkan input lagi...");
			scan.next();
			editKuantitiBuku();
		}

	}

	public void hapusItemKeranjang() {
		System.out.println("\n");
		System.out.println("|---------------------------------- |");
		System.out.println("|             Hapus Item            |");
		System.out.println("|-----------------------------------|");
		for (int i = 0; i < jenisBukuArr.size(); i++) {
			System.out.println(i + 1 + ". " + jenisBukuArr.get(i));
		}
		System.out.println("|-----------------------------------|");
		System.out.print(" Pilih Item (1/2/3/...)   : ");

		try {
			Integer pilihHapusItem = scan.nextInt();
			jenisBukuArr.remove(pilihHapusItem - 1);
			kuantitiBukuArr.remove(pilihHapusItem - 1);
			totalHargaBukuArr.remove(pilihHapusItem - 1);
		} catch (Exception e) {
			System.out.println(" Salah inputan, silahkan input lagi...");
			scan.next();
			hapusItemKeranjang();
		}
	}
}
