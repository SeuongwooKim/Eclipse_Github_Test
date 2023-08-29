import java.util.Scanner;

/*
Q6.
FuctionCollection 클래스(함수 클래스)를 만들고,
곱셈 연산을 수행하는 multiply 함수를 생성해 줍니다.
Coding_Test06 클래스(실행 클래스)를 생성하고,
FuctionCollection 클래스에 있는 multiply 함수를 활용하여
두 정수를 입력 받아서, 곱셈의 결과값을 구현하는
자바 프로그램을 제작하시기 바랍니다
*/

public class Coding_Test06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("곱 연산을 수행할 첫번째 정수를 입력해주세요 ==> ");
		int num1 = scan.nextInt();
		System.out.print("곱 연산을 수행할 두번째 정수를 입력해주세요 ==> ");
		int num2 = scan.nextInt();
		
		FunctionCollection multiply = new FunctionCollection();
		int result = multiply.multiply(num1, num2);
		
		System.out.println("두 정수의 곱셈의 결과값은 = " + result + "입니다.");

	}
}
