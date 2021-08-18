package jUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import static jdk.nashorn.internal.objects.Global.Infinity;

@RunWith(value = Parameterized.class)
public class doubleDivTest extends baseTest{
    double a;
    double b;
    double er;
    @Test
    public void doubleSummation() {
        double result = calculator.div(a,b);
        Assertions.assertEquals(er,result);
    }

    public doubleDivTest(double a, double b, double er) {
        this.a = a;
        this.b = b;
        this.er = er;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> provideData() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y-1; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = random.nextDouble();
            x[i][2] = Double.valueOf(x[i][0].toString()) / Double.valueOf(x[i][1].toString());
        }
        x[4][0] = random.nextDouble();
        x[4][1] = 0d;
        x[4][2] = Infinity;
        return Arrays.asList(x);
    }
}
