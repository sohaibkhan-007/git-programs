public class Arr {
	public static void main(String[] args) {
		int f = 1;
		int s = 2;
		int t = 3;
		int total = 0;
		for (int i = 4; i <= 4; i++) {
			total = f + s + t;
			f = s;
			s = t;
			t = total;
		}
		System.out.println(total);
	}

}