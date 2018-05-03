package abasic.recursive;

public class HanoiMain {

	static int cnt = 0;

	public static void main(String[] args) {

		int n = 3;

		hanoi("시작", "임시", "끝", n);

	}

	public static void hanoi(String a, String b, String c, int n) {
		if (n == 1) {
			++cnt;
			System.out.println(cnt + ">" + a + "기둥 에서 " + c + " 기둥으로 원반 1을 이동");
		} else {
			hanoi(a, c, b, n - 1);
			++cnt;
			System.out.println(cnt + ">" + a + "기둥 에서 " + c + " 기둥으로 원반 " + n + "을 이동");
			hanoi(b, a, c, n - 1);
		}

	}

}
