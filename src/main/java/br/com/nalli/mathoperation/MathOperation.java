package br.com.nalli.mathoperation;

public class MathOperation {

	public double sum(double numberOne,double numberTwo) {
		 Double result = numberOne +  numberTwo;
		return result;
		 
	}
	
	public double subtraction(double numberOne,double numberTwo) {
		 Double result = numberOne -  numberTwo;
		return result;
		 
	}
	
	public double multiplication(double numberOne,double numberTwo) {
		 Double result = (numberOne * numberTwo);
		return result;
		 
	}
	
	public double division(double numberOne,double numberTwo) {
		 Double result = (numberOne / numberTwo);
		return result;
		 
	}
	
	public double media(double numberOne,double numberTwo) {
		 Double result = ((numberOne +  numberTwo)/2);
		return result;
		 
	}
	
	public double squareRoot(double numberOne) {
		 Double result = Math.sqrt((numberOne)) ;;
		return result;
		 
	}
	
	
}
