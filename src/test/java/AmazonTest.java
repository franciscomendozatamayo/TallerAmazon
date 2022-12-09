import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
					features = "classpath:features/Amazon.feature"
					
				 )
public class AmazonTest {
	

}// end AmazonTest
