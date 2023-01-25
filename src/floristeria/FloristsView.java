package floristeria;

public class FloristsView {
	
	private String name;
	private final String PROGRAM_NAME;
	
	public FloristsView(String name) {
		this.name = name;
		this.PROGRAM_NAME = FloristsController.getPROGRAM_NAME();
	}
	
	public void printFullStock() {
        System.out.println("Imprime todo el stock");
    }
	
	public void printItems(){
        System.out.println("Imprime la cantidad de cada artículo en stock");
    }
	
	public void printTickets(){
        System.out.println("Imprime todos los tickets");
    }
	
	public void printStockValue(){
        System.out.println("Imprime valor del stock");
    }
	
	public void printTicketsValue(){
        System.out.println("Imprime el valor total de todos los tickets");
    }

	@Override
	public String toString() {
		return "FloristsView [name=" + name + "]";
	}

}
