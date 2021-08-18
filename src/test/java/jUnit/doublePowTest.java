package jUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

@RunWith(value = Parameterized.class)
public class doublePowTest extends baseTest{
    double a;
    double b;
    double er;
    @Test
    public void doublePow() {
        double result = calculator.pow(a,b);
        Assertions.assertEquals(er,result);
    }

    public doublePowTest(double a, double b, double er) {
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
            x[i][1] = Math.floor(random.nextDouble());
            x[i][2] = Math.pow(Double.valueOf(x[i][0].toString()),Double.valueOf(x[i][1].toString()));
        }
        return Arrays.asList(x);
    }
}
