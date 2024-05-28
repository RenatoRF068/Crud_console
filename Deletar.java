import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Deletar{
public static void DeletarFilme() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n");
    System.out.println("Digite o número da linha a ser deletada:");
    int linha = scanner.nextInt();
        try {
    File catalogoFile = new File("catalogo.txt");
    Scanner catalogoScanner = new Scanner(catalogoFile);
    String[] catalogo = new String[100];
    int linhaAtual = 0;
        while (catalogoScanner.hasNextLine()) {
        catalogo[linhaAtual] = catalogoScanner.nextLine();
        linhaAtual++;
}
        catalogoScanner.close();
        if (linha >= 1 && linha <= linhaAtual) {
        for (int i = linha - 1; i < linhaAtual - 1; i++) {
        catalogo[i] = catalogo[i + 1];
}
        linhaAtual--;
    FileWriter writer = new FileWriter(catalogoFile);
        for (int i = 0; i < linhaAtual; i++) {
        writer.write(catalogo[i] + "\n");
}
        writer.close();
    System.out.println("Linha deletada do catálogo!");
} 
        else {
    System.out.println("Linha selecionada não existe no catálogo.");
}
} 
        catch (IOException e) {
    System.out.println("Ocorreu um erro ao deletar a linha do catálogo.");
        e.printStackTrace();
}
}
}