package DataSource;

import org.testng.annotations.DataProvider;

public class LoginData {


    // I am using DataProvider Annotation in my framework.
    // It will help me to run same test case with different set of data
    @DataProvider(name = "OpenMrsLocations")
    public Object[][] getLocations(){

        return new Object[][]{
                {"admin","Admin123","Inpatient Ward"},
                {"admin","Admin123","Isolation Ward"},
                {"admin","Admin123","Laboratory"},
                {"admin","Admin123","Outpatient Clinic"},
                {"admin","Admin123","Pharmacy"},
                {"admin","Admin123","Registration Desk"}

        };

    }

}

    public static void main(String[] args) {
        System.out.println("this is test");
        System.out.println("test2");
        
        System.out.println("test from github");
        sadsfdasf
        
    }
dsafsd

hrty