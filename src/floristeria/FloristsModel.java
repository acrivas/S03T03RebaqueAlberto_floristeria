
package floristeria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FloristsModel {
	
	private static String name;
    private double stockValue;
    private double ticketsValue;
    private final String PROGRAM_NAME;
    
    public FloristsModel(String name) {
        this.name = name;
        this.stockValue = 0d;
        this.PROGRAM_NAME = FloristsController.getPROGRAM_NAME();
    }
    
    public void addToStock(StockItem item, int units) throws IOException {
    	Path stockPath = Paths.get(System.getProperty("user.home"), PROGRAM_NAME, name, name + "_stock.txt");
    	FileWriter fileWriter = new FileWriter(stockPath.toString(), true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print(item.getSku() + " " + item.getType() + "  " + item.getDescr() + "  " + item.getValue() + "   " + units + "\n");
		printWriter.close();
    	System.out.println(units + " unidad(es) del artículo " + item + " añadida(s) al stock");
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
    
	public void createMasterFile (String name) throws IOException {
		Path floristsFolder = Paths.get(System.getProperty("user.home"), PROGRAM_NAME, name);
		Files.createDirectories(floristsFolder);
		System.out.println("Carpeta floristería " + floristsFolder.toString() + " creada");
		String master = floristsFolder.toString() + "\\" + name + "_master.txt";
		File masterFile = new File(master);
		masterFile.createNewFile();
		System.out.println("Archivo maestro " + master + " creado");
		FileWriter fileWriter = new FileWriter(master);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print("Floristería: " + name +"\n");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		printWriter.print(now);
		printWriter.close();
	}
	
	public void createStockFile(String name) throws IOException {
		Path stockPath = Paths.get(System.getProperty("user.home"), PROGRAM_NAME, name, name + "_stock.txt");
		File stockFile = new File(stockPath.toString());
		stockFile.createNewFile();
		System.out.println("Archivo " + stockFile.toString() + " creado");
		FileWriter fileWriter = new FileWriter(stockFile.toString());
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print("SKU       TYPE   DESCR VALUE UNITS\n");
		printWriter.close();
	}
	
	public void createTicketsFile(String name) throws IOException {
		Path ticketsPath = Paths.get(System.getProperty("user.home"), PROGRAM_NAME, name, name + "_tickets.txt");
		File ticketsFile = new File(ticketsPath.toString());
		ticketsFile.createNewFile();
		System.out.println("Archivo " + ticketsFile.toString() + " creado");
		FileWriter fileWriter = new FileWriter(ticketsFile.toString());
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print("NO. VALUE");
		printWriter.close();
	}
    
}
