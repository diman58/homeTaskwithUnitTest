package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class doubleSumTest extends BaseTest {
    @Test(dataProvider = "valuesForDoubleSummation",groups = "d")
    public void doubleSummation(double a, double b, double er) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, er, "Calculator sums doubles wrong");
    }

    @DataProvider(name = "valuesForDoubleSummation")
    public Object[][] generateValuesForDoubleSummation() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = random.nextDouble();
            x[i][2] = Double.valueOf(x[i][0].toString()) + Double.valueOf(x[i][1].toString());
        }
        return x;
    }
}
