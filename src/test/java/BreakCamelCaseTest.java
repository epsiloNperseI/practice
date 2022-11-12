import codewars.BreakCamelCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BreakCamelCaseTest {
    @Test
    public void tests() {
        assertEquals( "Incorrect", "this Is One String", BreakCamelCase.camelCase("thisIsOneString"));
        assertEquals( "Incorrect", "camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }
}
