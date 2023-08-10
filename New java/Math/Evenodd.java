import java.util.Scanner;
class Evenodd
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int i=1;
		while (i<=n)
     {
     	if(isEven(i++))
     	{
     		System.out.println("Even number");
     	}
     	else
     	{
     		System.out.println("Odd number");

     	}
     	static boolean isEven(int n)
     	{
     		if(n%2==0)
            { return true;
        }
            return false;
     }         

}
}
