package com.org.pom.policybazzarpomcucumber;

import org.openqa.selenium.By;

import com.org.location.xpath;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class impcucumber extends browsers
{
	static browsers brow;
	xpath path;
	@Given("^:Get bike number,manufacturer,Model,Reg year,Policy expired$")
	public void get_bike_number_manufacturer_Model_Reg_year_Policy_expired() throws Throwable 
	{
	brow.driving("chrome");
	}

	@When("^: Select insurance company,terms to be paid,vehicle owner details$")
	public void select_insurance_company_terms_to_be_paid_vehicle_owner_details() throws Throwable 
	{
	path=new xpath();
	path.getWheeler().click();
	//brow.text(path.getBikenumber(),"TN-02-Y-2313");
	path.getBikenumber().sendKeys("TN-02-Y-2313");
	path.getGetquotes().click();
	Thread.sleep(5000);
	path.getBikeor().click();
	Thread.sleep(5000);
	path.getModelor().click();
	Thread.sleep(5000);
	path.getEngineccor().click();
	Thread.sleep(5000);
	path.getYearor().click();
	Thread.sleep(5000);
	path.getExpiredinsurance1().click();
	Thread.sleep(5000);
	path.getThirdparty1().click();
	Thread.sleep(5000);
	path.getHdfcerago().click();
//	path.getHdfcerago().click();
	Thread.sleep(5000);
	path.getExistpolicy().click();
	}

	@Then("^:Get insurance details and summary will be printed$")
	public void get_insurance_details_and_summary_will_be_printed() throws Throwable 
	{
	    
	}
}
