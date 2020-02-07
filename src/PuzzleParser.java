import java.io.File;
import java.util.Scanner;
 
public class PuzzleParser {
 
    public static void main(String[] args) {
        PuzzleParser test = new PuzzleParser();
        int[][] puzz = test.readPuzzle("easy");
        for(int[] row : puzz){
            for(int n : row){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
 
 
    public int[][] readPuzzle(String fileName){
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int[][] grid = new int[9][9];
            int r = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineArr = line.split(" ");
                for (int c = 0; c < 9; c++) {
                    grid[r][c] = Integer.parseInt(lineArr[c]);
                }
                r++;
            }
            return grid;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
 
 
}