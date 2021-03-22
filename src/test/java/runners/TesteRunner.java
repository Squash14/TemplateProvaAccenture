package runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
	
	features = "classpath:Features"
	,glue = {"stepdefinitions"}
	,tags = {"@Veiculo"}
	,snippets = SnippetType.CAMELCASE
	,plugin = {"pretty", "html:target/cucumber-reports"}
	,monochrome = true
	,dryRun = false
	,strict = false
	
	)
public class TesteRunner {

}
