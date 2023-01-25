package floristeria;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FloristsController controller = new FloristsController("Floristeria_Margarita");
				
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
