//Dinus Class
package at.edu.c02.calculator.logic.operations;

import at.edu.c02.calculator.CalculatorException;
import at.edu.c02.calculator.MathOperation;

public class Sqrt implements MathOperation{

	@Override
	public double calculate(double a, double b) throws CalculatorException {
		//IGNORE b for now
		// TODO Auto-generated method stub
		return Math.sqrt(a);
	}


}
