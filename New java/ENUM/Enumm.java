public class Enumm{
  enum Season{
  WINTER(10),SPRING(12),SUMMER(14),FALL(16);
  private int value;
  private Season(int value){
  	this.value=value;
    } 
  }
	public static void main(String[] args) {
		for(Season s:Season.values()){

			System.out.println(s+": "+s.value);
		}
		
		

	}
}
