package calc;

public class OpperationsForCalc {
	public double multiply(double firstNum, double seccondNum){
		double result = firstNum * seccondNum;
		return result;
	}
	public double divide(double firstNum, double seccondNum){
		double result = firstNum / seccondNum;
		return result;
	}
	public double add(double firstNum, double seccondNum){
		double result = firstNum + seccondNum;
		return result;
	}
	public double subtract(double firstNum, double seccondNum){
		double result = firstNum - seccondNum;
		return result;
	}
	
	public int divideInt(double firstNum, double seccondNum){
		int result = (int) (firstNum / seccondNum);
		return result;
	}
	
	public int remainderInt(double firstNum, double seccondNum){
		int result = (int) (firstNum % seccondNum);
		return result;
	}
	
}
