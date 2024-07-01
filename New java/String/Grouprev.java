import java.util.Scanner;

public class Grouprev {

	public char[] groupreverse(char[] arr, int s, int last) {
        int x=s;
        int y=last;
		while (last < arr.length) {
			while (s < last  ) {
				char a = arr[s];
				arr[s] = arr[last];
				arr[last] = a;
				s++;
				last--;
			}
			if((y+1)%2==0){
				s=s+y-1;
				last=s+y;

			}
           else{
            s=s+y;
            last=s+y;
        }

		}
		//System.out.println(arr);
		return arr;
	}

	public static void main(String args[]) {
		String str = "123456789123456789";
		char arr[] = str.toCharArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of group:");
		int group = sc.nextInt();

		Grouprev obj = new Grouprev();
		char a[] = obj.groupreverse(arr, 0, group-1);

		System.out.println(a);
	}
}