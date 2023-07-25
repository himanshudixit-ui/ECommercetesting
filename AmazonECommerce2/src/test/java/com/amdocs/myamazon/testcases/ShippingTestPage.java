package com.amdocs.myamazon.testcases;

import org.testng.annotations.Test;

import com.amdocs.myamazon.pageojects.Shipping;

public class ShippingTestPage extends CheckOutTestPage{
    
	public Shipping shipping;
    
    @Test
    public void shipping() throws Throwable
    {
        shipping = new Shipping();
        shipping.order();
    }
}
