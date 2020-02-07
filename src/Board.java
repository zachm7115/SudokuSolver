public class Board {

    int[][] grid;
    Square [][] squares;

    public Board(int[][] grid) {
        this.grid = grid;
        squares = new Square[9][9];
        for (int r = 0; r < squares.length; r++) {
            for (int c = 0; c < squares[0].length; c++) {
                if(grid[r][c] != 0)
                    squares[r][c] = new Square(grid[r][c]);
                else

            }
        }
    }

    public void getPossibles(){

    }
}
