/*
 *Aluno: Rafael Costanzi
 *RA: 1484036
 * 
 * O código irá informar caso a matriz sudoku esteja errada, 
 * caso a matriz esteja correta o código não retornará nada.
 * 
 * Se Errada o código informará onde foi encontrado o erro.
 *
 **/

package validSudoku;

import java.util.HashSet;

public class ValidSudoku {

    final static char[][] matrizSudoku = { 
    		{ 2, 3, 7, 8, 4, 1, 5, 6, 9 }, 
    		{ 1, 8, 6, 7, 9, 5, 2, 4, 3 },
            { 5, 9, 4, 3, 2, 6, 7, 1, 8 }, 
            { 3, 1, 5, 6, 7, 4, 8, 9, 2 }, 
            { 4, 6, 9, 5, 8, 2, 1, 3, 7 },
            { 7, 2, 8, 1, 3, 9, 4, 5, 6 }, 
            { 6, 4, 2, 9, 1, 8, 3, 7, 5 }, 
            { 8, 5, 3, 4, 6, 7, 9, 2, 1 },
            { 9, 7, 1, 2, 5, 3, 6, 8, 4 } 
    };
    
    public static void validaSolucao(String mensagem, String validacao) {
    	HashSet<String> autenticado = new HashSet<String>();
		Boolean isOk = true;
		
		for (Integer i=0; i<9; ++i) {
			for (Integer j=0; j<9; ++j) {
				char valor_atual = matrizSudoku[i][j];
				if (valor_atual != '.') {
					switch (validacao) {
					case "Colunas":
						if (!autenticado.add(valor_atual + " Erro na coluna " + j)) {
							Integer l = j + 1;
							isOk = false;
							System.out.println(mensagem + " " + l);
						}
						break;
					case "Linhas":
						if (!autenticado.add(valor_atual + " Erro na linha " + i)) {
							Integer k = i + 1;
							isOk = false;
							System.out.println(mensagem + " " + k);
						}
						break;
					case "Quadrantes":
						if (!autenticado.add(valor_atual + " Erro no quadrante " + i/3 + "-" + j/3)) {
							Integer k = (j/3) + 1;
							Integer l = (i/3) + 1;
							isOk = false;
							System.out.println(mensagem + " " + k + "-" + l);
						}
						break;
					}
					
				}
			}
		}
		if (isOk) System.out.println("Sudoku - " + validacao + " Válida(o)");
    }
    
	public static void main(String[] args) {
		
		ValidLinha vl = new ValidLinha();
		vl.start();
		
		ValidColuna vc = new ValidColuna();
		vc.start();
		
		ValidQuadrante vq = new ValidQuadrante();
		vq.start();
	}
}