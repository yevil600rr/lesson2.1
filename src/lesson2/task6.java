package lesson2;
// 7. Насти и вывести на экран максмальное/минимальное число
import java.util.Random;
public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int min;
int x [] = new int [100];
		
		for (int i=0; i<x.length; i++) {			
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;
		} 		
		for (int i = 0; i<x.length; i++) {
			if (x[i]>max)
			{
		max=x[i];
			}
		}
			System.out.println("Максимальное число = " +max);
			min = 1000;
			for (int i=0; i<x.length; i++)
			{
				if (x[i]<min) {
					min = x[i];
				}
				
}
	System.out.println("Минимальное число = " + min);
	}
}

