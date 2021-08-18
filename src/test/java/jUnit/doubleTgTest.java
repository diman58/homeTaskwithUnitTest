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
public class doubleTgTest extends baseTest{
    double a;
    double er;
    @Test
    public void doubleTG() {
        double result = calculator.tg(a);
        Assertions.assertEquals(er,result);
    }

    public doubleTgTest(double a, double er){
        this.a = a;
        this.er = er;
    }

    @Parameters
    public static Collection<Object[]> provideData() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][2];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = Math.sin((Double)x[i][0])/Math.sin((Double)x[i][0]);
        }
        return Arrays.asList(x);
    }
}
