package passwordvalidator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Integration Test for Password Validation
 */
public class ValidatorTest {
	private Validator validator;

	@Before
	public void setUp(){
		validator = new Validator();
	}

	@Test
	public void validPasswordTest() {
		assertTrue( validator.isPasswordValid( "abc123" ) );
	}

	@Test
	public void lessThan5CharactersTest()
	{
		assertFalse( validator.isPasswordValid( "abc1" ) );
	}
}
