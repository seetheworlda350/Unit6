package lesson1;

public class Main {
    public static void main(String[] args) {
        //create with initial val
        int[] scores = {47, 82, 36, 95, 74, 64, 53, 92};

        //create with default values
        //
        String[] defaultScores = new String[8];

        //print the scores
        for(int i = 0; i<scores.length; i++){
            System.out.print(scores[i] + " ");
        }
    }
}