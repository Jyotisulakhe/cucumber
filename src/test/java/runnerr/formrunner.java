package runnerr;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:\\Users\\Asus\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\formcucu\\src\\test\\resources\\features\\form.feature",
		glue="steps"
		
		)
public class formrunner extends AbstractTestNGCucumberTests {

	
}
