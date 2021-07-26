package validSudoku;

public class ValidLinha extends Thread {

	@Override
	public void run() {
		validSudoku.ValidSudoku.validaSolucao("Sudoku - ERRO LINHA", "Linhas");
	}

}
