package com.amdocs.myamazon.testcases;

import org.testng.annotations.Test;

import com.amdocs.myamazon.pageojects.BuyNowPage;
import com.amdocs.myamazon.pageojects.CheckOutPage;

public class BuyNowTestPage extends SearchPageTest
	{
	    public BuyNowPage buyNowTestPage;
	    public CheckOutPage checkOutPage;

	    @Test
	    public void buynow() throws Throwable
	    {
	        buyNowTestPage = new BuyNowPage();
	        checkOutPage = buyNowTestPage.checkOut();
	    }
	}

