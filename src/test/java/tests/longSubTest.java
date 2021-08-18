package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class longSubTest extends BaseTest{
    @Test(dataProvider = "valuesForLongSubtraction",groups = "long")
    public void longSubtraction(long a, long b, long er) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, er, "Calculator subs longs wrong");
    }

    @DataProvider(name = "valuesForLongSubtraction")
    public Object[][] generateValuesForLongSubtraction() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextLong();
            x[i][1] = random.nextLong();
            x[i][2] = Long.valueOf(x[i][0].toString()) - Long.valueOf(x[i][1].toString());
        }
        return x;
    }
}
