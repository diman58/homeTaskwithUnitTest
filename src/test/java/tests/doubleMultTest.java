package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class doubleMultTest extends BaseTest{
    @Test(dataProvider = "valuesForDoubleMultiplication",groups = "d")
    public void DoubleMultiplication(double a, double b, double er) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, er, "Calculator mults longs wrong");
    }

    @DataProvider(name = "valuesForDoubleMultiplication")
    public Object[][] genearateValuesForDoubleMultiplication() {
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = random.nextDouble();
            x[i][2] = Math.floor(Double.valueOf(x[i][0].toString()) * Double.valueOf(x[i][1].toString()));
        }
        return x;
    }
}
