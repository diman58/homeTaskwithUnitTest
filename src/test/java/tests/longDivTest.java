package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class longDivTest extends BaseTest {
    @Test(expectedExceptions = NumberFormatException.class, dataProvider = "valuesForLongDivision", groups = "long")
    public void longDivision(long a, long b, Object er) {
        long result = calculator.div(a, b);
            Assert.assertSame(result, er);
    }

    @DataProvider(name = "valuesForLongDivision")
    public Object[][] genearateValuesForLongDivision() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y ; i++) {
            x[i][0] = random.nextLong();
            x[i][1] = 0l;
            x[i][2] = new NumberFormatException();
        }
        return x;
    }
}
