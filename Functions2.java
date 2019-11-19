/**
	This exercise involves implementing several methods. Stubs for each method
	with documentation are given here. It is your task to fill out the code in
	each method body so that it runs correctly according to the documentation.

	You should create a main method to run and test your methods.
	Example inputs with output are provided in the comments before each method.
	At a minimum, your solutions must pass these tests.
	@OriginalAuthor Bruce Gooch
	@author Robert Lightfoot (this update)
	@version 11/12/2018

	Make Sure you add your name and UIN

	**/
//import NOTICE: Imports are not allowed for this assignments!

public class Functions2
{

	/**
		Given an int and an array of ints, return true if the array contains the int, false otherwise.

		hasInt(7, {1, 7, 3}) -> true
		hasInt(3, {1, 2, 4, 5}) -> false
		hasInt(4, {5, 3, 6, 1, 4}) -> true
	**/
	public static boolean hasInt(int number, int[] numbers) {
		int number1 = number;
	  int	numbers1 [] = numbers;
		 for (int i = 0; i < numbers.length; 	i++ ) {
			 if ( number1 == numbers1 [i]) {
				 return true;
			 }
		 }
		 return false;

	}//end hasInt


	/**
		Given a String and an array of Strings, return true if the array contains the String, false otherwise.
		Note: Capital letters count

		hasString("fizz", {"fizz", "buzz", "bang", "boom"}) -> true
		hasString("Fizz", {"fizz", "buzz", "bang", "boom"}) -> false
		hasString("fizz", {"buzz", "bang", "boom"}) -> false
		hasString("buzz", {"1", "2", "$$#%^", "pico"}) -> false
		hasString("4", {"5", "3", "6", "1", "4"}) -> true
	**/
	public static boolean hasString(String paramString, String[] strings) {
		//your code here
		return false;
	}//end hasString


	/**
		Given an an array of ints, return the largest int in the array.

		maxInt({1, 7, 3}) -> 7
		maxInt({1, 2, 4, 5}) -> 5
		maxInt({5, 3, 6, 1, 4}) -> 6
	**/
	public static int maxInt(int[] numbers) {

int max = numbers[0];
int i = 0;
while (i < numbers.length) {
	if(numbers[i]>max){
		max = numbers[i];

	}
	i++;
}
return max;

	}//end maxInt


	/**
		Given an array of Strings, return the first String in alphabetical order.
		Note: Capital letters count

		firstString({"fizz", "buzz", "bang", "boom"}) -> "bang"
		firstString({"Fizz", "buzz", "bang", "boom"}) -> "fizz"
		firstString({"1", "2", "$$#%^", "pico"}) -> "$$#%^"
		firstString({"5", "3", "6", "1", "4"}) -> "1"
	**/
	public static String firstString(String[] strings) {
	//String string1 = string.toLowerCase()
	for (int i = 0 ; i < strings.length ; i++)
	{
		if (strings[i].equals(firstString))
  {


			return i;
		}
		}
		return -1;



	}//end firstString


	/**
		Given an array of Strings, return an array with the length of the longest string

		longestString({"a", "big", "fat", "cat"}) -> 3
		longestString({"Fizz", "buzz", "bang", "boom"}) -> 4
		longestString({"1", "2", "$$#%^", "pico"}) -> 5
		longestString({"5", "3", "6", "1", "4"}) -> 1
		longestString("These", "Are", "the", "Good", "Old", "days") -> 5
	**/
	public static int longestString(String[] strings) {
		int maxLength = 0;
		String longestString  = null;
		for (String s : strings ) {
			if (s.length > maxLength) {
				maxLength = s.length();
			}
			}
		return longestString.length();
	}//end longestString


	/**
		Given an int and an array of ints, return -1 if the array does not contain the int
		Otherwise return the position of the int in the array.

		placeInt(7, {7, 3}) -> 0
		placeInt(7, {2, 7, 3}) -> 1
		placeInt(3, {1, 2, 4, 5}) -> -1
		placeInt(4, {5, 3, 6, 1, 4}) -> 4
	**/
	public static int placeInt(int number, int[] numbers) {
		//your code here
		return 0;
	}//end placeInt


