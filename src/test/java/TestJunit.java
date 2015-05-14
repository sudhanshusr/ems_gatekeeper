

import org.junit.Assert;
import org.junit.Test;


//import com.sample.mvc.model.EmployeeCommand;
import com.sample.mvc.model.EmployeeCommand;

import static org.junit.Assert.assertEquals;
public class TestJunit {
	EmployeeCommand empCommand = new EmployeeCommand();
	
	
	
	@Test
	public void testgetsetname()
	{
		empCommand.setName("Pushpendra");
		assertEquals("Pushpendra",empCommand.getName());
	}
	
	@Test
	public void testgetsetcode()
	{
		empCommand.setCode(100);
		assertEquals(100,empCommand.getCode());
	}
	
	@Test
	public void testgetsetcity()
	{
		empCommand.setCity("pune");
		//System.out.println("heelooooooooo");
		assertEquals("pune",empCommand.getCity());
		
	}
	
	
	
	/*EmpBusinessLogic empBusinessLogic =new EmpBusinessLogic();
	   EmployeeDetails employee = new EmployeeDetails();

	   //test to check appraisal
	   @Test
	   public void testCalculateAppriasal() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(500, appraisal, 0.0);
	      
	   }
	   
	   @Test
	   public void testCalculateAppriasal1() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(11000);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(1000, appraisal, 0.0);
	      
	   }

	   // test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      double salary= empBusinessLogic.calculateYearlySalary(employee);
	      assertEquals(97000, salary, 0.0);
	   }
	   
	  */
  
}