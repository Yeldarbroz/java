package theTable;

public class Main {

	public static void main(String[] args) {
		
		Logic logic = new Logic();
		
		System.out.println("Welcome to The Table!");
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		boolean P;
		boolean Q;
		
		{
			P = true;
			Q = true;
			
			System.out.print(P);
			System.out.print("\t"+Q);
			System.out.print("\t"+logic.AND(P, Q));
			System.out.print("\t"+logic.OR(P, Q));
			System.out.print("\t"+logic.XOR(P, Q));
			System.out.println("\t"+logic.NOR(P, Q));
		}
		
		{
			P = true;
			Q = false;
			
			System.out.print(P);
			System.out.print("\t"+Q);
			System.out.print("\t"+logic.AND(P, Q));
			System.out.print("\t"+logic.OR(P, Q));
			System.out.print("\t"+logic.XOR(P, Q));
			System.out.println("\t"+logic.NOR(P, Q));
		}
		
		{
			P = false;
			Q = true;
			
			System.out.print(P);
			System.out.print("\t"+Q);
			System.out.print("\t"+logic.AND(P, Q));
			System.out.print("\t"+logic.OR(P, Q));
			System.out.print("\t"+logic.XOR(P, Q));
			System.out.println("\t"+logic.NOR(P, Q));
		}
		
		{
			P = false;
			Q = false;
			
			System.out.print(P);
			System.out.print("\t"+Q);
			System.out.print("\t"+logic.AND(P, Q));
			System.out.print("\t"+logic.OR(P, Q));
			System.out.print("\t"+logic.XOR(P, Q));
			System.out.println("\t"+logic.NOR(P, Q));
		}
		
	}
	
}
