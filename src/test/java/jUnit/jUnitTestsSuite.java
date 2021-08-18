package jUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({longSubTest.class,longMultTest.class,longDivTestWOE.class,longSubTest.class,
doubleTgTest.class,doubleSumTest.class,doubleSubTest.class,doubleSqrtTest.class,doubleSinTest.class,doublePowTest.class,
doubleMultTest.class,doubleDivTest.class,doubleCtgTest.class,doubleCosTest.class,boolIsPositiveTest.class,
boolIsNegativeTest.class,longSumTest.class})
public class jUnitTestsSuite {
}
