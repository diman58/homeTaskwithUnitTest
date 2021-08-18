package jUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

@RunWith(value = Parameterized.class)
public class longDivTest extends baseTest{
    long a;
    long b;
    Object er;
    @Test(expected = NumberFormatException.class)
    public void longDivision() {
        long result = calculator.div(a,b);
        Assertions.assertEquals(er,result);
    }

    public longDivTest(long a, long b, Object er) {
        this.a = a;
        this.b = b;
        this.er = er;
    }

    @Parameters
    public static Collection<Object[]> provideData() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextLong();
            x[i][1] = 0l;
            x[i][2] = new NumberFormatException();
        }
        return Arrays.asList(x);
    }
}
