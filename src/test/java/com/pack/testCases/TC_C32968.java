package com.pack.testCases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.pack.loginPages.C32968;
import recordingTests.ScreenRecorderUtil;

public class TC_C32968 extends TC_BaseClass{
	@SuppressWarnings("deprecation")
	@Test()
	public void certification() throws Exception {
		ScreenRecorderUtil.startRecord("C32968");
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 C32968 certification=new C32968(driver);
		 certification.clickUnifocus();
		 certification.clickAddRowButton();
		 certification.selectAutocert1();
		 certification.clickAddRowButton1();
		 certification.clickAutocert2();
		 /*certification.clickLaborStructure();
		 certification.selectPropertyDefault();
		 certification.ExpandAutoJob();
		 certification.doubleClickAutoJob1();
		 certification.clickAddJob();
		 certification.doubleClickJob();
		 certification.changeNameJob();
		 certification.doubleClickJobCode();
		 certification.EditJobCode();
		 certification.horizontalScrollView();
		 certification.doubleClickCertifiction();
		 certification.selectCheckBox();*/
	}
}
