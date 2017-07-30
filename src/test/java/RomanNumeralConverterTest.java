import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanNumeralConverterTest {
	private String inputNum;
	private int expectedResult;
	
	
	
public RomanNumeralConverterTest(String inputNum, int expectedResult) {
		super();
		this.inputNum = inputNum;
		this.expectedResult = expectedResult;
	}

@Parameters(name="input roman numeral={0}, output={1}")
public static Collection<?> setUpData(){
	return Arrays.asList(new Object[][]{{"I",1},{"V",5},{"X",10},{"L",50},{"II",2}});
}

@Test
public void romanNumConverter() throws Exception {
	//arrange
	
RomanNumeralConverter testee = new RomanNumeralConverter ();
	//act
int actual = testee.toInt(inputNum);

	//assert
assertEquals(expectedResult,actual);
}

}
