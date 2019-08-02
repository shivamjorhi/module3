package stepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/one/features"},glue= {"stepDef"},format= {"pretty"},tags="@FunctionalTest")
public class TestRunner {

}
