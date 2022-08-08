import codewars.SpinWords;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {

    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
        assertEquals("Just gniddik ereht is llits one more", new SpinWords().spinWords("Just kidding there is still one more"));
    }
}
