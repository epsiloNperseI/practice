import codewars.BinaryArrayToNumber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinaryArrayToNumberTest  {
    @Test
    public void convertBinaryArrayToInt() throws Exception {
        assertEquals(1, BinaryArrayToNumber.сonvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        assertEquals(15, BinaryArrayToNumber.сonvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
        assertEquals(6, BinaryArrayToNumber.сonvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
        assertEquals(9, BinaryArrayToNumber.сonvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }
}
