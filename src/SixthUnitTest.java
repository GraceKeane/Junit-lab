import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;

public class SixthUnitTest {

	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Test
	public void testFriendListFacebook(){
	int actual_total_friends=100;//selenium
	int expected_total_friends=101;//xlsx file

	if (actual_total_friends==expected_total_friends){
	System.out.println("Pass");}
	else {System.out.println("Fail");
	}
	
	System.out.println("A");

	try{
	Assert.assertEquals(expected_total_friends,actual_total_friends);

	}  

	catch(Throwable t){

	System.out.println("Error encountered" + t.toString());
	//java code -report error

	error.addError(t);
	}
	
	System.out.println("B");
	}
	
}
