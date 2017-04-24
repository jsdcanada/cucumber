package nopcommerce;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by E7440 on 23/04/2017.
 */

@RunWith(Cucumber.class)
@Cucumber.Options (features = ".",format = "html:target/CucumberReports", tags = "@abc")
public class RunTest {
}
