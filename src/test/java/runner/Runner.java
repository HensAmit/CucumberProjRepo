package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/htmlReport"},
				 features= {"features"},
				 glue= {"stepDefinitions"},
				 tags={"@Register"},
				 monochrome=true)
public class Runner {
	
}

