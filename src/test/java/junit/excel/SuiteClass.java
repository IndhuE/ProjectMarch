package junit.excel;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({Junit.class,Junit1.class,Junit2.class})
public class SuiteClass {
	public static void main(String[] args) {
		JUnitCore.runClasses(SuiteClass.class);
	}
}
