package jUnit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

public class baseTest {
    protected Calculator calculator;
    @Before
    public void setUP() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}
