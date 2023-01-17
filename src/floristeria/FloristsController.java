package floristeria;

public class FloristsController {
	private FloristsModel model;
    private FloristsView view;
    
    public FloristsController(FloristsModel model, FloristsView view) {
        this.model = model;
        this.view = view;
    }
    
    public void createStockItem(String type, String descr, double price) {
    	StockItem stockItem = new StockItem (type, descr, price);
        model.addToStock(stockItem);
    }
    
    public void eliminateStockItem(int sku) {
    	model.removeFromStock(sku);
    }
    
    public void createTicket() {
    	Ticket ticket = new Ticket();
        model.addTicketToList(ticket);
    }
    
    public void eliminateTicket(int ticketNumber) {
    	model.removeTicketFromList(ticketNumber);
      }
    
    @Override
	public String toString() {
		return "FloristsController [model=" + model + ", view=" + view + "]";
	}
}
