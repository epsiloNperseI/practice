package codewars;

public class TicTacToeChecker {


    public static int isSolved(int[][] board) {

        for (int[] el: board) {
            for (int elArray: el) {
                System.out.print(elArray);
            }
        }

        return 0;
    }

}
