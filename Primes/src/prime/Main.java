package prime;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please Enter the number till which the program shall sherch for primes: ");
		
		int limit = userInput.nextInt();
		
		int number;
		
		for(number = 2; number <= limit; number++){
			
			if(isPrime(number)){
				
				System.out.println(number);
				
			}
			
		}
		
	}

	public static boolean isPrime(int number){
		
		for(int i=2; i<number; i++){
		
			if(number%i == 0){
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
}
