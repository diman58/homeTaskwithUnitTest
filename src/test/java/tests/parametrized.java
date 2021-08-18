package tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrized extends BaseTest{
    @Test
    @Parameters({"first name", "second name"})
    public void bool(@Optional(value = "Bill")String Name, @Optional(value = "Clinton")String secondname) {
        System.out.println(Name);
        System.out.println(secondname);
    }
}
