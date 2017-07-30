
public class RomanNumeralConverter {

	public int toInt(String romanNum) {
		int result=0;
		for (int i = 0; i < romanNum.length(); i++) {
			result += RomanNumeral.valueOf(String.valueOf(romanNum.charAt(i))).value;
					}
	return result;

}
 enum RomanNumeral{
	I(1),V(5),X(10),L(50);
	public int value;

	private RomanNumeral(int value) {
		this.value = value;
	}
	
}
}
