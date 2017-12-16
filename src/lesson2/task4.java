package lesson2;
// 5. Посчитать разность всех не четных элементов массива
import java.util.Random;
public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x [] = new int [100];
		
		for (int i=0; i<x.length; i++) {
			
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;
		}
	
		int lo =0;
		
		for (int i = 0; i<x.length; i++) {
			if (x[i]%2 !=0) {
				lo= lo - x[i];
			
			}
			
	}
		System.out.println(lo);
	}
}
