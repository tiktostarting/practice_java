package com.lawencon.view;

import java.util.List;

import com.lawencon.model.Histori;
import com.lawencon.helper.OnDoneListener;

public class HistoriView {
	
	public void show(List<Histori> listHistory, OnDoneListener listener) {
		int nomorList = 0;
		System.out.println("\n===== goApps Histori =====");
		for(Histori histori: listHistory) {
			System.out.println(nomorList + "\n	Tipe Layanan : " + histori.getServiceType());
			System.out.println("	Biaya : " + histori.getTotalPrice());
			nomorList++;
		}
		
		listener.done();
	}
	
}
