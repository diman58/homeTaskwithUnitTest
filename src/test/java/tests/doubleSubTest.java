package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class doubleSubTest extends BaseTest{
    @Test(dataProvider = "valuesForDoubleSubtraction",groups = "d")
    public void doubleSubtraction(double a, double b, double er){
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, er, "Calculator subs doubles wrong");
    }

    @DataProvider(name = "valuesForDoubleSubtraction")
    public Object[][] generateValuesForDoubleSubtraction(){
        int y = 5;
        Random random = new Random();
        Object[][] x = new Object[y][3];
        for (int i = 0; i < y; i++) {
            x[i][0] = random.nextDouble();
            x[i][1] = random.nextDouble();
            x[i][2] = Double.valueOf(x[i][0].toString()) - Double.valueOf(x[i][1].toString());
        }
        return x;
    }
}
