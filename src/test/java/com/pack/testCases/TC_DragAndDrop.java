package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.DragAndDrop;

public class TC_DragAndDrop extends TC_BaseClass {
	   @Test
       public void dragAndDrop() throws InterruptedException {
		   
		   DragAndDrop drop=new DragAndDrop(driver);  
		   drop.selectFrames();
		   drop.dragandDrop();
	   } 	   
       
}
