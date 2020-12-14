public class Items {
	
	private String name;
	private String type;
	private String exDate;
	private int quantity;
	private String uniqueID;
	
	
	public Items ()
	{
		
		this.name = "";
		this.type = "";
		this.exDate = "";
		this.quantity = 0;
	    this.uniqueID = "";
	}
	
	public Items (String n, String t,  String e, int q, String i)
	{
		name = n;
		type = t;
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
	
	
	
	public String getExDate(){
		return this.exDate;
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
	
	public void setExDate(String e)
	{
		this.exDate = e;
	}
	
	public void setQuantity(int q){
		this.quantity = q;
	}
	
	public void setUniqueID(String i){
		this.uniqueID = i;
	}
	
   public String toString(){
	   
	   return "\n\nItem : " + name + "\nType: " + type + "\nexDate"+ exDate + "\nQuantity"+ quantity+ "\nUniqueID"+ uniqueID +"\n";
   }
}



