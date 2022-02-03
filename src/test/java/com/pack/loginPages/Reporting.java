package com.pack.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class Reporting extends TC_BaseClass{
	WebDriver ldriver;

	public Reporting(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

}
