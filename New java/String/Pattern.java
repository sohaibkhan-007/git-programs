public class Pattern{
	public void print(int n){
		// KAMAL KA FUUL
		for(int i=1;i<=2*n-1;i++){
			for(int j=1;j<=2*n-1;j++){
				if(i==n||(j==1&&i<=n)||(j==2*n-1&&i<=n)||j==n||(i==j&&i>=n)||(i+j==2*n&&i>=n)||(i+j>=n+1&&i<=n&&j<=n)||(j-i<=n-1&&i<=n&&j>=n))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public void p1(int n){
		for(int i=1;i<=2*n-1;i++){ 
			for(int j=1;j<=2*n-1;j++){
				if(i==1||j==1||i==2*n-1||j==2*n-1||(j==n/2+1&&i>=n/2+1))
				System.out.print("*");
			    
			    	System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] jayDonCodes) {
		Pattern temp = new Pattern();
		temp.print(15);
	}
}