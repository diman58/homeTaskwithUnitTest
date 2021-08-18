package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class Listener implements ITestListener {
    public void onTestSuccess(ITestResult result) {
        System.out.println("on test succeess: "+result.getName());
    }

    public void onTestFailure(ITestResult result){
        System.out.println("on test failure: "+result.getName()+" "+ Arrays.toString(result.getParameters()));
    }
    public void onFinish(ITestContext context) {
        System.out.println("on finish: "+ context.getName());
    }
}
