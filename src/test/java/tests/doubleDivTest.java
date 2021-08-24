package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class doubleDivTest extends BaseTest{
    @Test(dataProvider = "valuesForDoubleDivision",groups = "d")
    public void doubleDivision(double a, double b, Object er) {
        double result = calculator.div(a, b);
        if (b == 0d) {
            Assert.assertSame(result, er);
        }
        Assert.assertEquals(result, er, "Calculator divs doubles wrong");
    }

    @DataProvider(name = "valuesForDoubleDivision")
    public Object[][] generateValuesForDoubleDivision() {
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
        x[4][2] = (Double) x[4][0]/(Double) x[4][1];
        return x;
    }
}
