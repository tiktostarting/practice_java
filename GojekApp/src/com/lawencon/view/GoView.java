package com.lawencon.view;

import java.util.List;

import com.lawencon.model.History;

public abstract class GoView {

	protected abstract void print();
	
	protected abstract void saveHistory(List<History> listHistory);
}
