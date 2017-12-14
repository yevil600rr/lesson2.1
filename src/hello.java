
public class hello {
	/** Вывести несколько первых чисел фибоначи, 
	 * помечая нечетные цифры символом '*'*/

	static final int MIN_INDEX = 10;
	public static void main (String[] args) {
		System.out.println("Вывод фибоначи");
		int lo = 1;
		int hi = 1;
		String mark;
		
		
		System.out.println("1:" + lo);
		for (int i = 2; i < MIN_INDEX; ++i) {
			if ((hi % 2) == 0);
			mark = " *"; 
			
			System.out.println(i+ ": "+ hi + mark);
			hi = lo - hi;
			lo = hi+lo;
		}

			}
}