
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
    
    public void addToStock(StockItem item) throws IOException {
    	//Falta método para crear el directorio donde se guardará el archivo stock.txt


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
    
	public void createMasterFile (String name) throws IOException {
		Path floristsFolder = Paths.get(System.getProperty("user.home"), PROGRAM_NAME, name);
		Files.createDirectories(floristsFolder);
		System.out.println("Carpeta floristería " + floristsFolder.toString() + " creada");
		String master = floristsFolder.toString() + "\\" + name + "_master.txt";
		File masterFile = new File(master);
		masterFile.createNewFile();
		System.out.println("Archivo maestro " + master + " creado");
		FileWriter fileWriter = new FileWriter(master, true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print("Floristería: " + name +"\n");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		printWriter.print(now);
		printWriter.close();
		
//		File parentFolder = new File(System.getProperty("user.home") + File.separator + PROGRAM_NAME);
//		File floristsFolder = new File(parentFolder, name);
//		String floristsFolderString = floristsFolder.toString();
//		boolean floristsFolderCreated = floristsFolder.mkdirs();
//		System.out.println("Carpeta floristería: " + floristsFolderString);
//		if (floristsFolderCreated) {
//			String master = floristsFolderString + "\\" + name + "_master.txt";
//			File masterFile = new File(master);
//			boolean fileCreated = masterFile.createNewFile();
//			if(fileCreated) {
//				System.out.println("Archivo maestro " + master + " creado");
//				FileWriter fileWriter = new FileWriter(master, true);
//				PrintWriter printWriter = new PrintWriter(fileWriter);
//				printWriter.print("SKU          TYPE          DESCR          VALUE     UNITS");
//		    	printWriter.close();
//			} else {
//				System.out.println("El archivo maestro no se ha podido crear.");
//			}
//		} else {
//			System.out.println("La carpeta " + floristsFolderString + " no se ha podido crear.");
//		}
			

	}
	
	public void createStockFile(String name) {
		System.out.println("Archivo stock creado");
	}
	
	public void createTicketsFile(String name) {
		System.out.println("Archivo tickets creado");
	}
    
    
}
