
package floristeria;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FloristsModel {
	
	private static String name;
    private double stockValue;
    private double ticketsValue;
    
    public FloristsModel(String name) {
        this.name = name;
        this.stockValue = 0d;
    }
    
    public void addToStock(StockItem item) throws IOException {
    	Path fileNamePath = Paths.get(System.getProperty("user.home"), FloristsModel.getName(), FloristsModel.getName() + "_stock.txt");
    	String fileNameString = fileNamePath.toString();
    	//Falta método para crear el directorio donde se guardará el archivo stock.txt
//    	String fileNameString = "C:\\Floristeria_Margarita\\stock.txt";
    	FileWriter fileWriter = new FileWriter(fileNameString, true);
    	PrintWriter printWriter = new PrintWriter(fileWriter);
    	printWriter.print(item.getSku() + " " + item.getType() + " " + item.getDescr() + " " + item.getValue() + " " + 1);
    	printWriter.close();
    	System.out.println("Artículo " + item + " añadido al stock");
    }
    
    public void removeFromStock(int sku) {
      System.out.println("Artículo sku=" + sku + " eliminado del stock");
    }
    
    public void addTicketToList(Ticket ticket) {
      System.out.println("Ticket creado y archivado");
    }
    
    public void removeTicketFromList(int ticketNumber) {
      System.out.println("Ticket " + ticketNumber + ""
      		+ " eliminado");
    }
    
    public static String getName() {
        return name;
    }
    
    public double getStockValue() {
        return stockValue;
    }

	@Override
	public String toString() {
		return "FloristsModel [stockValue=" + stockValue + ", ticketsValue=" + ticketsValue + "]";
	}
    
	public void createMasterFile (String name) {
		System.out.println("Archivo master creado");
	}
	
	public void createStockFile(String name) {
		System.out.println("Archivo stock creado");
	}
	
	public void createTicketsFile(String name) {
		System.out.println("Archivo tickets creado");
	}
    
    
}
