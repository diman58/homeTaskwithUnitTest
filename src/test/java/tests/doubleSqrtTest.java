package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class doubleSqrtTest extends BaseTest{
    @Test(dataProvider = "valuesForDoubleSqrt",groups = "d")
    public void doubleSqrt(double a, double er) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, er, "Calculator sums doubles wrong");
    }

    @DataProvider(name = "valuesForDoubleSqrt")
    public Object[][] generateValuesForDoubleSqrt() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][2];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = Math.sqrt(Math.abs((Double) x[i][0]));
        }
        return x;
    }
}
