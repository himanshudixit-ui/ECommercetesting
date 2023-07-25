package com.amdocs.myamazon.testcases;

import org.testng.annotations.Test;

import com.amdocs.myamazon.pageojects.HomePage;
import com.amdocs.myamazon.pageojects.SearchPage;

public class HomeTestPage {
	public SearchPage searchpage;
    public HomePage homepage;

    @Test
    public void hometest() throws Throwable {
        homepage = new HomePage();
        searchpage = homepage.searchBox();    
    }
}
