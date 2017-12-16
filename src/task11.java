
public class task11 {

	// 1. Заполнить масиф х целыми числами и 
	// вывести содержимое массива х на экран
	
	public static void main(String[] args) {
		
		int x[] = new int [10];
		
		for (int i = 0; i<x.length; i++) {
			x[i] = i+1;
		}
		
		for (int i=x.length-1; i>=0; i--) {
			System.out.println (x[i]);
		}
	
	}
	}


