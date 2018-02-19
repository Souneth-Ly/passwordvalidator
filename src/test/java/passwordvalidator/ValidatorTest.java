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
	public void nullPasswordTest() {
		assertFalse( validator.isPasswordValid( null ) );
	}

	@Test
	public void lessThan5CharactersTest() {
		assertFalse( validator.isPasswordValid( "abc1" ) );
	}

	@Test
	public void alphabetOnlyTest() {
		assertFalse( validator.isPasswordValid( "abcdef" ) );
	}

	@Test
	public void digitOnlyTest() {
		assertFalse( validator.isPasswordValid( "12345678" ) );
	}

	@Test
	public void uppercaseCharacterTest() {
		assertFalse( validator.isPasswordValid( "heY34h" ) );
	}

	@Test
	public void specialCharactersTest() {
		assertFalse( validator.isPasswordValid( "df2&$33ij" ) );
	}

	@Test
	public void twoConsecutiveCharactersTest() {
		assertFalse( validator.isPasswordValid( "a12dd56" ) );
	}

	@Test
	public void consecutivePairTest() {
		assertFalse( validator.isPasswordValid( "1b1bi" ) );
	}

	@Test
	public void consecutiveTriplets() {
		assertFalse( validator.isPasswordValid( "1ab1ab" ) );
	}

	@Test
	public void consecutiveQuadruplets() {
		assertFalse( validator.isPasswordValid( "12ab12ab" ) );
	}

	@Test
	public void consecutiveQuintuplets() {
		assertFalse( validator.isPasswordValid( "abc12abc12" ) );
	}

	@Test
	public void consecutiveSextuplets() {
		assertFalse( validator.isPasswordValid( "abc123abc123" ) );
	}
}
