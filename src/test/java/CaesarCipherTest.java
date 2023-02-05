import codewars.CaesarCipher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarCipherTest {

    @Test
    public void testSomething1() {
        assertEquals("For input: `hello`", "uryyb", CaesarCipher.rot_13("hello"));
    }

    @Test
    public void testSomething2() {
        assertEquals("For input: `HelloWorld`", "UryybJbeyq", CaesarCipher.rot_13("HelloWorld"));
    }

    @Test
    public void testSomething3() {
        assertEquals("For input: `Hello World!`", "Uryyb Jbeyq!", CaesarCipher.rot_13("Hello World!"));
    }

    @Test
    public void testSomething4() {
        assertEquals("For input: `123@#!!#@  33`", "123@#!!#@  33", CaesarCipher.rot_13("123@#!!#@  33"));
    }

    @Test
    public void testSomething5() {
        assertEquals("For input: `W3 ar3 in ye@r 2023$$$!äöü`", "J3 ne3 va lr@e 2023$$$!äöü", CaesarCipher.rot_13("W3 ar3 in ye@r 2023$$$!äöü"));
    }

}
