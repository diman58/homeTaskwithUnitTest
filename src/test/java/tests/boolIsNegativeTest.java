package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class boolIsNegativeTest extends BaseTest{
    @Test(dataProvider = "valuesForBoolIsNegative",groups = {"b"})
    public void boolIsNegative(long a, Object er) {
        boolean result = calculator.isNegative(a);
        Assert.assertSame(result, er, "Calculator isPositives doubles wrong");
    }

    @DataProvider(name = "valuesForBoolIsNegative")
    public Object[][] generateValuesForBoolIsNegative() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][2];
        for (int i = 0; i < y - 1; i++) {
            x[i][0] = random.nextLong();
            x[i][1] = ((Long) x[i][0] < 0) ? true : false;
        }
        x[4][0] = 0;
        x[4][1] = false;
        return x;
    }
}
