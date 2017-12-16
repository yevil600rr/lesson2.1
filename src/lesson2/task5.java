package lesson2;
//5. Посчитать количество четных и не четных элементов массива
import java.util.Random;
public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x [] = new int [100];
		
		for (int i=0; i<x.length; i++) {
			
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;
		}
	int min = 0;
	int plu = 0;
	
		for (int i = 0; i<x.length; i++) {
			if (x[i]% 2 ==0) {
				plu = plu+1;
			} else if (x[i]% 2 !=0) {
				min = min +1;
			}
		}
			System.out.println("Четных = " + plu);
			System.out.println("Не четных = " +min);
			}


}