package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class longDivTestWOE extends BaseTest{
    @Test(dataProvider = "valuesForLongDivision", groups = "long")
    public void longDivision(long a, long b, long er) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, er, "Calculator divs longs wrong");
    }

    @DataProvider(name = "valuesForLongDivision")
    public Object[][] genearateValuesForLongDivision() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y ; i++) {
            x[i][0] = random.nextLong();
            x[i][1] = random.nextLong();
            x[i][2] = Long.valueOf(x[i][0].toString()) / Long.valueOf(x[i][1].toString());
        }
        return x;
    }
}
