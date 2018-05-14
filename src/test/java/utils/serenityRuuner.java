package utils;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

/**
 * Created by padmaa on 08/05/18.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"/home/padmaa/Applications/hmrc-development-environment/hmrc/serenityJava/src/test/resources/features"},
        glue = {"stepdefs"}
)
public class serenityRuuner {

}
