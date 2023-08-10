 clas jms Product{
	private String name,color;
	private int price,weight;
     Product(String n,String c,int p,int w){
     	 name =n;
     	 color=c;
     	 price =p;
     	 weight=w;
     }
     public String toString(){
     	return "name: "+name+"color: "+color+"price: "+price+"weight: "+weight;
     }
    
        void setName(String newname){
         this.name =newname;

         }
         void setColor(String color){
            this.color= color;
         }
           void setPrice(int n){
            this.price= n;
         }
           void setWeight(int w){
            this.weight= w;
         }



     String getName(){
     	return name;
     }
      String getColor(){
        return color;
     }
      int getPrice(){
        return price;
     }
      int getWeight(){
        return weight;
     }
}

public class Task{
	public static void main(String []args){
   Product p=new Product("Dairy milk.","Blue",10,10);
   System.out.println(p);
   p.setName("kitkat");
   p.setColor("Red.");
   p.setPrice(20);
   p.setWeight(25);
   System.out.println(p.getName());
   System.out.println(p.getColor());
   System.out.println(p.getPrice());
   System.out.println(p.getWeight());
   System.out.println(p);
	}
}
