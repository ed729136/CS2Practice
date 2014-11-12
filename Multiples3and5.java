public class Multiples3and5
{
	public static int multiples()
	{
		int sum = 0;
		for( int i = 0; i < 1000; ++i )
		{
			if( i % 3 == 0 || i % 5 == 0 )
			{
				sum += i;
			}
		}
		return sum;
	}
	public static void main( String[] args )
	{
		int num = multiples();
		System.out.println( num );
	}
}
