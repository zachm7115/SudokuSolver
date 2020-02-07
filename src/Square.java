import java.util.ArrayList;

public class Square {
    int defNumber, score;
    ArrayList<Integer> possibleNumbers = new ArrayList<Integer>();
    public Square(int defNumber) {
        this.defNumber = defNumber;

    }

    public Square(ArrayList possibleNumbers) {
        possibleNumbers = new ArrayList<Integer>;

        this.possibleNumbers = possibleNumbers;
        int score = -1;
    }



    public int getDefNumber(){
        return defNumber;
    }


    public ArrayList<Integer> getPossibleNumbers() {
        return possibleNumbers;
    }
}
