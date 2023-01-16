
package floristeria;

public class StockItem {
	
	private int sku;					//Número identificativo
	private String type;				//Tipo: tree/flower/deco
	private String descr;				//Descriptivo: altura para tree, color para flower y plastic/wood para deco
	private double value;
	
	public StockItem (String type, String descr, double value) {
		this.type = type;
		this.descr = descr;
		this.value = value;
//		this.sku = provideSku();		//Método para asignar un sku a cada artículo de stock (por desarrollar)
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "StockItem [sku=" + sku + ", type=" + type + ", descr=" + descr + ", value=" + value + "]";
	}
	
}
