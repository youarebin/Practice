//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int width, height;
		
		System.out.print("사각형의 가로: ");
		width = sc.nextInt();
		System.out.print("\n");
		System.out.print("사각형의 세로: ");
		height = sc.nextInt();
		
		System.out.print("사각형의 넓이는 " + width * height + "입니다.");

	}

}
