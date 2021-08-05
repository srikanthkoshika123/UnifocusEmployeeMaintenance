package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.PartnerCodeValidation;

public class TC_PartnerCodeValidation extends TC_BaseClass {
	@Test
	public void partnerCodeValidation() {
	PartnerCodeValidation partCode=new PartnerCodeValidation(driver);
	partCode.setPartnerCode(partnerCode);
	partCode.clickNext();

}
	}
