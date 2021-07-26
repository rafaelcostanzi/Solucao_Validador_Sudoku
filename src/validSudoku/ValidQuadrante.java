package validSudoku;

public class ValidQuadrante extends Thread {

	@Override
	public void run() {
		validSudoku.ValidSudoku.validaSolucao("Sudoku - ERRO QUADRANTE", "Quadrantes");
	}
}
