package com.lmig.gfc.calculator.models;

import java.lang.Math;

public class Calculator {

	private double numberOne;
	private double numberTwo;
	private double powerOfNumOne = 0;
	private String operator;
	private double answer;

	public Calculator() {
		this.numberOne = 0;
		this.numberTwo = 0;
		this.operator = "+";

	}

	public Calculator(Double numberOne, Double numberTwo, String operator) {
		this.numberOne = numberOne;
		if (numberTwo != null) {
			this.numberTwo = numberTwo;
		} else {
			numberTwo = 0.0;
		}
		this.operator = operator;

	}

	public double doMath() {

		if (operator.equals("*")) {
			answer=numberOne * numberTwo;
			return answer;
		}
		if (operator.equals("/")) {
			answer= numberOne / numberTwo;
			return answer;
		}
		if (operator.equals("+")) {
			answer= numberOne + numberTwo;
			return answer;
		}
		if (operator.equals("-")) {
			answer= numberOne - numberTwo;
			return answer;
		}
		if (operator.equals("^")) {
			answer= powerOf();
			return answer;
		}
		if (operator.equals("rt")) {

			answer= rootof();
			return answer;
		}
		if (operator.equals("log")) {
			answer= logOf();
			return answer;
		}
		if (operator.equals("sin")) {
			this.numberTwo = 0;
			answer= sinOf();
			return answer;
		}
		if (operator.equals("tan")) {
			this.numberTwo = 0;
			answer= tanOf();
			return answer;
		}
		if (operator.equals("cos")) {
			this.numberTwo = 0;
			answer= cosOf();
			return answer;
		}
		if (operator.equals("sinh")) {
			this.numberTwo = 0;
			answer= sinhOf();
			return answer;
		}
		if (operator.equals("cosh")) {
			this.numberTwo = 0;
			answer= coshOf();
			return answer;
		}
		if (operator.equals("tanh")) {
			this.numberTwo = 0;
			answer= tanhOf();
			return answer;
		}
		return 0;
	}

	public double rootof() {

		return Math.pow(Math.exp(1 / numberTwo), Math.log(numberOne));
	}

	public double powerOf() {

		powerOfNumOne = numberOne * numberOne;

		for (int i = 1; i < numberTwo - 1; i++) {

			powerOfNumOne = numberOne * powerOfNumOne;

		}
		return powerOfNumOne;
	}

	public double logOf() {

		return Math.log(numberTwo) / Math.log(numberOne);
	}

	public double sinOf() {

		return Math.sin(Math.toRadians(numberOne));
	}

	public double sinhOf() {

		return Math.sinh(Math.toRadians(numberOne));
	}

	public double cosOf() {

		return Math.cos(Math.toRadians(numberOne));
	}

	public double coshOf() {

		return Math.cosh(Math.toRadians(numberOne));
	}

	public double tanOf() {

		return Math.tan(Math.toRadians(numberOne));
	}
	
	public double tanhOf() {

		return Math.tan(Math.toRadians(numberOne));
	}
	
	public double getAns() {

		return answer;
	}



}
