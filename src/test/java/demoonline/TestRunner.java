package demoonline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/resources/features",format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" })
public class TestRunner
{}
