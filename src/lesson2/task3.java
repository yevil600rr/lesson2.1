package lesson2;
import java.util.Random;
public class task3 {
// 4. Вывести из массива (задание 3) все четные элементы на экран
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x [] = new int [100];
		
		for (int i=0; i<x.length; i++) {
			
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;
		}
	
		for (int i = 0; i<x.length; i++) {
			if (x[i]%2 ==0)
			System.out.println(x[i]);
			}
	
	}
 
}
