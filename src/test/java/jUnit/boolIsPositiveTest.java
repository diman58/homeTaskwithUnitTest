package jUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

@RunWith(value = Parameterized.class)
public class boolIsPositiveTest extends baseTest{
    long a;
    Object er;
    @Test
    public void boolIsPositive() {
        boolean result = calculator.isPositive(a);
        Assertions.assertSame(er,result);
    }

    public boolIsPositiveTest(long a, Object er) {
        this.a = a;
        this.er = er;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> provideData() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][2];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextLong();
            x[i][1] = ((Long) x[i][0] > 0) ? true : false;
        }
        return Arrays.asList(x);
    }
}
