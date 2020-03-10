import org.junit.Assert;
import org.junit.Test;

public class UnderstandAssertions {
	
	@Test
	public void testFriendListFacebook(){
	int actual_total_friends=100;//selenium
	int expected_total_friends=101;//xlsx file

	if (actual_total_friends==expected_total_friends){
	System.out.println("Pass");}
	else {System.out.println("Fail");
	}
	

	//Assert.assertEquals(expected_total_friends,actual_total_friends);

	Assert.assertEquals(expected_total_friends,actual_total_friends);
	
	// If actual_total_friends=101 it prints out Grace
	System.out.println("Grace");
	
	}

}
