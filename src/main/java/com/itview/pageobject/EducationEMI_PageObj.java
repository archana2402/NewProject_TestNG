package com.itview.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationEMI_PageObj extends TestBase
{
	@FindBy(id="educ_loan")
	public WebElement educloan;
	
	@FindBy(id="interest_rate")
	public WebElement interest_rate;	
	
	@FindBy(css="invested_amt")
	public WebElement investedamt;
	
	@FindBy(id="loan_period")
	public WebElement loanperiod;
	
	@FindBy(id="total_payment")
	public WebElement totalpayment;
	
    @FindBy(xpath="//*[@id=\"InvestingPlanning\"]/div[2]/div[1]/div[2]/div[4]/a[1]")
	public WebElement SubmitLink;
	
	@FindBy(id="wzrk-cancel")
	public WebElement cancelWindow;
	
	public void callPageFactoryElement() {		
		PageFactory.initElements(w, this); 
	}

}
