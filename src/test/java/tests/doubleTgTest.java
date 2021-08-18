package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class doubleTgTest extends BaseTest{
    @Test(dataProvider = "valuesForDoubleTg",groups = "d")
    public void doubleTg(double a, double er) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, er, "Calculator tgs doubles wrong");
    }

    @DataProvider(name = "valuesForDoubleTg")
    public Object[][] generateValuesForDoubleTg() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][2];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = calculator.sin((Double) x[i][0])/calculator.cos((Double) x[i][0]);
        }
        return x;
    }
}
