package com.lawencon.view;

import java.util.ArrayList;
import java.util.List;
import com.lawencon.model.Barang;
import com.lawencon.service.StokServiceImpl;
import java.util.Scanner;

public class IndukView {
	protected List<Barang> item = new ArrayList<Barang>();
	private Scanner scan = new Scanner(System.in);
	protected StokServiceImpl gudang = new StokServiceImpl();

	public void listJenisItem() {
		for (Barang i : item) {
			System.out.println(i.getJenis());
		}
	}

	public void listSemuaItem() {
		int a = 0;
		for (Barang i : item) {
			System.out.println(a + ". " + i.getJenis() + " " + i.getItem() + " " + i.getHarga() + " " + i.getStok());
			a++;
		}
	}

	public void tambahItem(String user) {
		if (user.equals("Pedagang")) {

			Barang masukan = new Barang();
			System.out.println("Nama Jenis Item : ");
			String jenis = scan.next();
			System.out.println("Nama Item       : ");
			String item = scan.next();
			System.out.println("Jumlah Stok     : ");
			Integer stok = scan.nextInt();
			System.out.println("Besar Harga     : ");
			Integer harga = scan.nextInt();

			masukan.setItem(item);
			masukan.setJenis(jenis);
			masukan.setStok(stok);
			masukan.setHarga(harga);

			gudang.tambah(masukan);

		} else if (user.equals("Pelanggan")) {

		}
	}

	public void hapusItem(String user) {
		if (user.equals("Pedagang")) {
			
			listSemuaItem();
			System.out.println("pilih barang yang akan diubah : ");
			Integer index = scan.nextInt();
			gudang.hapus(index);
			System.out.println("barang dihapus");
			
		} else if (user.equals("Pelanggan")) {

		}
	}

	public void ubahItem(String user) {
		if (user.equals("Pedagang")) {
			
			listSemuaItem();
			System.out.println("pilih barang yang akan diubah : ");
			Integer index = scan.nextInt();
			Barang masukan = new Barang();
			System.out.println("Nama Jenis Item : ");
			String jenis = scan.next();
			System.out.println("Nama Item       : ");
			String item = scan.next();
			System.out.println("Jumlah Stok     : ");
			Integer stok = scan.nextInt();
			System.out.println("Besar Harga     : ");
			Integer harga = scan.nextInt();
			masukan.setItem(item);
			masukan.setJenis(jenis);
			masukan.setStok(stok);
			masukan.setHarga(harga);
			gudang.ubah(index, masukan);
			System.out.println("barang diubah");
			
		} else if (user.equals("Pelanggan")) {

		}
	}

	public void logIn() {

	}

	public void keluar() {
		System.exit(0);
	}
}
