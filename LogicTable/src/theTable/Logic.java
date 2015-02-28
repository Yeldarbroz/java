package theTable;

public class Logic {

	public boolean AND(boolean P, boolean Q){
		boolean result = P & Q;
		return result;
	}

	public boolean OR(boolean P, boolean Q){
		boolean result = P | Q;
		return result;
	}

	public boolean XOR(boolean P, boolean Q){
		boolean result = P ^ Q;
		return result;
	}

	public boolean NOR(boolean P, boolean Q){
		boolean result = !P;
		return result;
	}
}
