import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� ������������� �����? ");
		
		int number = scanner.nextInt();
		
		int a = number / 1000;
		int b = number / 100 % 10;
		int c = number / 10 % 10;
		int d = number % 10;
		
		int sum = a+b+c+d;
		
		// TODO: naity summu znokovyh chisel
		
		System.out.printf("����� ���� ���� ����� %d  ����� %d", number, sum);
		
	}
}	