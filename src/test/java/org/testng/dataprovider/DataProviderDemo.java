package org.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider = "EmployeesInfo")
	public void dataProviderTest(String name, String email, String job_id) {
		System.out.println("Name : " + name + " Email :" + email + " Job ID :" + job_id);
	}

	/**
	 * create a method that returns multidimentional Object array Name the method
	 * EmployeesData
	 */
	@DataProvider(name = "EmployeesInfo")
	public Object[][] EmployeesData() {
		Object[][] employees = new Object[3][3];
		employees[0][0] = "Mike";
		employees[0][1] = "mike@gmail.com";
		employees[0][2] = "IT_Prog";

		employees[1][0] = "Steven";
		employees[1][1] = "steven@gmail.com";
		employees[1][2] = "Tester";

		employees[2][0] = "Sarah";
		employees[2][1] = "sarah@gmail.com";
		employees[2][2] = "HR_Rep";

		return employees;
	}
}
