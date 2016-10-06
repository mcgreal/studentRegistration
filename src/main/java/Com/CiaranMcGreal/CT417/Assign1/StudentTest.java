package Com.CiaranMcGreal.CT417.Assign1;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

	public void testGetUsername() {
		String correct="Ciaran21";
		String test=Student.getUsername("Ciaran","21");
		assertEquals(correct,test);
	}
}