package com.amdocs.myamazon.testcases;

import org.testng.annotations.Test;

import com.amdocs.myamazon.pageojects.CheckOutPage;
import com.amdocs.myamazon.pageojects.Shipping;

public class CheckOutTestPage extends BuyNowTestPage{
	public CheckOutPage checkout;
    public Shipping shipping;

    @Test
    public void checkout() throws Throwable
    {
        checkout = new CheckOutPage();
        shipping = checkout.clickBtn();
    }
}
