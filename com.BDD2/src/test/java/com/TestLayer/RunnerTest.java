package com.TestLayer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"FeatureFileFolder"},
		glue= {"com.TestLayer"},
		dryRun=true
		
		
		)



public class RunnerTest 
{

}
