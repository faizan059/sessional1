import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	int index;

	@Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
	
	@Test
	public void emptyString(){
		
		index = Session.getIndex("", 'f');
		assertEquals("return -1", -1, index);
		
	}
	
	
	@Test
	public void oneCharString(){
		
		index = Session.getIndex("f", 'f');
		assertEquals("return 0", 0, index);
		
	}
	
	@Test
	public void getLastCharInString(){
		
		index = Session.getIndex("faizan", 'n');
		assertEquals("return 4",4, index);
		
	}
	
	@Test
	public void getFirstCharInString(){
		
		index = Session.getIndex("faizan", 'f');
		assertEquals("return 0",0, index);
		
	}
	
	@Test
	public void getMidCharInString(){
		
		index =Session.getIndex("faizan", 'z');
		assertEquals("return 2",2, index);
		
	}
	
	
	@Test
	public void charNotFoundInString(){
		
		index =Session.getIndex("faizan", 'p');
		assertEquals("return -1",-1, index);
		
	}

}
