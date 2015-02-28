package prime;

import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Max number to search to: ");
		
		int limit = userInput.nextInt();
		
		for(int number = 2; number <= limit; number++){
			
			if(isPrime(number)){
				
				System.out.println(number);
				
			}
			
		}
		
	}
	
	public static boolean isPrime(int number){
	
		for(int x = 2; x < number; x++){
			
			if(number % x == 0){
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
}
