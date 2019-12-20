package integer_value_of_a_character;

/*
 * Jason Matthew Wiley
 * 12/11/2019
 * Integer Value of a Character Application
 * 
 * Here’s another peek ahead. In this chapter, you learned about integers and the type 
 * int. Java can also represent uppercase letters, lowercase letters and a considerable 
 * variety of special symbols. Every character has a corresponding integer representation.
 * The set of characters a computer uses together with the corresponding integer 
 * representations for those characters is called that computer’s character set. You 
 * can indicate a character value in a program simply by enclosing that character in 
 * single quotes, as in 'A'. You can determine a character’s integer equivalent by 
 * preceding that character with (int), as in (int) 'A' An operator of this form is 
 * called a cast operator. (You’ll learn about cast operators in Chapter 4.) The 
 * following statement outputs a character and its integer equivalent:
 *  
 * System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
 *  
 * When the preceding statement executes, it displays the character A and the value 65 
 * (from the Unicode® character set) as part of the string. The format specifier %c is a 
 * placeholder for a character (in this case, the character 'A'). Using statements 
 * similar to the one shown earlier in this exercise, write an application that displays 
 * the integer equivalents of some uppercase letters, lowercase letters, digits and 
 * special symbols. Display the integer equivalents of the following: 
 *  
 * A B C a b c 0 1 2 $ * + / and the blank character.
 */

public class IntegerValueOfACharacter 
{
	public static void main(String[] args) 
	{
		//print to use A int equivalent
		System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
		//print to use B int equivalent
		System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
		//print to use C int equivalent
		System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
		//print to use a int equivalent
		System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
		//print to use b int equivalent
		System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
		//print to use c int equivalent
		System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
		//print to use 0 int equivalent
		System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
		//print to use 1 int equivalent
		System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
		//print to use 2 int equivalent
		System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
		//print to use $ int equivalent
		System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
		//print to use * int equivalent
		System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
		//print to use + int equivalent
		System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
		//print to use / int equivalent
		System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
		//print to use blank character int equivalent
		System.out.printf("The character %c has the value %d%n", ' ', ((int) ' '));
	}
}