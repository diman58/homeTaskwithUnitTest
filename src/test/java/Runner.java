import listeners.Listener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new Listener());

        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setSuiteFiles(Arrays.asList("src/main/java/resources/testNG.xml"));
        xmlSuite.setParallel(XmlSuite.ParallelMode.METHODS);
        xmlSuite.setThreadCount(8);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(xmlSuite);

        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
