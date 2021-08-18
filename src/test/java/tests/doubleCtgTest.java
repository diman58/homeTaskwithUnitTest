package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class doubleCtgTest extends BaseTest{
    @Test(dataProvider = "valuesForDoubleCtg",groups = "d")
    public void doubleCtg(double a, double er) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, er, "Calculator ctgs doubles wrong");
    }

    @DataProvider(name = "valuesForDoubleCtg")
    public Object[][] generateValuesForDoubleCtg() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][2];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = Math.tanh((Double) x[i][0]);
        }
        return x;
    }
}
