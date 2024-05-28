import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Ler{
public static void MostrarCatalogo() {
System.out.println("\n");
System.out.println(" **Catálogo de Serie**:");
System.out.println("*********************************");
try {
File catalogoFile = new File("catalogo.txt");
Scanner catalogoScanner = new Scanner(catalogoFile);
while (catalogoScanner.hasNextLine()) {
System.out.println(catalogoScanner.nextLine());
}
catalogoScanner.close();
System.out.println("*********************************");
} catch (IOException e) {
System.out.println("Ocorreu um erro ao ler o catálogo.");
e.printStackTrace();
}
}
}