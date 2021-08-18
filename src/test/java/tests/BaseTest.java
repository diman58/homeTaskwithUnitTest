package tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

    /*
    Bugs:
    нет проверки на 0 для числа b в методе double div()
    в методе double sqrt() корень высчитывается из модуля числа, хотя должна быть проверка на положительность числа
    в методе double ctg() вызывается Math.tanh()
    в методе double cos() вызывается Math.sin()
    в методе boolean isPositive в случае если переданный аргумент == 0 то возращается фолс, хотя 0 не относится ни к
    положительным ни к отрицательным
    в методе boolean isNegative в случае если переданный аргумент == 0 то 0 станет положительным, хотя 0 не относится
    ни к положительным ни к отрицательным
     */
}
