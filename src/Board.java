import java.util.ArrayList;

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
            }
        }
        for (int r = 0; r < squares.length; r++) {
            for (int c = 0; c < squares[0].length; c++) {
                if(grid[r][c] == 0){
                    squares[r][c] = new Square(getPossibles(r, c));
                }


            }
        }
    }

    public ArrayList<Integer> getPossibles(int r, int c){
        ArrayList<Integer> possibles = new ArrayList<>();



        return possibles;
    }

    public ArrayList<Integer> getNumsInSection(int r, int c){
        ArrayList<Integer> nums = new ArrayList<>();

//        if(r < 3){
//            if(c < 3){ //1, 1
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        if(squares[r][c].getDefNumber() != -1){
//                            nums.add(squares[r][c].getDefNumber());
//                        }
//                    }
//                }
//            } else if (c < 6){
//
//            }
//        } else if (r < 6){
//
//        } else {
//
//        }

        int row = (r / 3)*3;
        int col = (c % 3)*3;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (squares[row + i][col + j].getDefNumber() != -1)
                    nums.add(squares[row + 1][col + j].getDefNumber());
            }
        }

        return nums;
    }
}
