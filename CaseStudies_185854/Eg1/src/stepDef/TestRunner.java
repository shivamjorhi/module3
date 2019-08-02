package stepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/eg1/features"},glue= {"stepDef"},format= {"pretty"})
public class TestRunner {

}
