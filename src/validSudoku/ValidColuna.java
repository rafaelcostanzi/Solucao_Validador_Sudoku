package validSudoku;

public class ValidColuna extends Thread {

	@Override
	public void run() {
		validSudoku.ValidSudoku.validaSolucao("Sudoku - ERRO COLUNA", "Colunas");
	}

}
