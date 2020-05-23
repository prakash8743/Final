package com.org.location;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.pom.policybazzarpomcucumber.browsers;

public class xpath extends browsers
{
@FindBy(xpath="//*[@id='gototop']/section[1]/div[1]/div/div/div[1]/div[2]/a[5]")
private WebElement wheeler;
@FindBy(xpath="//input[@id='rto']")
private WebElement bikenumber;
@FindBy(xpath="//*[@id=\"but\"]/span")
private WebElement getquotes;
@FindBy(xpath="//div[@id='dvMake']")
private WebElement bikemanufacturer;
@FindBy(xpath="//span[@id='17']")
private WebElement bikeor;
@FindBy(xpath="//div[@id='dvModel']")
private WebElement model;
@FindBy(xpath="//li[@class='col-sm-4 col-xs-6']")
private WebElement modelor;
@FindBy(xpath="//div[@id='dvVariant']")
private WebElement enginecc;
@FindBy(xpath="//li[@class='col-sm-12 col-xs-12']")
private WebElement engineccor;
@FindBy(xpath="//*[@id=\"Prequote\"]/div/div/div/div[2]/div/ul/div")
private WebElement year;
@FindBy(xpath="//*[@id=\"Prequote\"]/div/div/div/div[2]/div/ul/div/ul/div/li[10]/span")
private WebElement yearor;
@FindBy(xpath="//div[@class='secondsection']/ul/li[2]")
private WebElement expiredinsurance;
@FindBy(xpath="//*[text()='Not Expired']")
private WebElement expiredinsurance1;
@FindBy(xpath="//div[@class='midsection']/ul/li[2]")
private WebElement thirdparty;
@FindBy(xpath="//*[text()='Third Party/Liability Only']")
private WebElement thirdparty1;
@FindBy(xpath="//div[@id='112']/ul/li[5]/div/a")
private WebElement hdfcerago;
@FindBy(xpath="//div[@id='popupshow']/div/div/a[2]")
private WebElement existpolicy;
@FindBy(xpath="//*[@id=\"personalInfoForm\"]/ul/li[1]/div/div[2]/div/input")
private WebElement ownername;
@FindBy(xpath="//input[@type='tel']")
private WebElement mobile;
@FindBy(xpath="//input[@name='email']")
private WebElement email;
@FindBy(xpath="//*[@class='fullAddress']")
private WebElement address;
@FindBy(xpath="//input[@name='pincode']")
private WebElement pincode;
@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[1]/div[1]/button/span/em")
private WebElement step2;
@FindBy(xpath="//div[text()='Enter Nominee Name']")
private WebElement nomineename;
@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/form/ul/li[3]/div[2]/div[1]/div/div/div[1]")
private WebElement relationship;
@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[1]/div/button/span")
private WebElement step3;
@FindBy(xpath="//input[@id='EngineNumber']")
private WebElement enginenumber;
@FindBy(xpath="//input[@id='ChasisNumber']")
private WebElement chasisnumber;
@FindBy(xpath="//*[@id=\"vehicleDetailForm\"]/ul/li[4]/div/div/div[1]/div/div")
private WebElement previousinsurer;//ICICI Lombard
@FindBy(xpath="//input[@id='OldPolicyNum']")
private WebElement oldpoilcynumber;
@FindBy(xpath="//*[@id=\"vehicleDetailForm\"]/ul/li[6]/div[2]/div[1]/div[1]/div/div/div[1]")
private WebElement policyexpirydate;
@FindBy(xpath="//*[@name='expiryMonth' and //@class='select-box']")
private WebElement policyexpirymonth;
@FindBy(xpath="//div[@class='col-sm-4 col-xs-4 pad-left pad-right']//div[@name='expiryYear']")
private WebElement policyexpiryyear;
@FindBy(xpath="//div[@name='registrationDate']")
private WebElement registrationdate;//
@FindBy(xpath="//div[@name='registrationMonth']")
private WebElement registrationmonth;
@FindBy(xpath="//div[@name='registrationYear']")
private WebElement registrationyear;
@FindBy(xpath="//div[@class='col-sm-12 col-xs-12 btn-prop']")
private WebElement save;


public WebElement getWheeler() {
	return wheeler;
}
public void setWheeler(WebElement wheeler) {
	this.wheeler = wheeler;
}
public WebElement getBikenumber() {
	return bikenumber;
}
public void setBikenumber(WebElement bikenumber) {
	this.bikenumber = bikenumber;
}
public WebElement getGetquotes() {
	return getquotes;
}
public void setGetquotes(WebElement getquotes) {
	this.getquotes = getquotes;
}
public WebElement getBikemanufacturer() {
	return bikemanufacturer;
}
public void setBikemanufacturer(WebElement bikemanufacturer) {
	this.bikemanufacturer = bikemanufacturer;
}
public WebElement getBikeor() {
	return bikeor;
}
public void setBikeor(WebElement bikeor) {
	this.bikeor = bikeor;
}
public WebElement getModel() {
	return model;
}
public void setModel(WebElement model) {
	this.model = model;
}
public WebElement getModelor() {
	return modelor;
}
public void setModelor(WebElement modelor) {
	this.modelor = modelor;
}
public WebElement getEnginecc() {
	return enginecc;
}
public void setEnginecc(WebElement enginecc) {
	this.enginecc = enginecc;
}
public WebElement getEngineccor() {
	return engineccor;
}
public void setEngineccor(WebElement engineccor) {
	this.engineccor = engineccor;
}
public WebElement getYear() {
	return year;
}
public void setYear(WebElement year) {
	this.year = year;
}
public WebElement getYearor() {
	return yearor;
}
public void setYearor(WebElement yearor) {
	this.yearor = yearor;
}
public WebElement getExpiredinsurance() {
	return expiredinsurance;
}
public void setExpiredinsurance(WebElement expiredinsurance) {
	this.expiredinsurance = expiredinsurance;
}
public WebElement getExpiredinsurance1() {
	return expiredinsurance1;
}
public void setExpiredinsurance1(WebElement expiredinsurance1) {
	this.expiredinsurance1 = expiredinsurance1;
}
public WebElement getThirdparty() {
	return thirdparty;
}
public void setThirdparty(WebElement thirdparty) {
	this.thirdparty = thirdparty;
}
public WebElement getThirdparty1() {
	return thirdparty1;
}
public void setThirdparty1(WebElement thirdparty1) {
	this.thirdparty1 = thirdparty1;
}
public WebElement getHdfcerago() {
	return hdfcerago;
}
public void setHdfcerago(WebElement hdfcerago) {
	this.hdfcerago = hdfcerago;
}
public WebElement getExistpolicy() {
	return existpolicy;
}
public void setExistpolicy(WebElement existpolicy) {
	this.existpolicy = existpolicy;
}
public WebElement getOwnername() {
	return ownername;
}
public void setOwnername(WebElement ownername) {
	this.ownername = ownername;
}
public WebElement getMobile() {
	return mobile;
}
public void setMobile(WebElement mobile) {
	this.mobile = mobile;
}
public WebElement getEmail() {
	return email;
}
public void setEmail(WebElement email) {
	this.email = email;
}
public WebElement getAddress() {
	return address;
}
public void setAddress(WebElement address) {
	this.address = address;
}
public WebElement getPincode() {
	return pincode;
}
public void setPincode(WebElement pincode) {
	this.pincode = pincode;
}
public WebElement getStep2() {
	return step2;
}
public void setStep2(WebElement step2) {
	this.step2 = step2;
}
public WebElement getNomineename() {
	return nomineename;
}
public void setNomineename(WebElement nomineename) {
	this.nomineename = nomineename;
}
public WebElement getRelationship() {
	return relationship;
}
public void setRelationship(WebElement relationship) {
	this.relationship = relationship;
}
public WebElement getStep3() {
	return step3;
}
public void setStep3(WebElement step3) {
	this.step3 = step3;
}
public WebElement getEnginenumber() {
	return enginenumber;
}
public void setEnginenumber(WebElement enginenumber) {
	this.enginenumber = enginenumber;
}
public WebElement getChasisnumber() {
	return chasisnumber;
}
public void setChasisnumber(WebElement chasisnumber) {
	this.chasisnumber = chasisnumber;
}
public WebElement getPreviousinsurer() {
	return previousinsurer;
}
public void setPreviousinsurer(WebElement previousinsurer) {
	this.previousinsurer = previousinsurer;
}
public WebElement getOldpoilcynumber() {
	return oldpoilcynumber;
}
public void setOldpoilcynumber(WebElement oldpoilcynumber) {
	this.oldpoilcynumber = oldpoilcynumber;
}
public WebElement getPolicyexpirydate() {
	return policyexpirydate;
}
public void setPolicyexpirydate(WebElement policyexpirydate) {
	this.policyexpirydate = policyexpirydate;
}
public WebElement getPolicyexpirymonth() {
	return policyexpirymonth;
}
public void setPolicyexpirymonth(WebElement policyexpirymonth) {
	this.policyexpirymonth = policyexpirymonth;
}
public WebElement getPolicyexpiryyear() {
	return policyexpiryyear;
}
public void setPolicyexpiryyear(WebElement policyexpiryyear) {
	this.policyexpiryyear = policyexpiryyear;
}
public WebElement getRegistrationdate() {
	return registrationdate;
}
public void setRegistrationdate(WebElement registrationdate) {
	this.registrationdate = registrationdate;
}
public WebElement getRegistrationmonth() {
	return registrationmonth;
}
public void setRegistrationmonth(WebElement registrationmonth) {
	this.registrationmonth = registrationmonth;
}
public WebElement getRegistrationyear() {
	return registrationyear;
}
public void setRegistrationyear(WebElement registrationyear) {
	this.registrationyear = registrationyear;
}
public WebElement getSave() {
	return save;
}
public void setSave(WebElement save) 
{
	this.save = save;
}
public xpath()
{
PageFactory.initElements(driver,this);
}
}
