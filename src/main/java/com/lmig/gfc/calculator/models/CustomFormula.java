package com.lmig.gfc.calculator.models;

public class CustomFormula {

	String placeHolder = "";
	String customFormula;
	String placeHolder2 = "";
	String placeHolder3 = "";
	char operator = ' ';
	char operator2 = ' ';
	int k = 0;
	int z = 0;
	double numberOne;
	double numberTwo;
	double numberThree;

	char[] operatorArray = new char[] { '+', '-', '*', '/' };

	public CustomFormula() {
		this.placeHolder = "";
		this.customFormula = "";
		this.placeHolder2 = "";
		this.placeHolder3 = "";
	}

	public CustomFormula(String formula) {
		this.customFormula = formula;

	}

	public double takeApartFormula() {

		if (customFormula == "") {
			return 0;
		} else {

			for (int i = 0; i < customFormula.length(); i++) {
				if (customFormula.charAt(i) == '1') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '2') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '3') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '4') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '5') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '6') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '7') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '8') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '9') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '0') {
					placeHolder = placeHolder + customFormula.charAt(i);

				}
				if (customFormula.charAt(i) == '*' || customFormula.charAt(i) == '/' || customFormula.charAt(i) == '+'
						|| customFormula.charAt(i) == '-') {
					operator = customFormula.charAt(i);
					
					k = i;
					break;
				}


			for (int j = k+1; j < customFormula.length(); j++) {
				if (customFormula.charAt(j) == '1') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);

				}
				if (customFormula.charAt(j) == '2') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);
				}
				if (customFormula.charAt(j) == '3') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);

				}
				if (customFormula.charAt(j) == '4') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);

				}
				if (customFormula.charAt(j) == '5') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);

				}
				if (customFormula.charAt(j) == '6') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);

				}
				if (customFormula.charAt(j) == '7') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);

				}
				if (customFormula.charAt(j) == '8') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);

				}
				if (customFormula.charAt(j) == '9') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);

				}
				if (customFormula.charAt(j) == '0') {
					placeHolder2 = placeHolder2 + customFormula.charAt(j);

				}
				if (customFormula.charAt(j) == '*' || customFormula.charAt(j) == '/' || customFormula.charAt(j) == '+'
						|| customFormula.charAt(j) == '-') {
					operator2 = customFormula.charAt(j);
					j = z;
					
					break;
				}

			}

			for (int p = z; p < customFormula.length(); p++) {
				if (customFormula.charAt(p) == '1') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);

				}
				if (customFormula.charAt(p) == '2') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);
				}
				if (customFormula.charAt(p) == '3') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);

				}
				if (customFormula.charAt(p) == '4') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);

				}
				if (customFormula.charAt(p) == '5') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);

				}
				if (customFormula.charAt(p) == '6') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);

				}
				if (customFormula.charAt(p) == '7') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);

				}
				if (customFormula.charAt(p) == '8') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);

				}
				if (customFormula.charAt(p) == '9') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);

				}
				if (customFormula.charAt(p) == '0') {
					placeHolder3 = placeHolder3 + customFormula.charAt(p);

				}
				else {
				

					break;

				}
			}
			numberTwo = Double.parseDouble(placeHolder2);
			numberThree = Double.parseDouble(placeHolder3);
			numberOne = Double.parseDouble(placeHolder);
				
				
				
				
		}
		}
		return doMath(numberOne, numberTwo, numberThree, operator, operator2);
	}

	public double doMath(Double numberOne, Double numberTwo, Double numberThree, char operator, char operator2) {
		if (operator2 == '*' && operator == '*') {
			return //numberOne * numberTwo * numberThree;
					numberThree;
		}
		if (operator2 == '*' && operator == '/') {
			return numberOne * numberTwo / numberThree;
		}
		if (operator2 == '/' && operator == '/') {
			return numberOne / numberTwo / numberThree;
		}
		if (operator2 == '*' && operator == '+') {
			return numberThree * numberTwo + numberOne;
		} 
		if (operator2 == '*' && operator == '-') {
			return numberThree * numberTwo - numberOne;
		}
		if (operator2 == '/' && operator == '+') {
			return numberThree / numberTwo + numberOne;
		}
		if (operator2 == '+' && operator == '*') {
			return numberOne * numberTwo + numberThree;
		} 
		if (operator2 == '-' && operator == '*') {
			return numberOne * numberTwo + numberThree;
		}
		if (operator2 == '/' && operator == '*') {
			return numberOne * numberTwo / numberThree;
		}
		if (operator2 == '+' && operator == '/') {
			return numberOne / numberTwo + numberThree;
		}
		if (operator2 == '+' && operator == '+') {
			return numberOne + numberTwo + numberThree;
		}
		
		if (operator2 == '-' && operator == '/') {
			return numberOne / numberTwo - numberThree;
		}
		if (operator2 == '-' && operator == '-') {
			return numberOne - numberTwo - numberThree;
		}
		if (operator2 == ' ' && operator == '-') {
			return numberOne - numberTwo;
		}
		if (operator2 == ' ' && operator == '+') {
			return numberOne + numberTwo;
		}
		if (operator2 == ' ' && operator == '*') {
			return numberOne * numberTwo;
		}
		if (operator2 == ' ' && operator == '/') {
			return numberOne / numberTwo;
		}
		if ( operator == '-') {
			return numberOne - numberTwo;
		}
		if ( operator == '+') {
			return numberOne + numberTwo;
		}
		if ( operator == '*') {
			return numberOne * numberTwo;
		}
		if ( operator == '/') {
			return numberOne / numberTwo;
		}
		else {
			return 0.0;
		}
	}

	public String returnFormula() {
		return customFormula;
	}

}
