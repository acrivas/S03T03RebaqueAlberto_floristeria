package floristeria;

public class Main {

	public static void main(String[] args) {
		
		FloristsModel model = new FloristsModel("Floristería Margarita");
		FloristsView view = new FloristsView();
		FloristsController controller = new FloristsController(model, view);
		
		controller.createStockItem("árbol", "150", 200);
		controller.eliminateStockItem(1);
		controller.createTicket();
		controller.eliminateTicket(1);
	
	}

}
