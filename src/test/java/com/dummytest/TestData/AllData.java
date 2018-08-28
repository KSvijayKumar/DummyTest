package com.dummytest.TestData;

//import org.omg.CORBA.Object;
import org.testng.annotations.DataProvider;

public class TocData {

    @DataProvider
    public static Object[][] SetTestData(){


        return new Object[][]{
                {"Inverness","Glasgow","XX@XX.com","password","111"},
                {"Inverness","Glasgow","XX@XX.com","password","1111"}
        };
    }


}
