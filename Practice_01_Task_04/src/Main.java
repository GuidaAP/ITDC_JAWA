import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
//		
//		System.out.println("������� ������ �����: ");
//		
//		String name1 = scanner.nextLine();
//		
//		System.out.println("������� ������ �����:  ");
//		
//		String name2 = scanner.nextLine();
//		
//		System.out.println(name1 + name2 );
		
			/*
			System.out.println("������� ������ �����: ");
			int number1 = scanner.nextInt();
			System.out.println("������� ������ �����: ");
			int number2 = scanner.nextInt();
			System.out.println("number1 + " + "number2 =" + (number1 + number2));
			*/
		
		System.out.println("������� ������ �����: ");
		int number1 = scanner.nextInt();
		
		System.out.println("������� ������ �����: ");
		int number2 = scanner.nextInt();
		
		int sum = number1 + number2; 
						
//		System.out.println(number1 + number2 + sum);
		
		System.out.println(number1 + " + " + number2 + " = " + sum);
	}

}