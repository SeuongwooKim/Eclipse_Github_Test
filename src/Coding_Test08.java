
//다음의 [실행 결과값]과 같이 출력되도록
//if문과 break, continue, for문을 이용해서
//자바 프로그램을 제작하시기 바랍니다.
//
//[실행 결과값]
//0, 2, 4, 6, 8, 10

public class Coding_Test08 {

	public static void main(String[] args) {

		for (int i = 0;; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i);
			if (i == 10) {
				break;
			}
			System.out.print(", ");
		}
	}
}
