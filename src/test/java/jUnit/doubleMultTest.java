package jUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

@RunWith(value = Parameterized.class)
public class doubleMultTest extends baseTest{
    double a;
    double b;
    double er;
    @Test
    public void doubleMultiplication() {
        double result = calculator.mult(a,b);
        Assertions.assertEquals(er,result);
    }

    public doubleMultTest(double a, double b, double er) {
        this.a = a;
        this.b = b;
        this.er = er;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> provideData() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = random.nextDouble();
            x[i][2] = Math.floor(Double.valueOf(x[i][0].toString()) * Double.valueOf(x[i][1].toString()));
        }
        return Arrays.asList(x);
    }
}
