import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double km_for_one_day = scanner.nextInt();
		double all_way = scanner.nextInt();
		
		double day = all_way/km_for_one_day;
		
		System.out.println((int) Math.ceil(day));
		
		
	

	}

}
