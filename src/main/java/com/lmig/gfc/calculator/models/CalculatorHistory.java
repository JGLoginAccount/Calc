package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class CalculatorHistory {
	private ArrayList<Calculator> calcList;

	public CalculatorHistory() {
		calcList = new ArrayList<Calculator>();
	}

	public void addCalc(Calculator c) {
		calcList.add(c);
	}

	public int calcLength() {
		if (calcList.size() > 0) {
			return calcList.size();
		} else {
			return 0;
		}
	}

	public double getAns(int i) {

		return calcList.get(i).getAns();
	}

}
