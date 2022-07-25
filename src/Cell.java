public record Cell(int row, int col, boolean mine) {

    @Override
    public String toString() {
        return mine ? "X" : "O";
    }
}
