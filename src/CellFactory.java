import java.util.ArrayList;
import java.util.Collections;

public class CellFactory {

    public static Cell[][] initialiseCells(Difficulty difficulty) {
        Cell[][] temp = new Cell[difficulty.boardHeight][difficulty.boardWidth];
        fillInMines(temp, difficulty);
        return temp;
    }

    private static void fillInMines(Cell[][] cells, Difficulty difficulty) {
        int mineCount = difficulty.mineCount;
        ArrayList<Boolean> mines = new ArrayList<>();
        for (int i = 0; i < difficulty.boardWidth * difficulty.boardHeight; i++) {
            mines.add(mineCount - i > 0);
        }
        Collections.shuffle(mines);
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(i, j, mines.remove(0));
            }
        }
    }

}
