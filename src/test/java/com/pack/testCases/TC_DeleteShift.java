package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.DeleteShift;

public class TC_DeleteShift extends TC_BaseClass{
	@Test
	public void deleteShift() throws InterruptedException {
		
		DeleteShift deleteshift=new DeleteShift(driver);
		
		deleteshift.deleteShift();
}

}
