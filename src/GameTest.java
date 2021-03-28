import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class GameTest {
    private Game g;

    @Before
    public void setUp() {
        g = new Game();
    }

    @Test
    public void canScoreGutterGame() {
        g.roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(g.score(), 0);
    }

    @Test
    public void canScoreGameOfOnes() {
        g.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertEquals(g.score(), 20);
    }

    @Test
    public void canScoreSpareFollowedByThree() {
        g.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(g.score(), 16);
    }

    @Test
    public void canScoreStrikFollowedByThreeThenThree() {
        g.roll(10, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(g.score(), 22);
    }

    @Test
    public void canScorePerfectGame() {
        g.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertEquals(g.score(), 300);
    }

}
