package TreeMap;

public class Laptop implements Comparable<Laptop>{
	
	int ram;
	int price;
	static String brand = "Dell";
	String processor;
	
	public Laptop(int ram, int price, String processor) {
		this.ram=ram;
		this.price=price;
		this.brand=brand;
		this.processor=processor;
	}
	
	@Override
	public String toString() {
		return " Ram " + this.ram + " Price " + this.price +  " Processor " + this.processor ;
	}
	
	public int hashCode() {
		return processor.hashCode();
		}
	
	public boolean equals(Object o) {
		Laptop l = (Laptop)o;
		return  this.price==price;
	}
	
	public int compareTo(Laptop o) {
		return this.price-o.price;
	}
	

}
