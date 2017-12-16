package lesson2;
// 10. Реализовать считывание ФИО для задачи 9 с клавиатуры 
import java.util.Scanner;

public class task10 {
	
	public static void main(String[] arguments) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 String famil;
		 String username;
		 String otches;
		
	
	 Scanner one = new Scanner (System.in);
	 System.out.println("Введите вашу фамилию ");
	 famil = one.next();
	 System.out.println("Ваше фамилия " + famil);
	 
	 Scanner two = new Scanner (System.in);
	 System.out.println("Введите ваше имя ");
	 username = two.next();
	 System.out.println("Ваше имя " + username);
	 
	 Scanner three = new Scanner (System.in);
	 System.out.println("Введите ваше отчество ");
	 otches = three.next();
	 System.out.println("Ваше отчество " + otches);
	 
	 

 }
	}


