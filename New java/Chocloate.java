class Productr{
	private String name,color;
	private int weight,price;
   Productr(String name,String color,int weight,int price){
   	this.name=name;
   	this.color=color;
   	this.weight=weight;
   	this.price=price;
   }

   public String toString(){
   	return "name: "+name+"color: "+color+"weight: "+weight+"price: "+price;
   }
   void setName(String name){
   	this.name=name;
   }
   void setColor(String color){
   	this.color=color;
   }
   void setWeight(int weight){
   	this.weight=weight;
   }
   void setPrice(int price){
   	this.price=price;
   }
    
    String getName(){
    	return name;
    }
    int getWeight(){
    	return weight;
    }
  

}

public class Chocloate{
	
  public static void main(String Args[]){
    
    Productr p =new Productr("nilesh","black",60,2);
      System.out.println(p);

      p.setName("jay");
      p.setColor("kala");
      p.setWeight(59);
      p.setPrice(0);
      System.out.println(p.getName());
      System.out.println(p.getWeight());
      System.out.println(p);

  }
}