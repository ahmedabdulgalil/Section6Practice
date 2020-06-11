package SumCalculator;

public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;
	
	
	public void setFirstNumber ( double firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber( double secondNumber) {
		this.secondNumber = secondNumber; 
		
	}
	
	public double getFirstNumber ()	{
		return this.firstNumber;
	}
	
	public double getSecondNumber() {
		return this.secondNumber;
	}
	
	public double getAdditionResult () {
		
		double addition = this.firstNumber + this.secondNumber;
		return addition;
	}
	public double getSubtractionResult () {
		double subtraction = this.firstNumber - this.secondNumber;
		return subtraction;
	}
	public double getMultiplicationResult () {
		double multiplication = this.firstNumber * this.secondNumber;
		return multiplication; 
	}
	public double getDivisionResult () {
		if (this.secondNumber == 0) {
			return 0;
		}
		else {
			double division = this.firstNumber / this.secondNumber;
			return division;
			 
		}
	}

}
