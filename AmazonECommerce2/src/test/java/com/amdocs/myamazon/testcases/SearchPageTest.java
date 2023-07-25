package com.amdocs.myamazon.testcases;

import org.testng.annotations.Test;

import com.amdocs.myamazon.pageojects.BuyNowPage;
import com.amdocs.myamazon.pageojects.SearchPage;

public class SearchPageTest {

	@Test
    public void search() throws Throwable
    {
        BuyNowPage bynowpage;
        SearchPage search = new SearchPage();
        bynowpage = search.clickByNow();
    }
}

