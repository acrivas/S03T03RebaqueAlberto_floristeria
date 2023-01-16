package floristeria;

import java.util.ArrayList;

public class Ticket {
	
	private ArrayList<SaleItem> shoppingList;
	private double ticketValue;
	private int ticketNumber;
	
	public Ticket () {
		this.shoppingList = new ArrayList<SaleItem>();
		this.ticketValue = 0;
//		this.ticketNumber = provideTicketNumber();		//Método para asignar un número de ticket (por desarrollar)
	}

	public ArrayList<SaleItem> getShoppingList() {
		return shoppingList;
	}

	public void setShoppingList(ArrayList<SaleItem> shoppingList) {
		this.shoppingList = shoppingList;
	}

	public double getTicketValue() {
		return ticketValue;
	}

	public void setTicketValue(double ticketValue) {
		this.ticketValue = ticketValue;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	@Override
	public String toString() {
		return "Ticket [shoppingList=" + shoppingList + ", ticketValue=" + ticketValue + ", ticketNumber="
				+ ticketNumber + "]";
	}
	
	public void addSaleItem(SaleItem saleItem) {
		this.shoppingList.add(saleItem);
	}

}
