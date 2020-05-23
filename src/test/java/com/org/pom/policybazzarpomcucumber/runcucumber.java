package com.org.pom.policybazzarpomcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="com.org.pom.policybazzarpomcucumber",dryRun=false,plugin= {"pretty","html:Foldername/Files"})
public class runcucumber 
{


}
