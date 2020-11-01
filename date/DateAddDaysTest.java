package date;
import org.junit.*;
import static org.junit.Assert.*;

// run with java org.junit.runner.JUnitCore date.DateAddDaysTest

public class DateAddDaysTest {
    private Date sameMonth;
    private Date diffMonth;
    private Date diffYear;
    private Date diffMonthTwo;
    private Date diffMonthThree;
    
    @Before
	public void setUp() throws Exception {
        sameMonth = new Date("January",3,2019);
        diffMonth = new Date("January",31,2019);
        diffMonthTwo = new Date("Febuary",28,2019);
        diffMonthThree = new Date("April",30,2019);
        diffYear = new Date("December",31,2019);
    }
    
	@Test
	public void testSameMonth() { // Test add one day for within the same month
        sameMonth.addOneDay();
		assertEquals(4, sameMonth.getDay());
	}
    
    @Test
	public void testDiffMonth() { // Test that month rolls over correctly
        diffMonth.addOneDay();
        diffMonthTwo.addOneDay();
        diffMonthThree.addOneDay();
        assertEquals(2, diffMonth.getMonth());
        assertEquals(3, diffMonthTwo.getMonth());
        assertEquals(5, diffMonthThree.getMonth());
    }
    

}

