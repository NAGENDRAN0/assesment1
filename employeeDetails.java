package week2.day1;


public class employeeDetails{  
     public void employeeName(String empname) {
		// TODO Auto-generated method stub
    	 System.out.println(empname);

	} 
     public void empId(int empId) {
		// TODO Auto-generated method stub
      System.out.println(empId);
	}
      
      public void employeeSalary(double empSalary) {
		// TODO Auto-generated method stub
    	  System.out.println(empSalary);

	}
     public void employeeAdress(String empAddress) {
		// TODO Auto-generated method stub
    	 System.out.println(empAddress);

	}
     public void mobileNumber(long empMobnum) {
		// TODO Auto-generated method stub
    	 System.out.println(empMobnum);

	}
     
      public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      employeeDetails emplo=new employeeDetails();
      emplo.employeeName("raj");
      emplo.empId(101);
      emplo.employeeSalary(200000);
      emplo.employeeAdress("coimbatore");
      emplo.mobileNumber(9994282053l);
	}

}
