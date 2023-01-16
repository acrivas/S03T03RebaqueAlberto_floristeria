package floristeria;

public class SaleItem {
	
	private StockItem stockItem;
	private int units;
	
	public SaleItem (StockItem stockItem, int units) {
		this.stockItem = stockItem;
		this.units = units;
	}

	public StockItem getStockItem() {
		return stockItem;
	}

	public void setStockItem(StockItem stockItem) {
		this.stockItem = stockItem;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "SaleItem [stockItem=" + stockItem + ", units=" + units + "]";
	}

}