	/**
		Given a String and an array of Strings, return -1 if the array does not contain the String
		Otherwise return the position of the String in the arary.

		placeString("fizz", {"fizz", "buzz", "bang", "boom"}) -> 0
		placeString("buzz", {"fizz", "buzz", "bang", "boom"}) -> 1
		placeString("bang", {"fizz", "buzz", "bang", "boom"}) -> 2
		placeString("boom", {"fizz", "buzz", "bang", "boom"}) -> 3
		placeString("Fizz", {"fizz", "buzz", "bang", "boom"}) -> -1
		placeString("fizz", {"buzz", "bang", "boom"}) -> -1
		placeString("buzz", {"1", "2", "$$#%^", "pico"}) -> -1
		placeString("4", {"5", "3", "6", "1", "4"}) -> 4
	**/
	public static int placeString(String paramString, String[] strings) {
		//your code here
		return 0;
	}//end placeString


	/**
		Given two ints, return an int array containing the ints in value order.

		array2Ints(7, 3) -> {3, 7}
		array2Ints(7, 7) -> {7, 7}
		array2Ints(3, 7) -> {3, 7}
		array2Ints(3, -4) -> {-4, 3}
	**/
	public static int[] array2Ints(int firstNumber, int secondNumber) {
		//your code here
		return new int[1];
	}//end array2Ints


	/**
		Given two Strings return a String array containing the strings in alphabetical order.
		Note: Capital letters count

		array2Strings("washington", "irving") -> {"irving", "washington"}
		array2Strings("washington", "Irving") -> {"Irving", "washington"}
		array2Strings("Washington", "irving") -> {"Washington", "irving"}
		array2Strings("washington", "Washington") -> {"Washington", "washington"}
	**/
	public static String[] array2Strings(String firstString, String secondString) {
		//your code here
		return new String[1];
	}//end array2Strings


	/**
		Given an int and an array of two ints, return an array of 3 ints sorted in value order.

		sort3Ints(5, {3, 7})  ->  {3, 5, 7}
		sort3Ints(7, {5, 3})  ->  {3, 5, 7}
		sort3Ints(3, {3, 3})  ->  {3, 3, 3}
		sort3Ints(3, {3, -4}) ->  {-4, 3, 3}
	**/
	public static int[] sort3Ints(int intValue, int[] intArray) {
		//your code here
		return new int[1];
	}//end sort3Ints


	/**
		Given a String and an array of two Strings,
		return a three String array containing the strings in alphabetical order.
		Note: Capital letters count

		sort3Strings("wallace", {"washington", "irving"}) -> {"irving", "wallace", "washington"}
		sort3Strings("wallace", {"washington", "Irving"}) -> {"Irving", "wallace", "washington"}
		sort3Strings("Washington", {"irving", wallace"}) -> {"Washington", "irving", "wallace"}
		sort3Strings("washington", {"washington", "Washington"}) -> {"Washington", "washington", "washington"}
	**/
	public static String[] sort3Strings(String stringValue, String[] stringArray) {
		//your code here
		return new String[1];
	}//end sort3Strings


	/**
		Given two int arrays of length two, return a length four int array containing the ints in value order.
		Hint: use your array2Ints method

		merge2Ints({3, 4}, {1, 2})  -> {1, 2, 3, 4}
		merge2Ints({1, 2}, {3, 4})  -> {1, 2, 3, 4}
		merge2Ints({7, 7}, {7, 7})  -> {7, 7, 7, 7}
	**/
	public static int[] merge2Ints(int[] firstNumbers, int[] secondNumbers)
	{
		int[] returnValue = new int[2];
		//your code here
		 return returnValue;
	}//end merge2Ints


	/**
		Given two Strings return a String array containing the strings in alphabetical order.
		Note: Capital letters count
		Hint: use your array2Strings method

		merge2Strings({"a", "b"}, {"c", "d"}) -> {"a", "b", "c", "d"}
		merge2Strings({"a", "b"}, {"c", "D"}) -> {"D", "a", "b", "c"}
		merge2Strings({"d", "c"}, {"b", "a"}) -> {"a", "b", "c", "d"}
		merge2Strings({"My", "Dear"}, {"Aunt", "Sally"}) -> {"Aunt", "Dear", "My", "Sally"}
		merge2Strings({"my", "dear"}, {"Aunt", "Sally"}) -> {"Aunt", "Sally", "dear", "my"}
		merge2Strings({"Irving", "washington"}, {"Irving", "berlin"})  -> {"Irving", "Irving", "berlin", "washington"}
	**/
	public static String[] merge2Strings(String[] firstStrings, String[] secondStrings) {
		//your code here
		return new String[1];
	}//end merge2Strings


