package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class doubleSinTest extends BaseTest{
    @Test(dataProvider = "valuesForDoubleSin",groups = "d")
    public void doubleSin(double a, double er) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, er, "Calculator sins doubles wrong");
    }

    @DataProvider(name = "valuesForDoubleSin")
    public Object[][] generateValuesForDoubleSin() {
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
