public class Forloop{
	public static void main(String []args){
		//int a[]=new int[2];
		//a[0]=1;
		//a[1]=2;
		String a[][]=new String[2][3];
		a[0][0]="sohaib";
		a[0][1]="_";
		a[1][0]="khan";
		a[1][1]="_";
		for(String i[]:a){

			for(String j:i){

			System.out.print(j);
			}

		}
	}
}