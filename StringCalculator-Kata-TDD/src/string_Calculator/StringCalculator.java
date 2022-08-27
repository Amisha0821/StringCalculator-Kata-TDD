/*1. In a test-first manner, create a simple class named StringCalculator and a method
int add(String numbers)

	1. The method can take numbers as a string separated by comma and will return their sum (for an 
		empty string, it will return 0). For example:

	Input: ""
	Output: 0
	
	Input: "1"
	Output: 1

	Input: "1,2"
	Output: 3

	2. Start with the simplest test case of an empty string and move to one & two numbers.
	3. Remember to solve things as simply as possible so that you force yourself to write tests you did 
		not think about
	4. Remember to refactor after each passing test.
*/

package string_Calculator;

public class StringCalculator {
	
	public static int add(String Numbers)
	{
		if (Numbers.isEmpty())
			return 0;
		else if (Numbers.contains(",")) {
			String[] number = Numbers.split(",");
			return Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
		}
		else
			return Integer.parseInt(Numbers);	
	}
}
