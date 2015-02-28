package calc;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		
		OpperationsForCalc calc = new OpperationsForCalc();
		
		@SuppressWarnings("resource")
		Scanner UserInput = new Scanner(System.in);
		
		boolean validNum = false;
		
		while(validNum == false){
				
			System.out.print("Enter first number: ");
			
			double firstNum = UserInput.nextInt();
			
			System.out.print("Enter second number: ");
			
			double seccondNum = UserInput.nextInt();
			
			boolean validOpp = false;
		
			while(validOpp == false){
			
				System.out.print("enter 1 to add, 2 to subtract, 3 to multiply, 4 to divide: ");
				
				int opperation = UserInput.nextInt();
				
				if(0 < opperation && opperation < 5){
				
						if(opperation == 1){
							validNum = true;
							System.out.println("Your answer is " + calc.add(firstNum, seccondNum));
						}
						
						if(opperation == 2){
							validNum = true;
							System.out.println("Your answer is " + calc.subtract(firstNum, seccondNum));
						}
						
						if(opperation == 3){
							validNum = true;
							System.out.println("Your answer is " + calc.multiply(firstNum, seccondNum));
						}
						
						if(opperation == 4){
							
							if(firstNum != 0 && seccondNum != 0){
								
								boolean validWOrR = false;
								
								while(validWOrR == false){
									
									System.out.print("Do you want a whole (1) or rational (2) number: ");
									
									int wOrR = UserInput.nextInt();
									
									if(0 < wOrR && 3 > wOrR){
										
										if(wOrR == 2){
											System.out.println("Your answer is " + calc.divide(firstNum, seccondNum));
										}
										
										if(wOrR == 1){
											System.out.println("Your awnser is " + calc.divideInt(firstNum, seccondNum));
											System.out.println("Your remainder is " + calc.remainderInt(firstNum, seccondNum));
										}
										
										validNum = true;
										validWOrR = true;
										
									} else {
										System.out.println("This is not a valid number type");
									}
									
								}
							
							} else {
								System.out.println("Please don't try to devide by zero, it won't get you anywhere");
							}
							
						}
					
						validOpp = true;
						
				} else { 
						System.out.println("This is not a valid oppration");
				}
			
			}
		
		}

	}
		
}
