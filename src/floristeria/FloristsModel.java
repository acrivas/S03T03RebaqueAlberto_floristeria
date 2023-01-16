package floristeria;

public class FloristsModel {
	
	private static String name;
    private double stockValue;
    private double ticketsValue;
    
    public FloristsModel(String name) {
        this.name = name;
        this.stockValue = 0;
    }
    
    public void addToStock(StockItem item) {
      System.out.println("Artículo añadido al stock");
    }
    
    public void removeFromStock(int sku) {
      System.out.println("Artículo eliminado del stock");
    }
    
    public void addTicketToList(Ticket ticket) {
      System.out.println("Ticket archivado");
    }
    
    public void removeTicketFromList(int ticketNumber) {
      System.out.println("Ticket eliminado");
    }
    
    public static String getName() {
        return name;
    }
    
    public double getStockValue() {
        return stockValue;
    }
    
}
