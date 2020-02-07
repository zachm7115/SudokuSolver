public class Square {
    int defNumber, score;
    int[] possibleNumbers;

    public Square(int defNumber) {

        this.defNumber = defNumber;

    }

    public Square(int[] possibleNumbers) {
        possibleNumbers = new int[8];
        this.possibleNumbers = possibleNumbers;
    }
}
