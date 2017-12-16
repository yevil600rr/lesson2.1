package lesson2;
//8. Найти максимальный , минимальный элемент среди четных, не четных элементов массива.
import java.util.Random;
public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int chetmax = 0;
	     int nechetmax = 0;
	     int chetmin ;
	     int nechetmin = 1000;
     int x[] = new int [100];
     
     for (int i = 0; i< x.length; i++) {
    	 Random ran = new Random();
    	 int s = ran.nextInt(1000);
    	 x[i]=s;
     }
    
     chetmin = 1000;
     for (int i=0; i< x.length; i++) 
    	 if (x[i]% 2 ==0) 

    	 if (x[i]< chetmin)
    	 {
    		 chetmin = x[i];
    		  } 
     System.out.println("Минимальное четное = " +chetmin);
     for (int i=0; i< x.length; i++) 
    	 if (x[i]% 2 ==0) 

    	 if (x[i]> chetmax)
    	 {
    		 chetmax = x[i];
    		  } 
     System.out.println("Максимальное четное = " + chetmax);
     for (int i=0; i<x.length; i++)
    	 if (x[i] % 2 != 0)
    		 if (x[i]< nechetmin)
    		 { 
    			 nechetmin = x[i];
    		 }
     System.out.println("Минимальное не четное = " + nechetmin);
     for (int i=0; i<x.length; i++)
    	 if (x[i]% 2 !=0)
    		 if (x[i]> nechetmax)
    		 {   
    			 nechetmax = x[i];
    		 }
	System.out.println("Максимальное не четное =" + nechetmax);
	}
}