	/**
		Given an int array, return true if the array contains duplicate values.

		duplicateInts({3})  -> false
		duplicateInts({1, 2})  -> false
		duplicateInts({7, 7})  -> true
		duplicateInts({1, 2, 3, 4, 5})  -> false
		duplicateInts({1, 2, 3, 2, 4, 5})  -> true
	**/
	public static boolean duplicateInts(int[] numbers) {
		//your code here
		return false;
	}//end duplicateInts


	/**
		Given a String array, return true if the array contains duplicate values.
		Note: Capital letters count

		duplicateStrings({"a"}) -> false
		duplicateStrings({"a", "b", "c", "d"}) -> false
		duplicateStrings({"a", "a"})  -> true
		duplicateStrings({"A", "a"})  -> false
		duplicateStrings({"these", "are", "the", "times"}) -> false
		duplicateStrings({"these", "are", "the", "times", "they", "are"}) -> true
		duplicateStrings({"my", "dear"}, {"Aunt", "Sally"}) -> {"Aunt", "Sally", "dear", "my"}
		duplicateStrings({"Irving", "washington"}, {"Irving", "berlin"})  -> {"Irving", "Irving", "berlin", "washington"}
	**/
	public static boolean duplicateStrings(String[] strings) {
		//your code here
		return false;
	}//end duplicateStrings

	/**
		Given an int array, return an int array with duplicate ints removed if the array contains duplicate values.

		removeDuplicateInts({3})  -> {3}
		removeDuplicateInts({1, 2})  -> {1, 2}
		removeDuplicateInts({7, 7})  -> {7}
		removeDuplicateInts({1, 7, 1, 7, 1})  -> {1, 7}
		removeDuplicateInts({1, 2, 3, 4, 5})  -> {1, 2, 3, 4, 5})
		removeDuplicateInts({1, 2, 3, 2, 4, 2, 5, 2})  -> {1, 2, 3, 4, 5}
	**/
	public static int[] removeDuplicateInts(int[] numbers) {
		//your code here
			return numbers;
		} // end removeDuplicateInts


	/**
		Given a String array, return an String array with duplicate Strings removed if the array contains duplicate values.
		Note: Capital letters count

		removeDuplicateStrings({"a"}) -> {"a"}
		removeDuplicateStrings({"a", "b", "c", "d"}) -> {"a", "b", "c", "d"}
		removeDuplicateStrings({"a", "a"})  -> {"a"}
		removeDuplicateStrings({"A", "a"})  -> {"A", "a"}
		removeDuplicateStrings({"these", "are", "the", "times"}) -> {"these", "are", "the", "times"}
		removeDuplicateStrings({"these", "times", "are", "the", "times", "they", "are"}) -> {"these", "times", "are", "the", "they"})
	**/
	public static String[] removeDuplicateStrings(String[] strings) {
		//your code here
			return strings;
		}//end removeDuplicateStrings


	/**
		Given two int arrays return true if the arrays contain the same values in the same order.
		Note: Order matters, see the third example

		compare2IntArrays({3, 4}, {1}) -> false
		compare2IntArrays({1, 2}, {1, 2}) -> true
		compare2IntArrays({1, 2}, {2, 1}) -> false
		compare2IntArrays({1, 2, 3, 4}, {1, 2, 3, 4}) -> true
	**/
	public static boolean compare2IntArrays(int[] firstNumbers, int[] secondNumbers) {
		//your code here
			return false;
		}//end compare2IntArrays


	/**
		Given two String arrays return true if the arrays contain the same values in the same order.
		Note: Order matters, see the forth example
		Note: Capatil letters matter, see the final example

		compare2StringArrays({"and"}, {"or"})  -> false
		compare2StringArrays({"and", "but"}, {"or"})  -> false
		compare2StringArrays({"a", "b", "c", "d"}, {"a", "b", "c", "d"})  -> true
		compare2StringArrays({"a", "b", "c", "d"}, {"d", "c", "b", "d"})  -> false
		compare2StringArrays({"a", "b", "c", "d"}, {"A", "b", "C", "d"})  -> false
		compare2StringArrays({"Aunt", "Sally"}, {"Aunt", "Sally"}) -> true
		compare2StringArrays({"Aunt", "Sally"}, {"Aunt", "sally"}) -> false
	**/
	public static boolean compare2StringArrays(String[] firstStrings, String[] secondStrings) {
		//your code here
			return false;
		}//end TESTcompare2StringArrays


}//end Functions2
