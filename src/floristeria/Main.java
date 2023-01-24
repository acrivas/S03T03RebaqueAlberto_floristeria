package floristeria;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		FloristsModel model = new FloristsModel("Floristeria_Margarita");
		FloristsView view = new FloristsView();
		FloristsController controller = new FloristsController(model, view);
		
		try {
			controller.createStockItem("árbol", "150", 200);
		} catch (IOException e) {
			e.printStackTrace();
		}
		controller.eliminateStockItem(1);
		controller.createTicket();
		controller.eliminateTicket(1);
	
		controller.showFullStock();
		controller.showSummaryStock();
		controller.showTickets();
		controller.showTicketsValue();
	}

}
