//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 마일을 입력하세요: ");
		double mile = sc.nextDouble();
		
		System.out.print(mile + "마일은 " + mile * 1.609 + "킬로미터입니다.");

	}

}
