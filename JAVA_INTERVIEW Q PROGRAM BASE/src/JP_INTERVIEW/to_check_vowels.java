package JP_INTERVIEW;

public class to_check_vowels 
{


			public static void main(String[] args)
			{

				System.out.println(stringContainsVowels("Hello")); // true
				System.out.println(stringContainsVowels("TV")); // false

			}

			public static boolean stringContainsVowels(String input) 
			{

				return input.toLowerCase().matches(".*[aeiou].*");

			}

}


