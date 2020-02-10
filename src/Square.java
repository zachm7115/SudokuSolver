import java.util.ArrayList;

public class Square {
    int defNumber, score;
    ArrayList<Integer> possibleNumbers = new ArrayList<Integer>();
    int x,y;
    public Square(int defNumber, int x, int y) {
        this.defNumber = defNumber;
        this.x = x;
        this.y = y;

    }

    public Square(ArrayList possibleNumbers) {
        possibleNumbers = new ArrayList<Integer>();
        this.defNumber = -1;
        this.possibleNumbers = possibleNumbers;
        int score = -1;
    }



    public int getDefNumber(){
        return defNumber;
    }


    public ArrayList<Integer> getPossibleNumbers() {
        return possibleNumbers;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
