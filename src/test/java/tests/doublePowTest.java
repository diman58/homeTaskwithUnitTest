package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class doublePowTest extends BaseTest{
    @Test(dataProvider = "valuesForDoublePow",groups = "d")
    public void doublePow(double a, double b, double er) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, er, "Calculator pows doubles wrong");
    }

    @DataProvider(name = "valuesForDoublePow")
    public Object[][] generateValuesForDoublePow() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = Math.floor(random.nextDouble());
            x[i][2] = Math.pow(Double.valueOf(x[i][0].toString()),Double.valueOf(x[i][1].toString()));
        }
        return x;
    }
}
