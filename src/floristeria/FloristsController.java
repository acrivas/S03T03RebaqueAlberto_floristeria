package floristeria;

import java.io.IOException;

public class FloristsController {
	private FloristsModel model;
    private FloristsView view;
    
    public FloristsController(String name) {
        FloristsModel model = new FloristsModel(name);
        FloristsView view = new FloristsView(name);
        model.createMasterFile(name);
        model.createStockFile(name);
        model.createTicketsFile(name);
    }
    
    public void createStockItem(String type, String descr, double price) throws IOException {
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
    
    public void showFullStock() {
    	view.printFullStock();
    }
    
    public void showSummaryStock() {
    	view.printItems();
    }
    
    public void showTickets() {
    	view.printTickets();
    }
    
    public void showTicketsValue () {
    	view.printTicketsValue();
    }
    
    @Override
	public String toString() {
		return "FloristsController [model=" + model + ", view=" + view + "]";
	}
}
