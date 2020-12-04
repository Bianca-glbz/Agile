public class Items {
	
	private String name;
	private String type;
	private int price;
	private int exDate;
	private int quantity;
	private String uniqueID;
	
	
	public Items ()
	{
		
		this.name = "";
		this.type = "";
		this.price = 0;
		this.exDate = 0;
		this.quantity = 0;
		this.uniqueID = "";
	}
	
	public Items (String n, String t, int p, int e, int q, String i)
	{
		name = n;
		type = t;
		price = p;
		exDate = e;
		quantity = q;
		uniqueID = i;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getType(){
		 return this.type;
	 }
	
	public int getPrice(){
		return this.price;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	 
	public String getUniqueID()
	{
		return this.uniqueID;
	}
	public void setName(String n){
		this.name = n;
	}
	
	public void setType(String t){
		this.type = t;
	}
	
	public void setPrice(int p){
		this.price = p;
	}
	
	public void setQuantity(int q){
		this.quantity = q;
	}
	
	public void setUniqueID(String i){
		this.uniqueID = i;
	}
	

}


