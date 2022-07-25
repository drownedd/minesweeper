public enum Difficulty {
    EASY(9, 9, 10), MEDIUM(16, 16, 40), EXPERT(30, 16, 99);

    public final int boardWidth, boardHeight, mineCount;

    Difficulty(int boardWidth, int boardHeight, int mineCount) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.mineCount = mineCount;
    }
}

