public class Basket {
	
	private String name;
	private static int quantity;
	private static double vat;
	private static double price;
	
	
	public Basket ()
	{
		
		this.name = "";
		this.quantity = 0;
		this.vat = 0;
		this.price = 0;
	    
	}
	
	public Basket (String n, int q,  double v, double p)
	{
		name = n;
		quantity = q;
		vat = v;
		price = p;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	 public String toString(){
		   
		   return "\n\nName : " + name + "\nQuantity: "+ quantity + "\nVat: "+ vat+"%"+ "\nPrice: €"+ price +"\n" + "Total Basket Cost: €"+(price*((vat+100)/100))*quantity +"\n";
	   }
	 
	 public static double calc() {
		 return (price*((vat+100)/100))*quantity;
	 }
}
	
