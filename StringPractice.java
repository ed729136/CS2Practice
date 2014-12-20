import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;

public class StringPractice
{
	// Algorithm to determine if a string has all unique characters, used a character array for implementation
	public static boolean UniqueCharacters( String str )
	{
		//Count lower and upper case letters as the same letter
		char[] letters = str.toLowerCase().toCharArray();
		//Sort all the letters alphabetically
		Arrays.sort( letters );
		
		//If the letter at the index being looked at and the following index are the same
		//then that means letters are repeated therefore not unique
		for( int i = 0; i < letters.length - 1; ++i )
		{
			if( letters[ i ] == letters[ i + 1 ] )
			{
				System.out.println( "This string does not contain unique characters" );
				return false;
			}
		}
		System.out.println( "This string does contain unique characters" );
		return true;
	}
	
	//NEED TO FIGURE OUT WHY THIS WORKS
	public static boolean Unique( String str )
	{
		int checker = 0;
		int lengthOfString = str.length();
		for( int i = 0; i < lengthOfString; ++i )
		{
			int val = str.charAt( i );
			if( ( checker & ( 1 << val ) ) > 0 )
			{
				System.out.println( "This string does not contain unique characters" );
				return false;
			}
			checker |= (1 << val);
		}
		System.out.println( "This string does contain unique characters" );
		return true;
	}
	
	public static void ReverseString( String str )
	{
		int length = str.length();
		String reverse = "";
		
		for( int i = length - 1; i >= 0; --i )
		{
			reverse = reverse + str.charAt( i );
		}
		System.out.println( reverse );
	}
	
	public static boolean StringPermuation( String str1, String str2 )
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int stringLength = str1.length();
		
		if( str1.length() != str2.length() )
		{
			System.out.println( "These two strings are not a permuation of each other" );
			return false;
		}
		
		for( int i = 0; i < stringLength; ++i )
		{
			if( str1.charAt( i ) != str2.charAt( i ) )
			{
				System.out.println( "These two strings are not a permuation of each other" );
				return false;
			}
		}
		System.out.println( "These two strings are a permuation of each other" );
		return true;
	}
	
	public static void ReplaceSpaces( String str )
	{
		if( str.contains( " " ) )
		{
			str = str.replace( " ", "%20" );
		}
		System.out.println( str );
	}
	
	public static String CountRepeatedCharacters( String str )
	{
		String newString = "";
		int counter = 1;
		int length = str.length();
		char last = str.charAt( 0 );
		
		for( int i = 1; i < length; ++i )
		{
			if( str.charAt( i ) == last ) counter++;
			
			else
			{
				newString += last + "" + counter;
				last = str.charAt( i );
				counter = 1;
			}
		}
		return newString + last + counter;
	}
	
	public static StringBuffer CountRepeatedCharactersBetter( String str )
	{
		StringBuffer stringbuff = new StringBuffer();
		int counter = 1;
		char last = str.charAt( 0 );
		int length = str.length();
		
		for( int i = 1; i < length; ++i )
		{
			if( str.charAt( i ) == last ) counter++;
			
			else
			{
				stringbuff.append( last ).append( counter );
				counter = 1;
				last = str.charAt( i );
			}
		}
		
		return stringbuff.append( last ).append( counter );
	}
	
	public static void main( String[] args )
	{
//		UniqueCharacters( "Help" );
		Unique( "Mm" );
//		StringPermuation( "Hello", "HELLO" );
//		System.out.print( "This is the string backwards: " );
//		ReverseString( "Supercalifragilisticexpialidocious" );
//		ReplaceSpaces( "This is a string that I hope I can replace white spaces with (%20)." );
		System.out.println( CountRepeatedCharacters( "aaaaabbcccccaaaaa" ) );
		System.out.println( CountRepeatedCharactersBetter( "aaaaabbcccccaaaaa" ) );
	}

}