import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class ThirdTestCase {

//open Browser
@Before
public void openBrowser(){
//open Browser-Selenium
System.out.println("Open Browser");
}
@Test

public void sendingEmailTest(){
System.out.println("Testing Sending Email");

}

/*
 * 
public void sendingMesageTest2(){
	System.out.println("Testing Sending Message");
}
 * 
 * */

@Test

public void sendingMesageTest(){
System.out.println("Testing Sending Message");

}
//close Browser
@After

public void closeBrowser(){

//closing Browser Selenium
System.out.println("Close Browser");
}

}


    

