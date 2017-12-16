package lesson2;
import java.util.Random;
public class task14 {
// 14. Найти и вывести из массива все элементы из диапазона 25-50
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x [] = new int [100];
		
		for (int i=0; i<x.length; i++) {
			
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;
		}
	
		for (int i = 0; i<x.length; i++) {
			if (25<x[i])
				if (x[i]<50)
			System.out.println(x[i]);
			}
	
	} 
 
}
