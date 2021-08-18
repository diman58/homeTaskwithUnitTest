package jUnit;

import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class jUnitTestRunner {
    public static void main(String[] args) {
        /*Result result = JUnitCore.runClasses(jUnitTestsSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.getRunCount());*/

       Class[] classes = {longSumTest.class,longSubTest.class,longMultTest.class,longDivTestWOE.class,longSubTest.class,
                doubleTgTest.class,doubleSumTest.class,doubleSubTest.class,doubleSqrtTest.class,doubleSinTest.class,doublePowTest.class,
                doubleMultTest.class,doubleDivTest.class,doubleCtgTest.class,doubleCosTest.class,boolIsPositiveTest.class,
                boolIsNegativeTest.class};
        Result result = JUnitCore.runClasses(new ParallelComputer(true,true),classes);
        System.out.println(result.getRunCount());
        List<Failure> failures = result.getFailures();
        for (int i = 0; i < failures.size(); i++) {
            System.out.println(failures.get(i));
        }
    }
}
