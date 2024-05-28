import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Criar{
public static void CriarCatalogo() 
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome da Serie:");
    String nomeFilme = scanner.nextLine();
    File Adicionarfile = new File("catalogo.txt");
        try {
if (Adicionarfile.createNewFile())
    System.out.println("Serie adicionada ao catálogo!" + "\n");
else
    System.out.println("Catálogo já existe.");
    FileWriter writer = new FileWriter(Adicionarfile, true);
        writer.write(nomeFilme + "\n");
        writer.close();
} catch (IOException e) {
    System.out.println("Ocorreu um erro ao adicionar a serie.");
e.printStackTrace();
}
    }
    }
