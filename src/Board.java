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

        for (int i = 1; i < 10; i++) {
            possibles.add(i);
        }

        ArrayList<Integer> sectionNums;
        ArrayList<Integer> rowNums;
        ArrayList<Integer> colNums;

        sectionNums = getNumsInSection(r, c);
        rowNums = getNumsInRow(r);
        colNums = getNumsInColumn(c);

        for (int i = 0; i < sectionNums.size(); i++) { //removes numbers we know are not possible
            for (int j = 0; j < possibles.size(); j++) {
                if(sectionNums.get(i) == possibles.get(j)){
                    possibles.remove(j);
                }
            }
        }
        for (int i = 0; i < rowNums.size(); i++) {
            for (int j = 0; j < possibles.size(); j++) {
                if(rowNums.get(i) == possibles.get(j)){
                    possibles.remove(j);
                }
            }
        }
        for (int i = 0; i < colNums.size(); i++) {
            for (int j = 0; j < possibles.size(); j++) {
                if(colNums.get(i) == possibles.get(j)){
                    possibles.remove(j);
                }
            }
        }

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

    public ArrayList<Integer> getNumsInRow(int r){
        ArrayList<Integer> rowdefnums = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            if (squares[r][i].getDefNumber() > -1){
                rowdefnums.add(squares[r][i].getDefNumber());
            }
        }


        return rowdefnums;
    }

    public ArrayList<Integer> getNumsInColumn(int c){
        ArrayList<Integer> coldefnums = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            if (squares[i][c].getDefNumber() > -1){
                coldefnums.add(squares[i][c].getDefNumber());
            }
        }


        return coldefnums;
    }

}
