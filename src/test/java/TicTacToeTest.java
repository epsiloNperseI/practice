import codewars.TicTacToeChecker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeTest {

    @Test
    public void notFinished() {
        assertEquals("[0, 0, 1]\n[0, 1, 2]\n[2, 1, 0]", -1, TicTacToeChecker.isSolved(new int[][] {
                {0, 0, 1},
                {0, 1, 2},
                {2, 1, 0}
        }));
    }
    @Test
    public void winnerX() {
        assertEquals("[1, 1, 1]\n[0, 2, 2]\n[0, 0, 0]", 1, TicTacToeChecker.isSolved(new int[][] {
                {1, 1, 1},
                {0, 2, 2},
                {0, 0, 0}
        }));
    }
    @Test
    public void winnerO() {
        assertEquals("[1, 1, 2]\n[0, 2, 0]\n[2, 1, 1]", 2, TicTacToeChecker.isSolved(new int[][] {
                {1, 1, 2},
                {0, 2, 0},
                {2, 1, 1}
        }));
    }
    @Test
    public void draw() {
        assertEquals("[1, 2, 1]\n[1, 1, 2]\n[2, 1, 2]", 0, TicTacToeChecker.isSolved(new int[][] {
                {1, 2, 1},
                {1, 1, 2},
                {2, 1, 2}
        }));
    }
}
