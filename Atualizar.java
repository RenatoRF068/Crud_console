import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Atualizar{
public static void AtualizarCatalogo() {
Scanner scanner = new Scanner(System.in);
System.out.println("\n");
System.out.println("Digite o número da linha que deseja atualizar");
int linha = scanner.nextInt();
System.out.println("Digite o nome da nova serie:");
String novoFilme = scanner.next();
try {
File catalogoFile = new File("catalogo.txt");
Scanner catalogoScanner = new Scanner(catalogoFile);
// Ler o catálogo e armazenar em um vetor
String[] catalogo = new String[100]; // Tamanho arbitrário, ajuste conforme necessário
int linhaAtual = 0;
while (catalogoScanner.hasNextLine()) {
catalogo[linhaAtual] = catalogoScanner.nextLine();
linhaAtual++;
}
catalogoScanner.close();
// Substituir a linha selecionada pelo novo filme
if (linha >= 1 && linha <= linhaAtual) {
catalogo[linha - 1] = novoFilme;
} else {
System.out.println("Linha selecionada não existe no catálogo.");
return;
}
// Escrever o catálogo atualizado de volta no arquivo
FileWriter writer = new FileWriter(catalogoFile);
for (int i = 0; i < linhaAtual; i++) {
writer.write(catalogo[i] + "\n");
}
writer.close();
System.out.println("Serie substituída no catálogo!");
} catch (IOException e) {
System.out.println("Ocorreu um erro ao substituir a serie no catálogo.");
e.printStackTrace();
}
}
}
