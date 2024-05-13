import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions*;

public class  AgeCalculatorTest{

	@Test
	public void testDateOfBirth(){
	AgeCalculator ageCheck = new AgeCalculator;
	String date = "02/04/2008";
	int age = 15;
	assertEquals(age, ageCheck.calculateAge(date))
	
	}