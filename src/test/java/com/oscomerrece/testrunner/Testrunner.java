package com.oscomerrece.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features={"Feature"},
glue={"com.oscomerrece.stepdef"}
)


public class Testrunner extends AbstractTestNGCucumberTests {

}
