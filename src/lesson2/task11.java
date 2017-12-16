package lesson2;

import java.util.Random;

// 11. Удалить из массива (1-е задание) все элементы кратные 3-м
public class task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int x [] = new int [100];
		
		for (int i=0; i<x.length; i++) {
			
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;
		} 
	
		for (int i = 0; i<x.length; i++) {
			if (x[i]%3 ==0) {
				System.out.println("");
			}
			else { 
				System.out.println(x[i]);
			}
			
			}
	
	}

}
