import java.util.Arrays;

public class Board {

    private Cell[][] cells;

    public Board() {
        cells = CellFactory.initialiseCells(Difficulty.EASY);
    }

    public static void main(String[] args) {
        System.out.println(new Board());
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        int mineCount = 0;
        for (Cell[] cellRow : cells) {
            str.append(Arrays.toString(cellRow)).append('\n');
            for (Cell cell : cellRow) {
                if (cell.mine()) mineCount++;
            }
        }
        return str.append('\n').append(mineCount).toString();
    }
}
