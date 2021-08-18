package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class doubleCosTest extends BaseTest{
    @Test(dataProvider = "valuesForDoubleCos",groups = "d")
    public void doubleCos(double a, double er) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, er, "Calculator coses doubles wrong");
    }

    @DataProvider(name = "valuesForDoubleCos")
    public Object[][] generateValuesForDoubleCos() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][2];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = Math.sin((Double) x[i][0]);
        }
        return x;
    }
}
