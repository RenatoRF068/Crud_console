import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int acao;
        do{
System.out.println("\n");
System.out.println("**Catálogo de Series**");
System.out.println("1. Adicionar Serie");
System.out.println("2. Ver catálogo completo");
System.out.println("3. Atualizar catálogo");
System.out.println("4. Deletar Serie");
System.out.println("5. Fechar Programa");
    acao = scanner.nextInt();
    switch (acao) {
    case 1:
    Criar.CriarCatalogo();
        break;
    case 2:
    Ler.MostrarCatalogo();
        break;
    case 3:
    Atualizar.AtualizarCatalogo();
        break;
    case 4:
    Deletar.DeletarFilme();
        break;
    case 5:

System.out.println("Programa encerrado");
break;
default:
System.out.println("Opção inválida, digite novamente.");
}
    }
while(acao != 5);
}
    
}