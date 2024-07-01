public class Reverse{
	public static void main(String args[]){
		String s="12345678";
		char a[]=s.toCharArray();
		int f=0,g=4,l=g-1;
		while(l<a.length){
        while(f<l){
        	char temp=a[f];
        	a[f]=a[l];
        	a[l]=temp;
        	f++;
        	l--;
        }
        f=g;
        l=f+f;
    }
        System.out.println(a);

	}
	
}