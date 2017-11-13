package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Memory {

	private ArrayList<Double> memList;

	public Memory() {
		memList = new ArrayList<Double>();
	}

	public void add(double i) {
		memList.add(i);
	}

	public void sub() {

		if (memList.size() > 0) {
			memList.remove(memList.size() - 1);
		}
	}

	public void clear() {
		memList.clear();
	}
	
	public int getSize() {
		return memList.size();
	}

}
