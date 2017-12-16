package lesson2;

import java.util.Random;
public class task112 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 2.2 «аполнить массив размером из 100 элементов случайными целыми числами
		int x [] = new int [100];
		
		for (int i=0; i<x.length; i++) {			
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;
		} 
		
	
		for (int i = 0; i<x.length; i++) {
			System.out.println(x[i]);
			}
	}

}
