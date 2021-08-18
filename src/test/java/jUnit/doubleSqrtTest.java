package jUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

@RunWith(value = Parameterized.class)
public class doubleSqrtTest extends baseTest{
    double a;
    double er;
    @Test
    public void doubleSummation() {
        double result = calculator.sqrt(a);
        Assertions.assertEquals(er,result);
    }

    public doubleSqrtTest(double a, double er) {
        this.a = a;
        this.er = er;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> provideData() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][2];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = Math.sqrt(Math.abs((Double) x[i][0]));
        }
        return Arrays.asList(x);
    }
}
