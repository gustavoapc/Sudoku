package tabuleiro;

public class Tabuleiro12x12 extends TabuleiroAbstrato {

	private final String[] elementosDisponiveis12x12 = {"1","2","3","4","5","6","7","8","9","A","B","C"};
	
	public Tabuleiro12x12() {
		super(3, 4);
		
	}
		
	public String[] getElementosDisponiveis12x12() {
		return elementosDisponiveis12x12;
	}
	
}