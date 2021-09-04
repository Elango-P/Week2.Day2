package week2.Day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Test324Le567af978";
		int sum = 0;
		String text1 = text.replaceAll("\\D", "");
		System.out.println(text1);
		
		char[] charArray = text1.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			int num = Character.getNumericValue(charArray[i]);
			sum = sum + num;
		}

		System.out.println("Sum of Digits : " + sum);
	}
	}

