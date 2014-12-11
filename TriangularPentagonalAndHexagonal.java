import java.math.BigInteger;
import java.util.ArrayList;

public class TriangularPentagonalandHexagonal
{
	//Create storage for n amount of pentagonal numbers
	static ArrayList< BigInteger > pentagonal = new ArrayList<>();
	
	//Create storage for n amount of hexagonal numbers
	static ArrayList< BigInteger > hexagonal = new ArrayList<>();
	
	//Create storage for n amount of triangular numbers
	static ArrayList< BigInteger > triangular = new ArrayList<>();
	
	//Create storage for values that appear in all triangular, pentagonal and hexagonal lists
	static ArrayList< BigInteger > duplicates = new ArrayList<>();

	public static void TriangularNumbers( int startOfTriangular, int triangularNumbersWanted )
	{		
		//Calculate triangular numbers and add them to the list
		for( int i = startOfTriangular; i <= triangularNumbersWanted; ++i )
		{
			BigInteger bigint = BigInteger.valueOf( i );
			BigInteger bigint1 = BigInteger.valueOf( i + 1 );
			BigInteger two = BigInteger.valueOf( 2 );
			BigInteger result = bigint.multiply( bigint1 ).divide( two );
			triangular.add( result );
		}
		//Print n amount of triangular numbers
		//System.out.println( triangular );
	}
	
	public static void PentagonalNumbers( int startOfPentagonal, int pentagonalNumbersWanted )
	{	
		//Calculate pentagonal numbers and add them to the list
		for( int i = startOfPentagonal; i <= pentagonalNumbersWanted; ++i )
		{
			BigInteger bigint1 = BigInteger.valueOf( i );
			BigInteger three = BigInteger.valueOf( 3 );
			BigInteger one = BigInteger.valueOf( 1 );
			BigInteger two = BigInteger.valueOf( 2 );
			BigInteger bigint2 = bigint1.multiply( three ).subtract( one );
			BigInteger bigint3 = bigint1.multiply( bigint2 );
			BigInteger result = bigint3.divide( two );
			pentagonal.add( result );
		}
		//Print n amount of pentagonal numbers
		//System.out.println( pentagonal );
	}
	
	public static void HexagonalNumbers( int startOfHexagonal, int hexagonalNumbersWanted )
	{
		//Calculate hexagonal numbers and add them to the list
		for( int i = startOfHexagonal; i <= hexagonalNumbersWanted; ++i )
		{
			BigInteger one = BigInteger.valueOf( 1 );
			BigInteger bigint = BigInteger.valueOf( i );
			BigInteger bigint1 = BigInteger.valueOf( 2 );
			BigInteger bigint2 = bigint.multiply( bigint1 );
			BigInteger bigint3 = bigint2.subtract( one );
			BigInteger result = bigint.multiply( bigint3 );
			hexagonal.add( result );
		}
		//Print n amount of hexagonal numbers
		//System.out.println( hexagonal );
	}
	
	public static void main( String[] args )
	{
		TriangularNumbers( 1, 80000 );
		PentagonalNumbers( 1, 80000 );
		HexagonalNumbers( 1, 80000 );
		
		System.out.println( "Calculating..." );
		
		for( BigInteger number : triangular )
		{
			if( pentagonal.contains( number )  && hexagonal.contains( number ) )
			{
				duplicates.add( number );
			}
		}
		System.out.println( duplicates );
	}
}