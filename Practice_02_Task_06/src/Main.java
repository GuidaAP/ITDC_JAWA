import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� ����������� �������� ? ");
        int min = scanner.nextInt();
        
        System.out.print("������� ������������ �������� ? ");
		int max = scanner.nextInt();
		
		int random_mix = min + (int) (Math.random()*max);
		
//		??? int random_min = min + (int) (Math.random()*max);
//		??? int random_max = min  (int) (Math.random()*max);
		
		System.out.println("��������� ����� �� " + min + " �� " +  max + ":" + " " + random_mix);
		
//		??? System.out.printf("�������� ����� ��" + min + "��" +  max + ":" + " " + Math.random(min, max);

	}

}
