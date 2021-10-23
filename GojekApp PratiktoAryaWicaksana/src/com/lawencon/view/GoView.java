package com.lawencon.view;

import java.util.List;

import com.lawencon.model.Histori;

public abstract class GoView {
	
	protected abstract void saveHistori(List<Histori> listHistory);
	protected abstract void print();
}
