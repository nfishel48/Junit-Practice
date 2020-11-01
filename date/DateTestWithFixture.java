package date;
import org.junit.*;
import static org.junit.Assert.*;

public class DateTestWithFixture{
	private Date theDate;
	@Before
	public void setUp() throws Exception {
		theDate = new Date("January",3,2019);
	}
	@Test
	public void testMonth() {
		assertEquals(1, theDate.getMonth());
	}
	@Test
	public void testDay() {
		assertEquals("Testing correct day;", 2, theDate.getDay());
	}
}